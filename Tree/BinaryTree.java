import java.util.Scanner;

public class BinaryTree {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

    };

    ///  how to input tree
    /// 10 T 20 F  T 40 F F T 60 T 70 F F T 80 F F
    Scanner sc = new Scanner(System.in);
    private TreeNode root;                      // root o access n kr paae bahar k user
    public void createTree(){
        this.root = ct();

    }
    public TreeNode ct() {
        TreeNode nn = new TreeNode();
        nn.val = sc.nextInt();
        boolean hlc = sc.nextBoolean();   // hcl: has leftchild
        if (hlc) {
            nn.left = ct();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {                          // hrc: has right child
            nn.right = ct();
        }
        return nn;
    }
    public void displayTree(){
        displayTree(root);
    }
    public void displayTree(TreeNode root){
        if(root==null){
            return;
        }
        String s="";
        s=s+root.val;
        s="<-" +s+"->";
        if(root.left!=null){
            s=root.left.val +s;
        }
        else{
            s="."+s;
        }
        if(root.right!=null){
            s=root.right.val +s;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        displayTree(root.left);
        displayTree(root.right);
    }

    //preorder
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(TreeNode root){
        if(root==null){
        return;
        }
        System.out.print(root.val+"->");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Inorder
    public void InOrder(){
        InOrder(root);
    }
    public void InOrder(TreeNode root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        System.out.print(root.val+"->");
        preOrder(root.right);
    }

    // postOrder
    public void PostOrder(){
        PostOrder(root);
    }

    public void PostOrder(TreeNode root){
        if(root==null){
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val+"->");
    }


}
