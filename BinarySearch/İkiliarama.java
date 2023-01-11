package BinarySearch;

public class İkiliarama {
    
      public static void main(String []  args){
        int veri[] = {1,5,7,8,11,13,18,21,54,188};
        int aranan = 21;
        int enbuyuk = 10;
        int enkucuk = -1;
        int bayrak = 0;
        while (enbuyuk - enkucuk > 1) {
            int bakilan = (enbuyuk + enkucuk) / 2;
            if (veri[bakilan] == aranan) {
                bayrak = 1;
                System.out.println("Bulunan index :" + bakilan);
                break;
            } else if (veri[bakilan] < aranan) {
                enkucuk = bakilan;
            } else {
                enbuyuk = bakilan;
            }
        }
        if (bayrak ==0) {
            System.out.println("Aranılan kayıt bulunamadı.");
        }






      }


}
