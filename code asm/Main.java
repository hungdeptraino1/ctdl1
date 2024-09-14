import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<Student> studentlist = new ArrayList<>();
    
    public static void main (String args[]){
        
        while(true){
            System.out.println("\nMenu \n0: Student information \n1: Add Student \n2: Edit Student \n3: Delete Student \n4: Sort Student \n5: Search Student \n6: Exit");
            System.out.print("Enter your choice: ");
            int input = sc.nextInt();
            if (input == 0){
                System.out.println("student");
            }
            else if (input == 1){
                addStudent();               
            }
            else if (input == 2){
                editStudent();
                
            }
            else if (input == 3){
                deleteStudent();
                
            }
            else if (input == 4){
                sortStudent();
                
            }
            else if (input == 5){
                searchStudent();
                
            }
            else if (input == 6){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid choice");
            }

        }
        sc.close();
        
    }
    public static void addStudent(){
        System.out.print("Enter number of student: ");
        int numStu = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numStu; i ++){
            System.out.println("Enter Student Id: ");
            String studentId = sc.nextLine();
            System.out.println("Enter Student Name: ");
            String studentName = sc.nextLine();
            System.out.println("Enter Student Marks: ");
            double studentMarks = sc.nextDouble();
            sc.nextLine();

            Student student = new Student(studentId, studentName, studentMarks);
            studentlist.add(student);
        }
    }
    public static void deleteStudent(){
        System.out.print("Enter Student Id to delete: ");
        String studentId = sc.nextLine();

        boolean found = false;
        for (Student student : studentlist) {
            if (student.getStudentid().equals(studentId)) {
                studentlist.remove(student);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student with ID " + studentId + " has been deleted.");
        } else {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }


    public static void sortStudent(){
        studentlist.sort(Comparator.comparingDouble(Student::getMarks));
        System.out.println("Students sorted by marks:");
        for (Student student : studentlist) {
            System.out.println("Student ID: " + student.getStudentid() + ", Name: " + student.getName() + ", Marks: " + student.getMarks());
        }
    }

    public static void searchStudent(){
        System.out.print("Enter Student Id to search: ");
        String studentId = sc.nextLine();

        boolean found = false;

        for (Student student : studentlist) {
            if (student.getStudentid().equals(studentId)) {
                System.out.println("Student found:");
                System.out.println("Name: " + student.getName() + ", Marks: " + student.getMarks());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + studentId + " not found.");
        }
    }

    public static void editStudent(){
        System.out.print("Enter Student ID to edit: ");
        String studentId = sc.nextLine();

        for (Student student : studentlist) {
            if (student.getStudentid().equals(studentId)) {
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Enter new name for the student: ");
                String newName = sc.nextLine();
                
                System.out.print("Enter new marks for the student: ");
                double newMarks = sc.nextDouble();

                student.setName(newName);
                student.setMarks(newMarks);

                System.out.println("Student information updated successfully.");
                //return;
                sc.close();
            }
        }

    }
       
    
}

        


