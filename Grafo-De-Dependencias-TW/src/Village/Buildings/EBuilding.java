package Buildings;

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
    IRON_MINE("iron_mine",30),
    FARM("farm",30),
    WARE_HOUSE("ware_house",30),
    HIDING_PLACE("hiding_place",10),
    WALL("wall",20);

    private String name;
    private final int MAX_LEVEL;

    EBuilding(String name, int mAX_LEVEL){
        this.name = name;
        MAX_LEVEL = mAX_LEVEL;
    }

    public String getName(){
        return this.name;
    }

    public int getMaxLevel(){
        return MAX_LEVEL;
    }
}
