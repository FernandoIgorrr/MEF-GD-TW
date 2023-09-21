package Village.Buildings.Intefaces;

import java.util.Map;

import Village.Buildings.Constants.EBuilding;

public interface Building{

    EBuilding               getBuilding();
    String                  getBuildingType();
    Integer                 getLevel();
    void                    upLevel();
    Building                clone();
    
}