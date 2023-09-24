package Village.Buildings;

import Village.Buildings.Abstract.BelicBuidingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class Workshop extends BelicBuidingImpl{
    
    public Workshop() {
        super(EBuilding.WORKSHOP);
    }
    
    @Override
    public Building clone(){
        return new Workshop();
    }
}
