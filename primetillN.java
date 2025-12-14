
import java.util.Scanner;

class primetillN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int count;
        System.out.println("Enter the number limit : ");
        num = sc.nextInt();
        for(int i = 1; i<=num;i++){
            count=0;
            for (int j = 1; j<=i ; j++){
                if(i%j==0){
                    count++;
                }
                
            }
            if (count == 2) {
                System.out.println(i);
            }
            
        }
    }
}