package sample;

import java.util.Arrays;

public class ArrayQueue <E>{
    Object[] queue;
    int size;

    public ArrayQueue(){
        queue = new Object[10];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void offer(E data){
        ensureCapacity(size+1);
        queue[size++] = data;
    }
    public E poll(){
        if(isEmpty())return null;
       E  data = (E) queue[0];
       System.arraycopy(queue,1,queue,0,size-1);//填满空位
        size--;
        return data;
    }
    private void ensureCapacity(int size){
        if(size>queue.length){
            int len = queue.length+10;
            queue = Arrays.copyOf(queue,len);
        }
    }
    public static void main(String[] args){
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for(int i = 0;i<20;i++){
            queue.offer(i);
        }
        for (int i =0;i<25;i++){
            System.out.println("出队元素"+queue.poll());
        }
    }
}
