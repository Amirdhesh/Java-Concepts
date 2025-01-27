//inner class
class A{
    class B{
        public void show(){
            System.out.println("Its class B.");
        }
    }
    public void show(){
        System.out.println("Its class A.");
    }

}
public class Workout8 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B inner_cls_obj = obj.new B();
        inner_cls_obj.show(); 
    }
}
