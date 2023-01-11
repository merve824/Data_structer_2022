package TekYonluLinkedList;

public class Main {

    public static void main(String [] args){
        TekYonluListeYapisi tekYonList=new TekYonluListeYapisi();
        tekYonList.basaekle(10);
        tekYonList.sonaEkle(120);
        tekYonList.basaekle(45);
        tekYonList.sonaEkle(98);

System.out.println("Baştaki düğümün elemani:" + tekYonList.head.data);
System.out.println("Sondaki düğümün elemani:" + tekYonList.tail.data);

tekYonList.yazdır();

    }
    
}
