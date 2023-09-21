package Village.Buildings;

import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class Market extends BuildingImpl{
    
    public Market() {
        super(EBuilding.MARKET);
    }
    
    @Override
    public Building clone(){
        return new Market();
    }
}
