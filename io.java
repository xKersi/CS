import java.util.*;

public class io{
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;

        System.out.print("Enter Number 1: ");
        x = sc.nextInt();
        System.out.print("Enter Number 2: ");
        y = sc.nextInt();
        //Adding them
        System.out.print(x + " Added to " + y + " is Equal to: ");
        System.out.print(x + y);

        sc.close();
    }
}