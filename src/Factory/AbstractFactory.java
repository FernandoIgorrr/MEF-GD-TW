package Factory;

import Graph.Node;
import Village.Buildings.Constants.EBuilding;

public interface AbstractFactory<T> extends Factory{
    T build(EBuilding eBuilding);
}