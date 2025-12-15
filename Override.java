class parent{
    public void ParentM(){
        System.out.println("This is from parent");
    }
}
class child extends parent{
    public void ChildM(){
        System.out.println("This is from child.");
    }
}
class Override{
    public static void main(String[] args) {
        child ob = new child();
        ob.ParentM();
        ob.ChildM();
    }
}