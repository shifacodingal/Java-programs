
import java.util.Scanner;

class HelloUser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the statement : ");
        String str = sc.nextLine();
        System.out.println("Entered String is : "+str);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Entered number is : "+num);

        System.out.println("Enter number with decimal point : ");
        float dec = sc.nextFloat();
        System.out.println("Enter decimal number is : "+dec);
        
    }
}