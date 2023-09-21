package Graph;

import java.util.Map;
import java.util.Set;

import Village.Buildings.Abstract.BuildingImpl;
import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class BuildingGraph extends DependencyGraph{
    private Set<Node<EBuilding>> roots;

    public BuildingGraph(Set<Node<EBuilding>> roots){
        this.roots = roots;
    }
}
