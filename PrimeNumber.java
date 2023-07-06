import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(Sustem.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        int temp = 0;
        for(int i= 2; i<=number-1;i++){
            if(number%i == 0){
                temp = temp + 1;
            }
        }
        if(temp>0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime Number");
        }
    }
}