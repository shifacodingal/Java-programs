
import java.util.Scanner;

class Application{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers : ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(x+" / "+y+" = "+z);
        } catch (ArithmeticException e) {
            System.out.println("-----Catch Block -----");
            System.out.println(e.toString());
        }finally{
            System.out.println("-----Finally Block -----");
            System.out.println("Application Designed adn Developed by : ");
            System.out.println("Shifa @ Codingal");
            sc.close();
        }
        System.out.println("-------Done------");
    }
}