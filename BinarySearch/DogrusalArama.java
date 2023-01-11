package BinarySearch;

   public class DogrusalArama {  
    public static int arama(int dizi[], int x) { 
        int n = dizi.length; 
        for(int i = 0; i < n; i++) { 
            if(dizi[i] == x) 
                return i; 
        } 
        return -1; 
    } 
      
    public static void main(String args[]) { 
        int dizi[] = { 1, 3, 5, 7, 9 };  
        int x = 7;
          
        int result = DogrusalArama.arama(dizi, x); 
        if(result == -1) 
            System.out.print("Eleman dizide bulunamadı"); 
        else
            System.out.print("elemann indexte mevcut " + result); 
        } 
    } 
    
