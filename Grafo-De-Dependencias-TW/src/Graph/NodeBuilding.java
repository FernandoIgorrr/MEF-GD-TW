package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Village.Buildings.Constants.EBuilding;
import Village.Buildings.Intefaces.Building;

public class NodeBuilding extends Node<EBuilding>{
    
    //private Boolean ;
    private Map<NodeBuilding,Integer> _dependiencies;
    private Map<NodeBuilding,Integer> _dependents;
    
    private Set<NodeBuilding> dependencies;
    private Set<NodeBuilding> dependents;

    public NodeBuilding(EBuilding building){
        super(building);


        this.dependencies   = new HashSet<>();
        this._dependiencies = new HashMap<>();

        this.dependents   = new HashSet<>();
        this._dependents  = new HashMap<>();
    }

    public EBuilding getBuilding(){
        return this.getData();//getBuilding();
    }

    public Integer getLevel(){
        return this.getLevel();
    }


    public void addDependecie(NodeBuilding node, Integer level){
        this._dependiencies.put(node,level);
    }

    public void addDependecie(NodeBuilding node){
        this.dependencies.add(node);
    }

    public void addDependents(NodeBuilding node, Integer level){
        this._dependents.put(node,level);
    }

    public boolean isLeaf(){
        if(this.dependents.isEmpty()){
            return true;
        }
        return false;
    }

    public Node clone(){
        return new NodeBuilding(getBuilding());
    }
}
