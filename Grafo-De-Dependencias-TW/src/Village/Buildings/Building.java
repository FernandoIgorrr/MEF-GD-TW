package Buildings;

public abstract class Building implements IBuilding{

    public String name;
    private int level;
    private final int MAX_LEVEL;

    public Building(String name, int mAX_LEVEL) {
        this.name   = name;
        this.level  = 1;
        MAX_LEVEL   = mAX_LEVEL;
    }

    @Override
    public void upLevel() {
        this.level++;

        if(this.level > MAX_LEVEL){
            this.level = MAX_LEVEL;
        }
        else if(this.level < 1){
            this.level = 1;
        }
    }
}
