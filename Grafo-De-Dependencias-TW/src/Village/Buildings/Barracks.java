package Village.Buildings;

import Village.Buildings.Abstract.BelicBuidingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class Barracks extends BelicBuidingImpl{

    public Barracks() {
        super(EBuilding.BARRACKS);
    }

    @Override
    public Building clone(){
        return new Barracks();
    }
    
}
