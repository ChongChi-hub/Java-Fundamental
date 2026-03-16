public class Main {
    static void main(String[] args) {
        Student stu1 = new Student(1,"Student 1");
        Student stu2 = new Student(2,"Student 2");


        stu1.displayStudent();
        stu2.displayStudent();

        Student.displayTotalStudent();
    }
}