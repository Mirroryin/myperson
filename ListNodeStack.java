package sample;

public class ListNodeStack <E> {
    StackNode<E> top = null;
    boolean isEmpty(){
        return top == null;
    }
    public void push(E item){
        StackNode<E> node = new StackNode<>(item);
        node.next = top;
        top = node;

    }
    public E pop(){
        if(this.isEmpty())return null;
        E data = top.data;
        top = top.next;
        return data;
    }
    public E peek(){
        if(this.isEmpty())return null;
        return top.data;
    }
    public static void main(String[] args){
        ListNodeStack<String>stack = new ListNodeStack<>();
        stack.push("sks");
        System.out.println("出栈"+stack.pop());
        System.out.println("栈空"+stack.isEmpty());
    }
}
