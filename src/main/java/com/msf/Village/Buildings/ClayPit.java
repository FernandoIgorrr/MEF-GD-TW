package Village.Buildings;

import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class ClayPit extends BuildingImpl{
    
     public ClayPit() {
        super(EBuilding.CLAY_PIT);
    }
    
    @Override
    public Building clone(){
        return new ClayPit();
    }
}