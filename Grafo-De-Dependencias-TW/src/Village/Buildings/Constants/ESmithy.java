package Village.Buildings.Constants;

import java.util.HashMap;
import java.util.Map;

public interface ESmithy {
    public final static Map<String, EBuilding> SMITHY_DEPENDENCY = new HashMap<>(){
        {
            put(EBuilding.VILLAGE_HEADQUARTERS,5);
            put(EBuilding.BARRACKS,1);
        }
    };
    //private Map<EBuilding,>
}
