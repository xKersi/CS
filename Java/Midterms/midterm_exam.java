package Java.Midterms;

import java.util.*;

//Identifying a specific input range.
public class midterm_exam {
    public void main(String[] args) throws Exception {
        
        //Defining Scanner
        Scanner sc = new Scanner(System.in);

        //Ranging Variable
        int range = sc.next().charAt(0);

        //Value identifying.
        
        //Range 1 - 50 divisible by 5 without remainders!
        if (range >= 1 && range <= 50 && range % 5 == 0){
            System.out.println(range + "Ranging 1 - 50 divisible by 5 withouot remainders!");

            //Range 25 - 51 and 51 - 75 divisible by 2 without remainders!
        } else if (range >= 51 && range <= 25 && range % 2 == 0 || range >= 51 && range <= 75 && range % 2 == 0){
            System.out.println(range + "Ranging 25 - 75 divisible by 2 withouot remainders!");

            //Range 1 -25 and 51 - 75 having remainders!
        } else if ((range >= 1 && range <= 25 || range >= 51 && range <= 75)){
            System.out.println(range + "Ranging 1 - 25 and 51 - 75 with remainders!");

            //Range 26 - 50 and 76 - 100 divisible 2 without remainders!
        } else if (( range >= 26 && range <= 50) || (range >= 76 && range <= 100 && range % 2 ==0)) {
            System.out.print(range + "Ranging 26-50 and 76-100 divisible by 2 without remainder!");

            //Range 26 - 50 and 76 - 100 having remainders!
        } else if (range >= 26 && range <= 50 || range >= 76 && range <= 100) {
            System.out.println(range + "Ranging 26-50 and 76-100 with remainders!");

            //Out of Range!
        } else {
            System.out.print("OUT OF RANGE:");
            System.out.print(range);
        }

        //Closing Scanner
        sc.close();
    }
}
