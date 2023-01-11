package TekYonluLinkedList;

public class TekYonluListeYapisi {
    
  Node head=null;
  Node tail=null;


  void basaekle(int x){ 

   Node eleman=new Node();
   eleman.data=x;
  
   if(head==null){

     eleman.next=null;
     head=eleman;
     tail=eleman;
}
  else{
    eleman.next=head;
    head=eleman;
  }
}
   void sonaEkle(int x){

Node eleman=new Node();
eleman.data=x;

  
   if(head==null){
eleman.next=null;
head=eleman;
tail=eleman;

}
  else{
eleman.next=null;     
tail.next=eleman;
tail=eleman;

    }

}
   void yazdır(){

    if(head==null){


        System.out.println("liste boş!!!");
    }

else{

Node temp=head;
 while(temp!=null){

    System.out.print(temp.data +  "->");
    temp=temp.next;

        }

     }

 }    
   
}


