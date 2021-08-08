package sample;

public class ListQueue <E>{
    private StackNode<E> head = null;
    private StackNode<E> end = null;

    public boolean isEmpty(){
        return head == null;
    }
    public void offer(E e){
        StackNode<E> node = new StackNode<>(e);
        if(isEmpty()){
            head = node;
            end = node;
            return;
        }
        end.next = node;
        end = node;
    }
    public E poll(){
        if(isEmpty())return null;
        E data = head.data;
        head = head.next;
        return data;
    }
    public static void main(String[] args){
        ListQueue<String> queue = new ListQueue<>();
        queue.offer("sks");
        System.out.println("出列"+queue.poll());
    }
 }
