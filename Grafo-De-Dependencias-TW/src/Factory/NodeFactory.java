package Factory;

import java.util.HashMap;
import java.util.Map;

import Graph.Node;
import Graph.NodeBuilding;
import Village.Buildings.Constants.EBuilding;

public class NodeFactory implements AbstractFactory<Node>{

    private Map<EBuilding,Node> buildingPrototype = new HashMap<>();

    public NodeFactory(){
        this.createPrototypeMap();
    }

    @Override
    public Node build(EBuilding eBuilding) {
        return this.buildingPrototype.get(eBuilding).clone();
    }

    private void createPrototypeMap(){
        this.buildingPrototype.put(EBuilding.FARM,new NodeBuilding(null));
    }

    @Override
    public Node build() {
        // TODO Auto-generated method stub
        return null;
    }

}
