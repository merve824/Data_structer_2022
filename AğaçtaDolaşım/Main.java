package AğaçtaDolaşım;

public class Main {
      public static void main(String [] args){

     Tree bst=new Tree();

    bst.root=bst.insert(bst.root,10);
    bst.root=bst.insert(bst.root,23);
    bst.root=bst.insert(bst.root,156);
    bst.root=bst.insert(bst.root,67);
    bst.root=bst.insert(bst.root,45);
    bst.root=bst.insert(bst.root,14);
    bst.root=bst.insert(bst.root,100);

         System.out.print("Preorder:");
         bst.preOrder(bst.root);
         System.out.println();
         System.out.print("İneorder:");
         bst.İnOrder(bst.root);
         System.out.println();
         System.out.print("Postorder:");
         bst.postOrder(bst.root);

      }
}
