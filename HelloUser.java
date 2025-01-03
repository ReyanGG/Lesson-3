import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 side of Triangle");
        int a = sc.nextInt();

        System.out.println("Enter 2 side of Triangle");
        int b = sc.nextInt();

        System.out.println("Enter 3 side of Triangle");
        int c = sc.nextInt();

        float s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println(area);

    }
}