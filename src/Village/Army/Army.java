package Village.Army;

import java.util.Set;

import Village.Units.Abstracts.Unit;

public abstract class Army implements IArmy{
    
    private int number_of_units_in_population;
    private Set<Unit> Units;

    public Army(){

    }

    private void setUnits(){

        this.Units.add(null);
    }
}
