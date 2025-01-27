//toString()

class Student{
    String roll_no;
    String name;
    int age;
    public void print_detail(){
        System.out.println("Name :" + name);
        System.out.println("roll Number :"+roll_no);
        System.out.println("Age :" + age);
    }
    public String toString(){ //Custmized one which can used to check object
        return "Hello";
    }
}

public class Workout7{
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Abi";
        student.roll_no = "21xx01";
        student.age = 10;
        student.print_detail();
        System.out.println(student); // By default Every class has toString() which returns Student@681a9515 value
    }
}