package Village;

import java.util.HashSet;
import java.util.Set;

import Factory.AbstractFactory;
import Factory.FactoryProvider;
import Graph.BuildingGraph;
import Map.Coordinates;
import Map.Interfaces.MapObject;
import Player.Player;
import Village.Army.Army;
import Village.Buildings.Farm;
import Village.Buildings.VillageHeadQuarters;
import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;


public class Village implements MapObject{


    private Coordinates         coordinates;
    private Player               owner;
    private BuildingGraph       BuildingGraph; 
    private Integer             population;
    private Integer             loyalty;
    private Set<BuildingImpl>   buildings;
    private Army                army;

    private AbstractFactory abstractFactory;

    public Village(){
        abstractFactory = FactoryProvider.getFactory("building");
    }

    private int calcPopulation(){{
        return 1;
    }}

    private void buildVillage(){
        Building VILLAGE_HEADQUARTERS = (VillageHeadQuarters)abstractFactory.build(EBuilding.VILLAGE_HEADQUARTERS);

    }
}
