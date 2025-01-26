//static block
class ElectronicDevice{
    String brand;
    static String type;
    String model;
    int price;
    static{
        type = "Phone";
        System.out.println("Static block Executed.");
    }
    ElectronicDevice(String brand, int price){
        this.brand = brand;
        this.price = price;
        System.out.println("Constructor block excuted.");
    }
    String brandName(){
        return brand;
    }
    int returnPrice(){
        return price;
    }
}
public class Workout4{
    public static void main(String[] args){
        ElectronicDevice ed = new ElectronicDevice("Samsung",2000);
        ed.model = "S25";
        ElectronicDevice ed1 = new ElectronicDevice("Apple",5000);
        ed1.model = "iphone16";
        System.out.println(ed.brandName());
        System.out.println(ed1.returnPrice());
    }
}