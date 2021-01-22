class Student {
    public void name_of_student(String name){
        System.out.println("My name is " + name);
    }
    public void grade(double grade) {
        System.out.println("My grade is:" + grade);
    }
}


public class InstanceMethod {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name_of_student("Stacy");
        student1.grade(4.21);

        Student student2 = new Student();
        student2.name_of_student("Jake");
        student2.grade(9.0);
    }
}
