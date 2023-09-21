package Village;

import java.util.HashSet;
import java.util.Set;

import Factory.AbstractFactory;
import Factory.FactoryProvider;
import Village.Army.Army;
import Village.Buildings.Farm;
import Village.Buildings.VillageHeadQuarters;
import Village.Buildings.Abstract.BuildingImpl;


public class Village {
    private int population;
    private Set<BuildingImpl> buildings;
    private Army army;

    private AbstractFactory abstractFactory;

    public Village(){
        abstractFactory = FactoryProvider.getFactory("building");
    }

    private int calcPopulation(){{
        return 1;
    }}

    private void buildVillage(){
        this.buildings = new HashSet<>() {
            {
                add(new Farm());
                add(new VillageHeadQuarters());
            }
        };
    }

}
