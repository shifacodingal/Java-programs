
import java.util.Scanner;

class ReverseDigit{
    public static void main(String[] args) {
        int num, temp, r, rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        num = sc.nextInt();
        temp = num;
        while (num!=0){
            r = num % 10;
            rev = rev  *10 + r;
            num = num / 10;
        }
        System.out.println("Reversed Number : "+rev);
    }
}