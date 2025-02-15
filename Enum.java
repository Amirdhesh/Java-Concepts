
 enum Status{
    Failed(100),Success(1200);

    private int mark;
    //default construtor can be made along with getter and setter can be implemented
    Status(int mark){
        this.mark = mark;
    }
    void show(){
        System.out.println(mark);
    }

}
public class Enum {
    public static void main(String[] args){
        Status status = Status.Failed;
        status.show();

    }
}
//hello
