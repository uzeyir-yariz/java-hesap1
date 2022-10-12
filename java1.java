import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        
        int key = 0;
        while(key == 0){
            
            char operator;
            double s1 , s2 , top;

            Scanner soru = new Scanner(System.in);

            start();
            operator = soru.next().charAt(0);

            System.out.print("ilk sayıyı girin : ");
            s1 = soru.nextDouble();

            System.out.print("ikinci sayıyı girin : ");
            s2 = soru.nextDouble();

            switch(operator){
                
                case '+':
                    top = s1 + s2;
                    System.out.println("---------------------------");
                    System.out.println(s1 +" + "+ s2 + " = " + top);
                    System.out.println("---------------------------");
                    break;
                
                case '-':
                    top = s1 - s2;
                    System.out.println("---------------------------");
                    System.out.println(s1 +" - "+ s2 + " = " + top);
                    System.out.println("---------------------------");
                    break;
                
                case '*':
                    top = s1 * s2;
                    System.out.println("---------------------------");
                    System.out.println(s1 +" * "+ s2 + " = " + top);
                    System.out.println("---------------------------");
                    break;
                
                case '/':
                    top = s1 / s2;
                    System.out.println("---------------------------");
                    System.out.println(s1 +" / "+ s2 + " = " + top);
                    System.out.println("---------------------------");
                    break;

                case 'q':
                    key = 1;
                    soru.close();
                    break;
                    
            }
            

        }

    }

    static void start(){
        
        System.out.println("(+) toplama");
        System.out.println("(-) çıkarma");
        System.out.println("(*) çarpma");
        System.out.println("(/) bölme");
        System.out.println("(q) çıkmak");

    }

  }