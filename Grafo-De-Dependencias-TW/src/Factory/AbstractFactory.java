package Factory;

import Graph.Node;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public interface AbstractFactory<T>{
    T build(EBuilding eBuilding);
}
