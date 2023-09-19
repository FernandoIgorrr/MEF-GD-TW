package Village.Troops;

public class Troop implements ITroop{
    private final String name;
    private int offensive_strength;
    private int general_defense;
    private int cavalry_defense;
    private int speed;
    private int haul;

    public Troop(String name){
        this.name  = name;
    }
}
