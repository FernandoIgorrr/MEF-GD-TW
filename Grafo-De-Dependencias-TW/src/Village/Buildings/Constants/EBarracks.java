package Village.Buildings.Constants;

import java.util.HashMap;
import java.util.Map;

public interface EBarracks {
    public final static Map<EBuilding,Integer> BARRACKS_DEPENDENCIES = new HashMap<>(){
        {
            put(EBuilding.VILLAGE_HEADQUARTERS,3);
        }
    };
}
