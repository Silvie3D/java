import java.util.Scanner;

class Rectangle {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        Rectangle obj = new Rectangle(l, b);
        System.out.println("Area = " + obj.area());
    }
}