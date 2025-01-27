//Overloading
class Calculator{
    void add(int a,int b){
        System.out.println(a+b);
    }
}
class Advcal extends Calculator{
    void add(int a,int b, int c){
        System.out.println(a+b+c);
    }
}

public class Workout1{
    public static void main(String[] args){
        Advcal obj = new Advcal();
        obj.add(1,2,3);
    }
}