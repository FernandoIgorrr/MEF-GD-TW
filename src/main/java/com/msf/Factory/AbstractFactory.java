package com.msf.Factory;

import com.msf.Village.Buildings.Constants.EBuilding;

public interface AbstractFactory<T> extends Factory{
    T build(EBuilding eBuilding);
}
