public class Student {
    private String studentId;
    private  String studentName;
    private int age;
    private  String sex;
    private double mark;

    public Student(){

    }

    public Student(String studentId, String studentName, int age, String sex, double mark) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.mark = mark;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void displayData() {
        System.out.println("ID: " + studentId);
        System.out.println("Ten: " + studentName);
        System.out.println("Tuoi: " + age);
        System.out.println("Gioi tinh: " + sex);
        System.out.println("Diem: " + mark);
        System.out.println("--------------------");
    }
}
