package com.msf.Village.Buildings;

import com.msf.Village.Buildings.Abstract.BelicBuidingImpl;
import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.Building;

public class Barracks extends BelicBuidingImpl{

    public Barracks() {
        super(EBuilding.BARRACKS);
    }

    @Override
    public Building clone(){
        return new Barracks();
    }
    
}
