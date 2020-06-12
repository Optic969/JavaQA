package Homework.HW21EncapsulationInheritance.Test1;

public class Student {
    private StringBuilder name;

    public String getName() {
        return name.toString();

    }
    public void setName(String name) {
        if(name.length()>=3){
            this.name =  new StringBuilder (name);
        }else{
            System.out.println("Name must be more than 3 symbols ");
        }

    }

    private int course;

    public int getCourse() {
        return course;

    }

    public void setCourse(int course) {
        if(course>=1 && course<=4) {
            this.course = course;
        }else{
            System.out.println("The number of course is wrong");
        }
    }

    private  int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade>=1 && grade<=10) {
            this.grade = grade;
        }else{
            System.out.println("The grade is wrong");
        }
    }
    @Override
    public String toString() {

        String result ="Info: " + "Name " + getName() + " Course " + getCourse() + " Grade " + getGrade();
        return result;
    }

}
