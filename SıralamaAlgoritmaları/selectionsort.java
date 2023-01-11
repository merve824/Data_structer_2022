package SıralamaAlgoritmaları;
 import java.util.*;

    public class selectionsort {
//Sıralama algoritmaları
//Selection Sort (seçmeli sıralama) algoritması:En küçük sayıyı bul ve sonra başa at
  
 /*
  7  3 5 1 2 
             for()
               for()
[7]  3 5 1 2 -> [1] 3 5 7 2 
 1 [3] 5 7 2  -> 1 [2] 5 7 3
 1 [2] 5 7 3  -> 1  2 [3] 7 5 
 1  2 [3] 7 5  ->1  2  3  [5]  7

 1 3 5 7 2
 1 2 5 7 3
 1 2 3 7 5
 1 2 3 5 7
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


    selectionSort(dizi,n);

    System.out.println("Sıralama yapıldı");
       for(int i=0;i<n;i++){
        System.out.println(dizi[i] + "");
       }
    }
    
    private static void selectionSort(int[] dizi,int n){   
          for(int i=0; i<n;i++){
         
             int min=i;
              for(int j=i; j<n;j++){
              
                   if(dizi[min] >dizi[j]){
                     min=j; 
                   }
            }
            int temp=dizi[min];
            dizi[min]=dizi[i];
            dizi[i]=temp; 





          }


      }





}
