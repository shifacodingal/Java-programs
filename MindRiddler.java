class MindRiddler{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("===========Guess the Answer==============");
        System.out.println("Uninary Operator a++ : "+(a++));
        System.out.println("Uninary Operator ++b : " + (++b));
        System.out.println("Binary Operator a++");
        System.out.println("1+2 : "+1+2);
        System.out.println("1+2 : "+(1+2));
        System.out.println(1+2+" :3 ");

        int increament = ++a * b++;
        System.out.println(increament);

        System.out.println("Ternary Operator");
        int largest_number = (a>b)?a:b;
        System.out.println("Largest Number : "+largest_number);
    }
}