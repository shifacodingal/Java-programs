class GetSet{
    public static void main(String[] args) {
        Main ob = new Main();
        ob.setName("Shifa");
        System.out.println(ob.getName());
    }
}
class Main{
    private  String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
}