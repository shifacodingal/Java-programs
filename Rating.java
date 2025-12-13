
import java.util.Scanner;

class Rating{
    public static void main(String[] args) {
        int Rating;
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the Rating 1 to 5 : ");
        Rating = sc.nextInt();
        switch(Rating){
            case 1:
                System.out.println("⭐ : Movie is not so good.");
                break;
            case 2:
                System.out.println("⭐⭐ : Movie is Fine.");
                break;
            case 3:
                System.out.println("⭐⭐⭐ : Movie is Good to watch.");
                break;
            case 4:
                System.out.println("⭐⭐⭐⭐ : Movie is Perfect.");
                break;
            case 5:
                System.out.println("⭐⭐⭐⭐⭐ : Movie is Excellent.");
                break;
            default:
                System.out.println("❌ Enter number 1 - 5 only.");

        }
    }
}