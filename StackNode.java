package sample;

public class StackNode <E>{
    StackNode<E> next = null;
    E data;
    public StackNode(E data){
        this.data = data;
    }
}
