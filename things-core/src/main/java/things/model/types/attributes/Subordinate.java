package things.model.types.attributes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Project: researchHub
 * <p/>
 * Written by: Markus Binsteiner
 * Date: 24/01/14
 * Time: 11:17 AM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Subordinate {

    public Class<?> parentClass();
}