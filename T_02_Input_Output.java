import java.util.Scanner;

public class T_02_Input_Output {

    public static void main(String[] args) {

        // * Input In Java.
        Scanner sc = new Scanner(System.in);

        // Integer Input.
        int age = sc.nextInt();

        // String Input.
        String firstName = sc.next();

        // * Output In Java.
        System.out.println("Your Age Is:- " + age);
        System.out.println("Your FirstName Is:- " + firstName);

        sc.close();
    }
}
