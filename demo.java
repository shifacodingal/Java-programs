class demo{
    private int a;

    demo(int b){
        this.a = b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args){
        demo ob = new demo(20);
        
    }
}