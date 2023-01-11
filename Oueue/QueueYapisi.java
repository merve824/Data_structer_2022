package Oueue;

public class QueueYapisi {
    int [] dizi; //Burada tam sayı değikeni alan bir dizi yapısı oluşturduk
    int size;     //Burada kuyruğun kaç kapasiteli lduğunu belirledik
    int front; // dizinin en başındaki düğümü tutması için front yani ön adında bir tam sayı değişkeni tutan değişken oluşturdum
    int rear;  // dizinin en sonundaki düğümü tutması için rear yani arka adında bir tam sayı değişkeni tutan değişken oluşturdum

     public QueueYapisi(int size) { //kullanıcıdan alacağımız  parametre ile kuyruğun kaç elemanlı olacağını belirliyoruz
        this.size = size;
        dizi= new int[size]; // kuyruk yapısı
        front = 0;
        rear= -1;   //kuyrukta eleman olmadığını varsaydığımız için en başta rear 0 alınır
    }
    void enQueue ( int data)  //kuyruğa ekleme işlemini yapan fonksiyona yapısı oluşturulur
    {
    if( isFull()){  //kuyruk dolu mu diye kontrol edilir
    
    System.out.println("kuyruk dolu, ekleme yapamazsınız !");
    }
           else{
            rear++;
            dizi[rear] = data;
            System.out.println(dizi[rear] + "  kuyruğa eklendi ");

    }
} 
void deQueue ()   //kuyruktan silme işlemi yapan fonksiyon yapısı oluşturulur
{
    if( isEmpty()) // kuyruk boş mu diye kontrol edilir
{
System.out.println("kuyruk boş, silinecek eleman yok ");
}
   else{

int sayi =dizi[front] ;
for(int i=1; i<=rear; i++){
    dizi[i-1] = dizi[i];
}

     rear --;
    System.out.println(sayi + "  kuyruktan çıkartıldı  ");
}
} 
     private boolean isEmpty() {  //kuyruk boş ise 
return rear==-1;
}
    private boolean isFull(){   //  kuyruk dolu ise
return rear == size -1 ;
    }


}