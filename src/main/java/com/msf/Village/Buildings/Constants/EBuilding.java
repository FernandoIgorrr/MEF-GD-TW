package com.msf.Village.Buildings.Constants;

import java.util.HashMap;
import java.util.Map;

public enum EBuilding {
    
    VILLAGE_HEADQUARTERS("village_headquarters",30),

    BARRACKS("barracks",25),
    
    STABLE("stable",20),
    
    WORKSHOP("workshop",15),
    
    ACADEMY("academy",1),
    
    SMITHY("smithy",20),
    
    RALLY_POINT("rally_point",1),
    
    STATUE("statue",1),
    
    MARKET("market",25),
    
    TIMBER_CAMP("timber_camp",30),
    
    CLAY_PIT("clay_pit",30),
    
    IRON_MINE("iron_mine",30),
    
    FARM("farm",30),
    
    WARE_HOUSE("ware_house",30),
    
    HIDING_PLACE("hiding_place",10),
    
    WALL("wall",20);

    private final String NAME;
    private final int MAX_LEVEL;
   
    EBuilding(String nAME, int mAX_LEVEL){
        NAME            = nAME;
        MAX_LEVEL       = mAX_LEVEL;
    }

    public String getName(){
        return this.NAME;
    }

    public int getMaxLevel(){
        return MAX_LEVEL;
    }
}
