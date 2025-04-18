// StudentOperations.java

import java.util.ArrayList;
import java.util.Scanner;

class StudentOperations {
    private ArrayList<Student> students;
    private Scanner scan;

    public StudentOperations() {
        students = new ArrayList<>();
        scan = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.print("Enter Name: ");
        String name = scan.nextLine();
        System.out.print("Enter PRN: ");
        int prn = scan.nextInt();
        scan.nextLine(); // Consume newline
        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dob = scan.nextLine();
        System.out.print("Enter Branch: ");
        String branch = scan.nextLine();
        System.out.print("Enter Batch: ");
        String batch = scan.nextLine();
        System.out.print("Enter CGPA: ");
        float cgpa = scan.nextFloat();
        scan.nextLine();
        students.add(new Student(name, prn, dob, branch, batch, cgpa));
        System.out.println("Student added successfully.");
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

    public void searchStudent() {
        System.out.println("Search by: 1. PRN  2. Name  3. Position");
        int option = scan.nextInt();
        scan.nextLine();
        switch (option) {
            case 1:
                System.out.print("Enter PRN: ");
                int prn = scan.nextInt();
                for (Student student : students) {
                    if (student.getPrn() == prn) {
                        student.display();
                        return;
                    }
                }
                System.out.println("Student not found.");
                break;
            case 2:
                System.out.print("Enter Name: ");
                String name = scan.nextLine();
                for (Student student : students) {
                    if (student.getName().equalsIgnoreCase(name)) {
                        student.display();
                        return;
                    }
                }
                System.out.println("Student not found.");
                break;
            case 3:
                System.out.print("Enter Position (1-based index): ");
                int pos = scan.nextInt();
                if (pos > 0 && pos <= students.size()) {
                    students.get(pos - 1).display();
                } else {
                    System.out.println("Invalid position.");
                }
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    public void updateStudent() {
        System.out.print("Enter PRN of student to update: ");
        int prn = scan.nextInt();
        scan.nextLine();
        for (Student student : students) {
            if (student.getPrn() == prn) {
                System.out.print("Enter new Name: ");
                student.setName(scan.nextLine());
                System.out.print("Enter new Date of Birth (YYYY-MM-DD): ");
                student.setDob(scan.nextLine());
                System.out.print("Enter new Branch: ");
                student.setBranch(scan.nextLine());
                System.out.print("Enter new Batch: ");
                student.setBatch(scan.nextLine());
                System.out.print("Enter new CGPA: ");
                student.setCgpa(scan.nextFloat());
                scan.nextLine();
                System.out.println("Student details updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent() {
        System.out.print("Enter PRN of student to delete: ");
        int prn = scan.nextInt();
        scan.nextLine();
        for (Student student : students) {
            if (student.getPrn() == prn) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
