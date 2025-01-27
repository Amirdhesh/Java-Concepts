
abstract class Phone{
    abstract void call();
    public void check(){
        System.out.println("Ok");
    }
}
class Samsung extends Phone{
    public void call(){
        System.out.println("Hello");
    }
}
public class Workout1 {
    public static void main(String[] args) {
        Samsung obj = new Samsung();
        obj.call();
        obj.check();
    }
}
