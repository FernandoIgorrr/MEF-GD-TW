package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class Node<T>{
    
    private T data;

    public Node(T data){
        this.data           = data;
    }

    public T getData() {
        return data;
    }

    public Node clone(){
        return null;
    }
}
