import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Factorial of number? =");
        int number = sc.nextInt();

        for(int i =1; i<= number; i++){
        factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    
}