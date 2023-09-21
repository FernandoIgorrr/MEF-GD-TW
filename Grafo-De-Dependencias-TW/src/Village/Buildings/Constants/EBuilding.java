package Village.Buildings.Constants;

import java.util.HashMap;
import java.util.Map;

public enum EBuilding {
    
    VILLAGE_HEADQUARTERS("village_headquarters",30,null),

    BARRACKS("barracks",25,EBarracks.BARRACKS_DEPENDENCIES),
    
    STABLE("stable",20,null),
    
    WORKSHOP("workshop",15,null),
    
    ACADEMY("academy",1,null),
    
    SMITHY("smithy",20,ESmithy.SMITHY_DEPENDENCY),
    
    RALLY_POINT("rally_point",1,null),
    
    STATUE("statue",1,null),
    
    MARKET("market",25,null),
    
    TIMBER_CAMP("timber_camp",30,null),
    
    CLAY_PIT("clay_pit",30,null),
    
    IRON_MINE("iron_mine",30,null),
    
    FARM("farm",30,null),
    
    WARE_HOUSE("ware_house",30,null),
    
    HIDING_PLACE("hiding_place",10,null),
    
    WALL("wall",20,null);

    private final String NAME;
    private final int MAX_LEVEL;
    private final Map<EBuilding,Integer> DEPENDENCIES; 

    EBuilding(String nAME, int mAX_LEVEL, Map<EBuilding,Integer> dEPENDENCIES){
        NAME            = nAME;
        MAX_LEVEL       = mAX_LEVEL;
        DEPENDENCIES    = dEPENDENCIES;
    }

    public String getName(){
        return this.NAME;
    }

    public int getMaxLevel(){
        return MAX_LEVEL;
    }
}
