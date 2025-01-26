//default and parameterized constructor
class School{
    String Name;
    String designation;
    School(){
        designation = "Student";
    }
    School(String designation){
        this.designation = designation;
    }
    String print_detail(){
        return "Name: "+ Name+ ", Designation :"+designation;
    }
}
public class Workout3{
    public static void main(String[] args){
        //object1
        School school = new School();
        school.Name = "guna";
        String detail = school.print_detail();
        //object2
        School school1 = new School("teacher");
        school1.Name = "keerthi";
        String detail1 = school1.print_detail();
        //print
        System.out.println(detail);
        System.out.println(detail1);
    }
}