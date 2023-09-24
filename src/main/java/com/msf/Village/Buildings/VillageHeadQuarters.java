package Village.Buildings;

import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class VillageHeadQuarters extends BuildingImpl{

    public VillageHeadQuarters() {
        super(EBuilding.VILLAGE_HEADQUARTERS);
    }

    @Override
    public Building clone(){
        return new VillageHeadQuarters();
    }
}
