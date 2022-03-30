import java.util.*;

public class Tardies {

    public Student[] students;   //list of students
    public int numStudents;      //size of array

    public Tardies(){
        students = new Student[50];
        numStudents = 0;
    }

    public void enterData() {
        Scanner myVar;

        System.out.println("New Student:");
        System.out.println("Enter student's first name:");
        myVar = new Scanner(System.in);
        String firstName = myVar.nextLine();
        System.out.println("Enter student's last name:");
        myVar = new Scanner(System.in);
        String lastName = myVar.nextLine();
        System.out.println("Enter student's number of tardies:");
        myVar = new Scanner(System.in);
        int tardies = myVar.nextInt();

        Student newStudent = new Student(firstName, lastName, tardies);
         this.students[numStudents] = newStudent;
         numStudents++;
        }

    public void summaryReport(){
        int sum = 0;
        for(int i = 0; i < numStudents; i++)
            sum = sum + students[i].getTardies();
        System.out.println("Total Amount of Tardies: " + sum);
        for( int i = 0; i < numStudents; i++) {
            System.out.println(this.students[i].toString());
        }


    }
}
