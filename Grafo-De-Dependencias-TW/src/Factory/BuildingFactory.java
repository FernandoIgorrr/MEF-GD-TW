package Factory;

import Buildings.Building;
import Buildings.VillageHeadQuarters;

public class BuildingFactory implements AbstractFactory<Building>{

    @Override
    public Building build(String name) {
        try{
            if(("village headquarters").equalsIgnoreCase(name)){
                return new VillageHeadQuarters();
            }
        }catch(Exception e){
            return null;
        }
        return null;
    }

    @Override
    public Building recuit(String unity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuit'");
    }
}
