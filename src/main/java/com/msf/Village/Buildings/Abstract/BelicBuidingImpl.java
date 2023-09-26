package com.msf.Village.Buildings.Abstract;

import com.msf.Village.Buildings.Constants.EBuilding;
import com.msf.Village.Buildings.Intefaces.BelicBuilding;

public abstract class BelicBuidingImpl extends BuildingImpl implements BelicBuilding{

    public BelicBuidingImpl(EBuilding eBuilding){
        super(eBuilding);
    }

    @Override
    public void checkRecruit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkRecruit'");
    }

    @Override
    public void recuit() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'recuit'");
    }
    
}
