package sample;

public class ListNodetest {
    public static void main(String[] args){
        ListNode first1 = new ListNode(0);
        ListNode nextNode;
        nextNode = first1;
        for(int i = 1;i<10;i++){
            ListNode node;
            node = new ListNode(i);
            nextNode.next = node;
            nextNode = nextNode.next;
        }
        nextNode = first1;
        while (nextNode!=null){
            if(nextNode.val == 3){
                ListNode newnode = new ListNode(55);
                ListNode node = nextNode.next;
                nextNode.next = newnode;
                newnode.next = node;
            }
            nextNode = nextNode.next;
        }
        nextNode = first1;
        Print(nextNode);
    }
    static void Print(ListNode listNode){
        while(listNode!=null){
            System.out.println("Node"+listNode.val);
            listNode = listNode.next;
        }
        System.out.println();
    }
}
//替换节点
  /*   while(nextNode!=null){
             if(nextNode.val==4){
             ListNode newnode = new ListNode(99);  //生成新的节点
             ListNode node=nextNode.next.next;     //先保存要替换节点的下一个节点
             nextNode.next.next=null;              //被替换节点 指向为空 ，等待java垃圾回收
             nextNode.next=newnode;                //插入新节点
             newnode.next=node;                    //新节点的下一个节点指向 之前保存的节点
             }
             nextNode=nextNode.next;
             }//循环完成之后 nextNode指向最后一个节点
             nextNode=nodeSta;                            //重新赋值让它指向首节点
             print(nextNode);
             删除节点：：：：
              while(nextNode!=null){
            if(nextNode.val==5){
                ListNode listNode=nextNode.next.next;     //保存要删除节点的下一个节点
                nextNode.next.next=null;                  //被删除节点 指向为空 ，等待java垃圾回收
                nextNode.next=listNode;                   //指向要删除节点的下一个节点
            }
            nextNode=nextNode.next;
        }//循环完成之后 nextNode指向最后一个节点
         nextNode=nodeSta;                            //重新赋值让它指向首节点
         print(nextNode);                             //打印输出
    }*/