import Factory.AbstractFactory;
import Factory.FactoryProvider;
import Village.Buildings.VillageHeadQuarters;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class App {
    public static void main(String[] args) throws Exception {

       AbstractFactory abs = FactoryProvider.getFactory("building");

        //EBuilding.SMITHY.
       
       Building building = (VillageHeadQuarters)abs.build(EBuilding.VILLAGE_HEADQUARTERS);

       System.out.println(building);
    }
}
