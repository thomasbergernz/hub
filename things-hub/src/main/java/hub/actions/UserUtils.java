package hub.actions;

import hub.types.dynamic.User;
import hub.types.persistent.Person;
import hub.types.persistent.Role;
import hub.types.persistent.Username;
import org.springframework.beans.factory.annotation.Autowired;
import rx.Observable;
import things.thing.Thing;
import things.thing.ThingControl;
import things.thing.TypeRegistry;

import java.util.List;

/**
 * Utilities to help manage, convert and lookup users, usernames and persons.
 * 
 * @author: Markus Binsteiner
 */
public class UserUtils {

	@Autowired
	private ThingControl tc;

	/**
	 * Converts a {@link Username} or {@link Person} thing into a list of
	 * {@link Username} things.
	 * 
	 * Since a user can have multiple accounts for the same system (= key),
	 * multiple outputs are possible for a single input.
	 * 
	 * @param usernameOrPerson
	 *            a thing of type Username or Person
	 * @return list of all usernames
	 */
	public Observable<Thing<Username>> lookupUsernames(Observable<? extends Thing<?>> usernameOrPerson) {

        return usernameOrPerson
                .filter(t -> TypeRegistry.equalsType(t.getThingType(), Person.class) || TypeRegistry.equalsType(t.getThingType(), Username.class))
                .flatMap(t -> convertToUsername(t));
    }

	/**
	 * Converts a {@link Username} or {@link Person} thing into a {@link Person}
	 * thing.
	 * 
	 * In case of a Person input, it will just get passwed through. In case of a
	 * Username input, the database will be searched for the specified username
	 * & key and the parent Person thing will be returned.
	 * 
	 * If more than one results are found, a
	 * {@link things.exceptions.ThingRuntimeException} will be thrown.
	 * 
	 * @param usernameOrPerson
	 *            a thing of type Username or Person
	 * @return the Person thing
	 */
	public Observable<Thing<Person>> convertToPerson(Thing<?> usernameOrPerson) {

		if (TypeRegistry.equalsType(Person.class,
				usernameOrPerson.getThingType())) {
			return Observable.just((Thing<Person>) usernameOrPerson);
		} else {
			Observable<? extends Thing<?>> obs = tc
					.observeParents(usernameOrPerson);
			return tc.filterThingsOfType(Person.class, obs);
		}

	}

	public Observable<Thing<Person>> convertToPerson(Observable<? extends Thing<?>> usernameOrPersons) {
        return usernameOrPersons.flatMap(up -> convertToPerson(up));
    }

	public Observable<Thing<Username>> convertToUsername(
			Thing<?> usernameOrPerson) {

		if (TypeRegistry.equalsType(Username.class,
				usernameOrPerson.getThingType())) {
			return Observable.just((Thing<Username>) usernameOrPerson);
		} else {
			Observable<Thing<Username>> obs = tc.observeChildrenForType(
					Observable.just(usernameOrPerson), Username.class, true);
			return obs;
		}

	}



	public Thing<User> createUser(Thing<Person> person) {
		// TODO make that functional

//        Observable<Thing<Username>> usernames = tc.observeChildrenForType(person, Username.class, true);
//        Observable<Thing<Role>> roles = tc.observeChildrenForType(person, Role.class, true);
//
//        User user = new User();
//		user.setPerson(person.getUsername());
//
//        Thing<User> tu = new Thing<User>();
//        tu.setUsername(user);
//        tu.setValueIsLink(false);
//        tu.setId("person:"+person.getId());
//        tu.setKey(person.getKey());
//        tu.setThingType(TypeRegistry.getType(User.class));
//
//        Observable.merge(usernames, roles).doOnEach()

		List<Thing<Username>> usernames = tc
				.getChildrenForType(person, Username.class, true);
		List<Thing<Role>> roles = tc.getChildrenForType(person,
                Role.class, true);

		User user = new User();
		user.setPerson(person.getValue());

            for (Thing<Username> un : usernames) {
                user.addUsername(un.getKey(), un.getValue().getUsername());
            }
            for (Thing<Role> r : roles) {
                user.addRole(r.getKey(), r.getValue().getRole());
            }

        Thing<User> tu = new Thing<User>();
        tu.setValue(user);
        tu.setValueIsLink(false);
        tu.setId("person:"+person.getId());
        tu.setKey(person.getKey());
        tu.setThingType(TypeRegistry.getType(User.class));

        return tu;
	}

    /**
	 * Assembles a {@link User} object from a {@Person} one.
	 *
	 * @param persons
	 *            the persons
	 * @return the user thing object
	 */
	public Observable<Thing<User>> assembleUsers(Observable<Thing<Person>> persons) {

        return persons.map(p -> createUser(p));

    }


}
