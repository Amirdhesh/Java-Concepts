// Anoymous class 
abstract class Phone{
    abstract void call();
}
public class Workout3 {
    public static void main(String[] args) {
        Phone obj = new Phone(){
            public void call(){
                System.out.println("Success");
            }
        };
        obj.call();
    }
}
