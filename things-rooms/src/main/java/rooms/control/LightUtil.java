package rooms.control;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import rooms.model.lights.limitless.LimitlessLEDControllerV2;
import rooms.model.lights.limitless.whiteV2.LightWhiteV2;
import rooms.types.Bridge;
import rooms.types.Light;
import things.thing.Thing;
import things.thing.ThingControl;

import java.util.List;
import java.util.Map;

/**
 * Project: things-to-build
 * <p>
 * Written by: Markus Binsteiner
 * Date: 2/05/14
 * Time: 7:49 PM
 */
public class LightUtil {

    @Autowired
    private ThingControl tc;

    private List<Thing<Bridge>> bridges;
    private Map<String, LightWhiteV2> lights;


    public synchronized List<Thing<Bridge>> getBridges() {
        if ( bridges == null ) {
            bridges = tc.findThingsForType(Bridge.class);
        }
        return bridges;
    }

    public synchronized Map<String, LightWhiteV2> getLights() {
        if ( lights == null ) {
            lights = Maps.newHashMap();
            for ( Thing<Bridge> bridgeThing : getBridges() ) {

                Bridge bridge = tc.getValue(bridgeThing);
                LimitlessLEDControllerV2 c = new LimitlessLEDControllerV2(bridge.getHost(), bridge.getPort());

                List<Thing<Light>> lightThings = tc.getChildsForType(bridgeThing, Light.class);
                for ( Thing<Light> tempLight : lightThings ) {
                    Light ll = tc.getValue(tempLight);
                    LightWhiteV2 white = new LightWhiteV2(tempLight.getKey(), c, ll.getGroup());
                    lights.put(white.getName(), white);
                }

            }
        }
        return lights;
    }

}
