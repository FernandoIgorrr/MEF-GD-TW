package Village.Buildings;

import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class Smithy extends BuildingImpl{
    
     public Smithy() {
        super(EBuilding.SMITHY);
    }
    
    @Override
    public Building clone(){
        return new Smithy();
    }
}
