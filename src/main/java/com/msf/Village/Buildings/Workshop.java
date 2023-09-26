package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BelicBuidingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class Workshop extends BelicBuidingImpl{
    
    public Workshop() {
        super(EBuilding.WORKSHOP);
    }
    
    @Override
    public Building clone(){
        return new Workshop();
    }
}
