
import java.util.Scanner;

class Sum{
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = sc.nextInt();
        for(int i=1; i<=num; i++){
            sum = sum + i;
        }
        System.out.println("Sum of 1 to "+num+" is : "+sum);
    }
}