//Array of object
class Data{
    String name;
    Data(String name){
        this.name = name;
    }
    static Data entry(String name){
        return new Data(name); //object is created and returned
    }
    void printName(){
        System.out.println("Name :"+name);
    }
}
public class Workout6{
    public static void main(String[] args){
        Data[] data = new Data[3]; //Array declaration
        data[0] = data[0].entry("Gokul"); //object created through factory method
        data[1] = data[1].entry("Dhanush");
        data[2] = data[2].entry("Abinesh");
        for (int i=0; i < data.length; i++){
            data[i].printName();
        }
    }
}