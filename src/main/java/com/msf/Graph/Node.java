package Graph;

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
