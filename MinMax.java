
import java.util.Scanner;

class MinMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        char choice='y';
        do { 
            System.out.println("Enter number : ");
            num=sc.nextInt();
            if(num > max){
                max = num;
            
            }
            if(num < min){
                min=num;
            }
            System.out.println("Do you wanna continue (y/n) : ");
            choice = sc.next().charAt(0);
        } while (choice =='y' || choice=='Y');
        System.out.println("Largest Number : "+max);
        System.out.println("Smallest Number : "+min);
    }
}