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
class Child2 extends Child{
    void show2(){
        System.out.println("Its Child2 class.");
    }
}
public class Workout2{
    public static void main(String[] args){
        Child2 obj = new Child2();
        obj.show();
        obj.show1();
        obj.show2();
    }
}