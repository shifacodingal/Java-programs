
import java.util.Scanner;

class Addition{
    int Answer, num1, num2;
    public void add(int num1, int num2){
        Answer = num1 + num2;
        System.out.println("Addition : "+Answer);
    }
}
class Substraction extends Addition{
    public void sub(int num1, int num2){
        Answer = num1 - num2;
        System.out.println("Substraction : "+Answer);
    }
}
class Division extends Substraction{
    public void Div(int num1, int num2){
        Answer = num1 / num2;
        System.out.println("Division : "+Answer);
    }
}
class Multiplication extends Division{
    public void Mult(int num1, int num2){
        Answer = num1 * num2;
        System.out.println("Multiplication : "+Answer);
    }
}
class Arithmetic{
    public static void main(String[] args) {
        Multiplication ob = new Multiplication();
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter the choice : ");
        ch = sc.nextInt();
        switch(ch){
            case 1:
                ob.add(10, 20);
                break;
            case 2:
                ob.sub(30, 2);
                break;
            case 3:
                ob.Mult(10, 3);
                break;
            case 4:
                ob.Div(20, 4);
                break;
        }
        
        
        
        
    }
}