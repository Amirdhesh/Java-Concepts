abstract class Phone{
    abstract void call();
    abstract void message();
    public void check(){
        System.out.println("Ok");
    }
}
abstract class Samsung extends Phone{
    public void call(){
        System.out.println("Call");
    }
}
class Apple extends Samsung{
    public void message(){
        System.out.println("Message");
    }
}

public class Workout2 {
    public static void main(String[] args) {
        Phone obj = new Apple();
        obj.check();
        obj.call();
        obj.message();
    }
}
