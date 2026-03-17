import java.util.Scanner;

class Power {
    int n;

    Power(int x) {
        n = x;
    }

    int square() {
        return n * n;
    }

    int cube() {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        Power obj = new Power(x);
        System.out.println("Square = " + obj.square());
        System.out.println("Cube = " + obj.cube());
    }
}