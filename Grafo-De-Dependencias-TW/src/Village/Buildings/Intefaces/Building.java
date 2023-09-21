package Village.Buildings.Intefaces;

import java.util.Map;

import Village.Buildings.Constants.EBuilding;

public interface Building{

    EBuilding   getBuilding();
    String      getBuildingType();
    void        upLevel();
    Building    clone();
    Map<EBuilding,Integer> getDependencies();
}