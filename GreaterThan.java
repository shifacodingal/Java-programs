import java.util.Scanner;
class GreaterThan {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("****** Let's Check if entered number is greater than 10 *********");
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        if(num > 10){
            System.out.println("Yes, "+num+" is Greater then 10.");
        }
        else{
            System.out.println("Sorry ! " + num + " is not Greater then 10.");
        }
    }
}