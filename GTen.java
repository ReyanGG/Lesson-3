import java.util.Scanner;

public class GTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int a = sc.nextInt();
        if (a > 10) {
            System.out.println("Yes I’m Greater");

        } else {
            System.out.println("Yes I’m not Greater");
        }
        sc.close();

    }
}
