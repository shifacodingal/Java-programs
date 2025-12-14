
import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        int n1, n2, n3,num;
        n1 = 0;
        n2 = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number limit : ");
        num = sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2; i<=num ; i++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}