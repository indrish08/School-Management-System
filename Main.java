import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher thomas = new Teacher(1, "Thomas", 500);
        Teacher darin = new Teacher(2, "Darin", 700);
        Teacher jennie = new Teacher(3, "Jennie", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(thomas);
        teacherList.add(darin);
        teacherList.add(jennie);

        Student ram = new Student(1, "Ram", 4);
        Student rakshith = new Student(2, "Rakshith Vasudev", 12);
        Student rabbi = new Student(3, "Rabbi", 5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(ram);
        studentList.add(rabbi);
        studentList.add(rakshith);

        School mhss = new School(teacherList, studentList);

        Teacher megan = new Teacher(6, "Megan", 900);

        mhss.addTeacher(megan);

        ram.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("MHSS has earned $" + mhss.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        thomas.receiveSalary(thomas.getSalary());
        System.out.println("MHSS has spent for salary to " + thomas.getName()
                + " and now has $" + mhss.getTotalMoneyEarned());

        jennie.receiveSalary(jennie.getSalary());
        System.out.println("MHSS has spent for salary to " + jennie.getName()
                + " and now has $" + mhss.getTotalMoneyEarned());

        System.out.println(rakshith);

        darin.receiveSalary(darin.getSalary());

        System.out.println(darin);
    }
}
