package Village.Units.Constantes;

public enum EUnit {
    
    SPEAR_FIGHTER("spear_fighter",1),
    SWORDSMAN("swordsman",1),
    AXEMAN("axeman",1),
    SCOUT("scout",15),
    LIGHT_CAVALRY("light_cavalry",1),
    HEAVY_CAVALRY("heavy_cavalry",1),
    RAM("ram",1),
    CATAPULT("catapult",1),
    PALADIN("paladin",1),
    NOBLEMAN("nobleman",1);

    private String name;
    private final int MAX_LEVEL;

    EUnit(String name, int mAX_LEVEL){
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
