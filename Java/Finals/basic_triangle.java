package Java.Finals;

public class basic_triangle {
    public static void main(String[] args) {
        for (int a = 1; a <= 5; a++){
            for (int b = 1; b <= 5; b++){
                System.out.print(" *");
            }
            System.out.print(" ");
        }

        for(int a = 5; a > 1; a++){
            for(int b = 1; b < a; b++){
                System.out.print(" %");
            }
            System.out.print(" ");
        }
    }
}
