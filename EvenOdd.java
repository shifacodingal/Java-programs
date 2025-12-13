
import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even Number.");
        }
        else{
            System.out.println(num+" is Odd Number.");
        }
    }
}