package Village.Buildings;

import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class WareHouse extends BuildingImpl{
    
    public WareHouse() {
        super(EBuilding.WARE_HOUSE);
    }
    
    @Override
    public Building clone(){
        return new WareHouse();
    }
}
