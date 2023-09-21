package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Node<T>{
    
    private T data;

    private Set<Node<T>> dependencies;
    //private Map<Node<T>,Integer> dependents;
    
    //private Set<Node<T>> dependencies;
    //private Set<Node<T>> dependents;

    public Node(){

    }

    public Node(T data){
        this.data = data;
        this.dependencies   = new HashSet<>();
        //this.dependents     = new HashMap<>();
    }

    public T getData() {
        return data;
    }


    // private Map<Node<T>,Integer> getDependents() {
    //     return this.dependents;
    // }

    // private void addDependent(Node<T> dependent, Integer level) {
    //     this.dependents.put(dependent,level);
    // }
}
