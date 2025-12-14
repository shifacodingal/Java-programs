
import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        int num, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        num = sc.nextInt();

        for(int i = 1; i<=num;i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println("Entered number is not prime");
        }
        else{
            System.out.println("Entered number is prime");
        }
    }
}