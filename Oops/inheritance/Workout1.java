class Parent{
    void show(){
        System.out.println("Its parent class.");
    }
}
class Child extends Parent{
    void show1(){
        System.out.println("Its Child class.");
    }
}
public class Workout1{
    public static void main(String[] args){
        Child obj = new Child();
        obj.show();
        obj.show1();
    }
}