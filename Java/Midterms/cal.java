package Java.Midterms;
import java.util.*;

public class cal {
    public void main(String[] args ) throws Exception {

        Scanner sc = new Scanner(System.in);

        char operator = sc.next().charAt(0);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("What operator do you want to use? ");
        
        switch(operator){
            case '+':
                System.out.print("Added:");
                System.out.print(x + y);
                break;
            case '-':
                System.out.print("Subtracted:");
                System.out.print(x - y);
                break;
            case '*': case 'x':
                System.out.print("Multiplied:");
                System.out.print(x*y);
                break;
            case '/': case '÷':
                System.out.print("Get the remainder?");
                char yn = sc.next().charAt(0);
                if (yn == 'y'){
                    System.out.print(x % y);
                } else {
                }
                System.out.print("Divided by:");
                System.out.print(x/y);
                break;
        }
        sc.close();
    
    }
}
