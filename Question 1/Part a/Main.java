class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    //Getter method for name and grade
    public String getStudentInfo(){
        return "Name: " + name + ", Grade: " + grade;
    }

    //setter for name
    public void setName(String name){
        this.name = name;
    }
    
    //Setter for grade (ensures value is 0-100)
    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100){
            this.grade = grade;
        } else {
            this.grade = 0;
            System.out.println("Invalid grade! Grade is 0.");
            
        }
    }
}

//Excution Example
public class Main {
    public static void main(String[] args){
        Student student = new Student("Crystal" , 90 );

        //Get name and grade
        System.out.println(student.getStudentInfo());

        //Update name and grade
        student.setName("Jebet");
        student.setGrade(105);

        //Print updated student info 
        System.out.println(student.getStudentInfo());
    }
}
