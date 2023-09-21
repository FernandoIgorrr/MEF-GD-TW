package Village.Buildings;

import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class TimberCamp extends BuildingImpl{
    
    public TimberCamp() {
        super(EBuilding.TIMBER_CAMP);
    }
    
    @Override
    public Building clone(){
        return new TimberCamp();
    }
}
