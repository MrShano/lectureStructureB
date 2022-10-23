import PartA.*;
import PartA.Module;

public class Main {

    public static void main (String[] args){
        Student s1, s2, s3;
        s1 = new Student("Barry Scott", "12/06/2000");
        s2 = new Student("Scott Murphy", "06/12/1999");
        s3 = new Student("Jim Bob", "26/01/2001");

        Lecturer l1, l2, l3;
        l1 = new Lecturer("Peter Corks", "01/10/1980");
        l2 = new Lecturer("Jean Mann", "14/03/1976");
        l3 = new Lecturer("River Tube", "25/07/1991");

        Module m1, m2, m3;
        m1 = new Module("System on chip 1", "Soc1" );
        m2 = new Module("Software Eng 3", "Soft3" );
        m3 = new Module("Digital systems processing", "DSP9" );

        Course ece, cs;
        ece = new Course("Electronic & Computer Engineering");
        ece.setStartDate("05/09/2019");
        ece.setEndDate("05/06/2023");

        m1.addStudent(s1);
        m1.addStudent(s2);
        m2.addStudent(s1);
        m2.addStudent(s2);
        m2.addStudent(s3);
        m3.addStudent(s1);
        m3.addStudent(s2);
        m3.addStudent(s3);
        m3.removeStudent(s3);

        m1.addLecturer(l1);
        m2.addLecturer(l2);
        m3.addLecturer(l3);
        m3.addLecturer(l2);
        m3.removeLecturer(l2);

        ece.addModule(m1);
        ece.addModule(m2);
        ece.addModule(m3);

        System.out.println(ece);
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(m1);
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(m2);
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(m3);
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(s1);
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(s2);
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(s3);

    }
}