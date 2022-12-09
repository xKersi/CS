package Java;
import java.util.*;

public class cal_ie {
    public void main(String[] args ) throws Exception {

        Scanner sc = new Scanner(System.in);

        char operator = sc.next().charAt(0);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.print("What operator do you want to use? ");
        
        //Addition
        if (operator == '+'){
            System.out.print("Added:");
            System.out.print(x + y);

            //Subtraction
        } else if (operator == '-'){
            System.out.print("Subtracted:");
            System.out.print(x - y);

            //Multiplicaton
        } else if (operator == '*' || operator == 'x'){
            System.out.print("Multiplied:");
            System.out.print(x * y);

            //Division
        } else if (operator == '/' || operator == '÷'){
            System.out.print("Divided:");
            System.out.print(x / y);
            System.out.print("Get Remainder? ");
            char yn = sc.next().charAt(0);

            //Region: Getting to know if to display the remainder.
            if (yn == 'y'){
                System.out.print(x%y);
            }else{
            }
        } else {
            System.out.print("Invalid Operator:" + operator +"!");
        }
        
        sc.close();
    
    }
}
