
interface A{
    static int a = 10;
    void show();
    
}
interface D extends A{
    void show1();
}
abstract class B implements D{
    public void show(){
            System.out.println("Class B" + A.a);
        }
} 
class C extends B{
    public void show1(){
        System.out.println("Class C");
    }
}

public class Workout1 {
    public static void main(String[] args) {
        D obj = new C();
        obj.show();
        obj.show1();
    }
}
