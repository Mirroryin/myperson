package sample;

import java.util.Arrays;

public class ArrayStack <E>{
    private Object[] stack;
    private int index;
    ArrayStack(){
        stack = new Object[10];
        index = 0;
    }
    public boolean IsEmpty(){
        return index == 0;
    }
    public E peek(){
        if(IsEmpty()){
            return null;
        }
        return (E)stack[index-1];
    }
    public E pop(){
        if(IsEmpty()){
            return null;
        }
        index --;
        return (E)stack[index];
    }
    private void ensureCapacity(int index){
        if(index>stack.length){
            int len = stack.length + 10;
            stack = Arrays.copyOf(stack,len);
        }
    }
    public E push(E e){
        ensureCapacity(index+1);
        stack[index++] = e;//先保存在进行的加数操作
        return e;
    }
    public static void main(String[] args){
        ArrayStack<String>stack = new ArrayStack<>();
        stack.push("sks");
        System.out.println(stack.peek());
        System.out.println(stack.index);
    }
}