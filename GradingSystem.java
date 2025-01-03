import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks ");
        int m = sc.nextInt();

        if (m > 90 & m < 101) {
            System.out.println("O");
        } else if (m > 80 & m < 91) {
            System.out.println("A+");

        } else if (m > 70 & m < 81) {
            System.out.println("A");

        } else if (m > 60 & m < 71) {
            System.out.println("B");
        } else if (m > 50 & m < 61) {
            System.out.println("C");
        } else {
            System.out.println("error");

        }

        sc.close();
    }
}