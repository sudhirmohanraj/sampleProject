import java.util.ArrayList;
import java.util.List;

/**
 * Created by wyh669 on 3/22/16.
 */
public class SubTree {

    public static void main(String[] args){
        TreeNode treeNode5 = new TreeNode(10,null,null);
        TreeNode treeNode4 = new TreeNode(30,null,null);
        TreeNode treeNode6 = new TreeNode(50,null,null);
        TreeNode treeNode7 = new TreeNode(70,null,null);
        TreeNode treeNode2 = new TreeNode(20,treeNode4,treeNode5);
        TreeNode treeNode3 = new TreeNode(60,treeNode7,treeNode6);
        TreeNode treeNode1 = new TreeNode(40,treeNode3,treeNode2);
       // preOrderTraversal(treeNode1);
        postOrderTraversal(treeNode1);
        System.out.println("------------");
        inOrderTraversal(treeNode1);


        System.out.println("------------");
        TreeNode treeNode12 = new TreeNode(20,null,null);
        TreeNode treeNode13 = new TreeNode(60,null,null);
        TreeNode treeNode10 = new TreeNode(40,treeNode13,treeNode12);
        //preOrderTraversal(treeNode10);
        postOrderTraversal(treeNode10);
        System.out.println("--------------");
        inOrderTraversal(treeNode10);
    }

    public static List<Integer> inOrder(TreeNode treeNode){
        List<Integer> output = new ArrayList<Integer>();

        return output;
    }


    public static void preOrderTraversal(TreeNode treeNode){

        if(treeNode!=null){
            System.out.println(treeNode.data);
            preOrderTraversal(treeNode.left);
            preOrderTraversal(treeNode.right);
        } else {
            return;
        }
    }

    public static void postOrderTraversal(TreeNode treeNode){

        if(treeNode!=null){
            System.out.println(treeNode.data);
            preOrderTraversal(treeNode.left);
            preOrderTraversal(treeNode.right);
        } else {
            return;
        }
    }


    public static void inOrderTraversal(TreeNode treeNode){

        if(treeNode!=null){
            inOrderTraversal(treeNode.left);
            System.out.println(treeNode.data);
            inOrderTraversal(treeNode.right);
        } else {
            return;
        }
    }

}
