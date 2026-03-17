import java.util.Scanner;

class Student {
    int m1, m2, m3;

    Student(int a, int b, int c) {
        m1 = a;
        m2 = b;
        m3 = c;
    }

    int totalMarks() {
        return m1 + m2 + m3;
    }

    void display() {
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 marks: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Student obj = new Student(a, b, c);
        obj.display();
        System.out.println("Total = " + obj.totalMarks());
    }
}