package sample;

import java.util.Stack;

public class stackbegin {
    public static void main(String[] args){
        Stack<MyObj> ob = new Stack<MyObj>();
        ob.push(new MyObj(1,"sks"));
        ob.peek();//栈顶元素
        System.out.println("Integer 类型: ");
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        System.out.println("栈顶元素："+st.peek()+"是否为空："+st.empty()+" 栈1的元素为："+st);
        st.pop();
        st.pop();//pop移除栈顶元素
        System.out.println("是否为空 "+st.empty());
        System.out.println("自定义类型 ");
        Stack<MyObj> so = new Stack<MyObj>();
        so.push(new MyObj(3,"sks"));
        System.out.println(("添加元素之后 栈顶元素："+so.peek().name+so.peek().id +" 是否为空："+so.empty()));
        so.pop();
        so.pop();
        System.out.println("是否为空 "+so.empty());
    }
}
