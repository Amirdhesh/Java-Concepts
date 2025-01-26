//static method
class School{
    String name;
    String designation;
    School(String name, String designation){
        this.name = name;
        this.designation = designation;
    }
    static School createntry(String name, String designation){
        return new School(name,designation);
    }
    void print_detail(){
        System.out.println("Name: "+ this.name+ ", Designation :"+this.designation);
    }
}
public class Workout5{
    public static void main(String[] args){
        School school = School.createntry("Abi", "Student");
        school.print_detail();
        School school1 = School.createntry("Keerthi", "Teacher");
        school1.print_detail();
    }
}