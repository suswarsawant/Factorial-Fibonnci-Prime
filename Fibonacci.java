import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        int number = sc.nextInt();

        int a = 0, b = 1,c;
        for(int i = 1; i<= number; i++){
            System.out.println(a);
            
            c = a + b;
            a = b;
            b = c;
        }
    }
}
