package AğaçtaDolaşım;

public class Tree{
    Node root;
    public Tree() {
    root= null;
}
    Node newNode(int data){
    
    root =new Node(data);
    return root;
}
    Node insert( Node root, int data ){
    
    if( root!= null ){
    
    if( data < root.data)
    root.left=insert( root.left, data);

    else
    root.right= insert( root.right, data);
}
    else
    root = newNode(data);
    return root;
    }
  void preOrder(Node root){

if(root!=null){
    System.out.print(root.data +" ");
    preOrder(root.left);
    preOrder(root.right);
    }  
 }
void İnOrder(Node root){

    if(root!=null)
    {
        İnOrder(root.left);
        System.out.print(root.data +" ");
        İnOrder(root.right);
    }  

      }
     
      void postOrder(Node root){

        if(root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +" ");
        }  
    
          }

} 





    
   
        


