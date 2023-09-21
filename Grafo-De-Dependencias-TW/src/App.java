import java.util.HashSet;
import java.util.Set;

import Factory.AbstractFactory;
import Factory.FactoryProvider;
import Graph.BuildingGraph;
import Graph.NodeBuilding;
import Village.Buildings.Farm;
import Village.Buildings.Smithy;
import Village.Buildings.VillageHeadQuarters;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class App {
    public static void main(String[] args) throws Exception {

        AbstractFactory abs = FactoryProvider.getFactory("building");

        Building VILLAGE_HEADQUARTERS = (VillageHeadQuarters)abs.build(EBuilding.VILLAGE_HEADQUARTERS);
        Building VILLAGE_HEADQUARTERS2 = (VillageHeadQuarters)abs.build(EBuilding.VILLAGE_HEADQUARTERS);


        Building SMITHY = (Smithy)abs.build(EBuilding.SMITHY);

        // VILLAGE_HEADQUARTERS.upLevel();
        // VILLAGE_HEADQUARTERS.upLevel();
        // VILLAGE_HEADQUARTERS.upLevel();
        // VILLAGE_HEADQUARTERS.upLevel();
        // VILLAGE_HEADQUARTERS.upLevel();

        // VILLAGE_HEADQUARTERS2.upLevel();
        // VILLAGE_HEADQUARTERS2.upLevel();
        // VILLAGE_HEADQUARTERS2.upLevel();
        // VILLAGE_HEADQUARTERS2.upLevel();
        // VILLAGE_HEADQUARTERS2.upLevel();

    //    System.out.println(building);

    Set<NodeBuilding> leafs = new HashSet<>();
    
   leafs.add(new NodeBuilding(EBuilding.SMITHY));
    

    BuildingGraph bg = new BuildingGraph(leafs);

    System.out.println("\nTamanho: "+bg.roots.size()+"\n");

    //System.out.println("\nEquals: "+VILLAGE_HEADQUARTERS.equals(VILLAGE_HEADQUARTERS2)+"\n");

        //bg.roots.

    }
}
