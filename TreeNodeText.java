package sample;

public class TreeNodeText {
    public static void main(String[] args){
        TreeNode<Integer> root = new TreeNode<>(3);
        groeth(root,2);
        print(root);
    }
    static void groeth(TreeNode root,int deep){
        if(deep==0)return;
        TreeNode<Integer> left = new TreeNode<>(deep);
        TreeNode<Integer> right = new TreeNode<>(deep);
        root.left = left;
        root.right = right;
        groeth(left,deep-1);
        groeth(right,deep-1);
    }
    static void print(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        print(root.left);
        print(root.right);
    }
}
