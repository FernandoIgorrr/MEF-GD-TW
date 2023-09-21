package Village.Buildings;

import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class Wall extends BuildingImpl{
    
    public Wall() {
        super(EBuilding.WALL);
    }
    
    @Override
    public Building clone(){
        return new Wall();
    }
}
