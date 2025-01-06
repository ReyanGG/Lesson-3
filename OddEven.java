import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int m = sc.nextInt();

        if (m > 0) {
            if (m % 2 == 0) {
                System.out.println("Even");
            } else if (m % 2 == 1) {
                System.out.println("odd");
            }

        } else if (m == 0) {
            System.out.println("neither odd nor even");
        } else if (m < 0) {
            System.out.println("negative");
        } else {

            System.out.println("error");
        }

    }
}