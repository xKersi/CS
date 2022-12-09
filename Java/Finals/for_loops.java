package Java.Finals;

import java.util.*;

public class for_loops {
    public void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many times to loop? ");
        int loop = sc.nextInt();

        int firstValue = 5;
        int incrementer = 5;

        for (int x = firstValue; x < loop; x+=incrementer) {
            System.out.println(x);
        }
        sc.close();
    }
}
