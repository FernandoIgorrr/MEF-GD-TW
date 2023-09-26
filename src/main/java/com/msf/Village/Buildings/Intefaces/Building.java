package com.msf.Village.Buildings.Intefaces;

import java.util.Map;

import com.msf.Village.Buildings.Constants.EBuilding;

public interface Building{

    EBuilding               getBuilding();
    String                  getBuildingType();
    Integer                 getLevel();
    void                    upLevel();
    Building                clone();
    
}