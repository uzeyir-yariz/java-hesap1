import java.util.Scanner;

public class java2 {
    public static void main(String[] args){
        int key = 0;

        startover();

        while(key == 0){

            Scanner myobj = new Scanner(System.in);
            System.out.print("işlem seçiniz ==> ");
            int soru = myobj.nextInt();
            
            
            if(soru == 1){
                System.out.println("------------------"); 
                
                Scanner my1 = new Scanner(System.in);
                System.out.print("toplamak için ilk sayıyı giriniz ==> ");
                int s1 = my1.nextInt();
                
                Scanner my2 = new Scanner(System.in);
                System.out.print("toplamak için ikinci sayıyı giriniz ==> ");
                int s2 = my2.nextInt();
                
                int top = s1 + s2;
                
                System.out.println(s1 + " + " + s2 + " = " + top);
                my1.close();
                my2.close();
                System.out.println("------------------"); 
                
            }

            else if(soru == 2){
                System.out.println("------------------"); 
                
                Scanner my1 = new Scanner(System.in);
                System.out.print("çıkarmak için ilk sayıyı giriniz ==> ");
                int s1 = my1.nextInt();
                
                Scanner my2 = new Scanner(System.in);
                System.out.print("çıkarmak için ikinci sayıyı giriniz ==> ");
                int s2 = my2.nextInt();
                
                int top = s1 - s2;
                
                System.out.println(s1 + " - " + s2 + " = " + top);
                my1.close();
                my2.close();
                
                System.out.println("------------------");
            }
            
            else if(soru == 3){
                System.out.println("------------------"); 
                
                Scanner my1 = new Scanner(System.in);
                System.out.print("çarpmak için ilk sayıyı giriniz ==> ");
                int s1 = my1.nextInt();
                
                Scanner my2 = new Scanner(System.in);
                System.out.print("çarpmak için ikinci sayıyı giriniz ==> ");
                int s2 = my2.nextInt();
                
                int top = s1 * s2;
                
                System.out.println(s1 + " X " + s2 + " = " + top);
                my1.close();
                my2.close();
                
                System.out.println("------------------");
            }
            
            else if(soru == 4){
                System.out.println("------------------"); 
                
                Scanner my1 = new Scanner(System.in);
                System.out.print("bölmek için ilk sayıyı giriniz ==> ");
                int s1 = my1.nextInt();
                
                Scanner my2 = new Scanner(System.in);
                System.out.print("bölmek için ikinci sayıyı giriniz ==> ");
                int s2 = my2.nextInt();
                
                int top = s1 / s2;
                
                System.out.println(s1 + " / " + s2 + " = " + top);
                my1.close();
                my2.close();
                System.out.println("------------------");
            }
            
            else if(soru == 0){
                System.out.println("------------------"); 
                System.out.println("çıkılıyor...");
                myobj.close();
                System.out.println("------------------");
                break;
            }
             myobj.close();
        } 
        
    }
    
    public static void startover() {
        System.out.println("------------------"); 

        System.out.println("(0) çık");

        System.out.println("(1) topla"); 
        System.out.println("(2) çıkar"); 
        System.out.println("(3) çarp"); 
        System.out.println("(4) böl"); 

        System.out.println("------------------"); 
    }
}