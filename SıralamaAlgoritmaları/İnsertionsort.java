package SıralamaAlgoritmaları;

 import java.util.*;

public class İnsertionsort {
//Sıralama algoritmaları
//İnsertion  Sort (ekelemeli sıralama) algoritması:

/*
7  3  5 1 2 
         for()
           for()
[7 3] 5 1 2 -> [3 7] 5 1 2
[7 3 5]  1 2 -> [3 5 7] 1 2
[7 3 5 1]  2 -> [ 1 3 5 7] 2
[7 3  5 1 2] - >[1  2 3  5 7]


*/

 public static void main(String [] args){

Scanner scanner=new Scanner(System.in);
int n;
System.out.print("Kaç adet sayı girmek istersiniz?");
n=scanner.nextInt();

int dizi[]= new int[n];
   for(int i=0;i<n;i++){

    System.out.print("Sayi:"  + "");
    dizi[i]=scanner.nextInt(); 
   }


insorSort(dizi,n);
System.out.println("Sıralama islemi tamam");
 
System.out.println("Sıralama yapıldı");
   for(int i=0;i<n;i++){
    System.out.print(dizi[i] + "  ");
   }
}

private static void insorSort(int[] dizi,int n){   
      for(int i=0; i<n;i++){
     
          for(int k=i; k>0;k--){
          
               if(dizi[k] < dizi[k-1]){
                int temp=dizi[k];
                dizi[k]=dizi[k-1];
                dizi[k-1]=temp;
               }
        }
       





      }


  }





}

    

