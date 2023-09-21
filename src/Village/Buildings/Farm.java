package Village.Buildings;

import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class Farm extends BuildingImpl{

    public Farm() {
        super(EBuilding.FARM);
    }
    
    @Override
    public Building clone(){
        return new Farm();
    }
}
