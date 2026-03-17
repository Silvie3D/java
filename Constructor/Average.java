import java.util.Scanner;

class Average {
    int a, b, c;

    Average(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    float avgData() {
        return (a + b + c) / 3.0f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Average obj = new Average(x, y, z);
        System.out.println("Average = " + obj.avgData());
    }
}