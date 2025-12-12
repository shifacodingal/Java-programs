class Operators{
    public static void main(String[] args) {
        int a = 10;
        int b = 5, Sum, Sub, Mult, Div;
        Sum = a + b;
        Sub = a - b;
        Mult = a * b;
        Div = a/b;
        String magic = "===============Magic==============";
        System.out.println("==========Output using Variable==============");
        System.out.println("Addition : "+Sum);
        System.out.println("Substract : "+Sub);
        System.out.println("Multiplication : "+Mult);
        System.out.println("Division : "+Div);

        System.out.println("============Output using opertors================");
        System.out.println("Addition : " + (a+b));
        System.out.println("Substract : " + (a-b));
        System.out.println("Multiplication : " + (a*b));
        System.out.println("Division : " + (a/b));


    }
}