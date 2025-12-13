class PredictCloth{
    public static void main(String[] args) {
        boolean Sunny = true;
        boolean hot = false;

        if(Sunny){
            if(hot){
                System.out.println("Use Cap and Half Sleeves.");
            }
            else{
                System.out.println("Use Half Sleeves.");
            }
        }
        else{
            System.out.println("Take Rain-Coat for Safety.");
        }
    }
}