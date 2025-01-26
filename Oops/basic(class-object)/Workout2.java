//default constructor
public class Workout2{ //school
    String name ;
    String designation;

    public Workout2(){
        designation = "Student";
    }
    public String print_detail(){
        return "Name: "+ name+ ", Designation :"+designation;
    }
    public static void main(String[] args){
        Workout2 school = new Workout2(); //school object
        school.name = "guna";
        String detail = school.print_detail();
        System.out.println(detail);
    }
}