package SıralamaAlgoritmaları;
import java.util.*;

public class bubblesort {
//Sıralama algoritmaları
//Bubble Sort (Kabarcık sıralaması) algoritması:En büyük sayıyı bul ve sona at

/*

   for()
       for()
7  3 5 1 2 
       
  5 1 3 2   7 
  1 3 2   5 7
  1 2    3 5 7
  1 2    3 5 7
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


bubbleSort(dizi,n);

System.out.println("Bubble sort ile sıralama yapıldı");
   for(int i=0;i<n;i++){
    System.out.print(dizi[i] + "   ");
   }
}

private static void bubbleSort(int[] dizi,int n){   
      for(int i=0; i<n-1;i++){
     
         
          for(int j=0; j<n-i-1;j++){
          
               if(dizi[j] > dizi[j+1]){
                int temp=dizi[j];
                dizi[j]=dizi[j+1];
                dizi[j+1]=temp; 
               }
        }
      





      }


  }





}
