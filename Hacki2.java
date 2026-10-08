
import java.util.Scanner;

class Student {
    String studentName, courseName;
    int rollNumber, courseCredits;
    double marks;

    // Parameterized constructor
    Student(String n, int r, double m, String c, int cr) {
        studentName = n;
        rollNumber = r;
        marks = m;
        courseName = c;
        courseCredits = cr;
    }

    double calculateFee() {
        return courseCredits * 1500;
    }

    boolean checkEligibility() {
        return marks >= 50;
    }

    double calculateScholarship() {
        if (marks >= 85)
            return 20;
        else if (marks >= 70)
            return 10;
        else
            return 0;
    }

    double calculateFinalFee() {
        double fee = calculateFee();
        return fee - (fee * calculateScholarship() / 100);
    }

    void displayDetails() {
        double fee = calculateFee();
        double scholarship = calculateScholarship();

        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + courseName);
        System.out.println("Credits: " + courseCredits);
        System.out.println("Fee: Rs. " + fee);
        System.out.println("Scholarship: " + scholarship + "%");
        System.out.println("Final Fee: Rs. " + calculateFinalFee());
    }
}

public class Hacki2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        System.out.print("Enter credits: ");
        int credits = sc.nextInt();

        Student s = new Student(name, roll, marks, course, credits);

        if (s.checkEligibility())
            s.displayDetails();
        else
            System.out.println("Not eligible for registration.");

        sc.close();
    }
}
