package Village.Buildings;

import Village.Buildings.Abstract.BelicBuidingImpl;
import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class Stable extends BelicBuidingImpl{
    
    public Stable() {
        super(EBuilding.STABLE);
    }
    
    @Override
    public Building clone(){
        return new Stable();
    }
}
