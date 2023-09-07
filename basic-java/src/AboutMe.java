import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Tell me your name.");
        String name = scanner.next();

        System.out.println("Tell me your last name.");
        String lastname = scanner.next();

        System.out.println("Tell me your age.");
        int age = scanner.nextInt();

        System.out.println("Tell me your height (meters).");
        double height = scanner.nextDouble();

        // String name = args[0];
        // String lastname = args[1];
        // int age = Integer.valueOf(args[2]);
        // double height = Double.valueOf(args[3]);

        System.out.println("Hi, this is " + name + " " + lastname);
        System.out.println("I'm " + age + " y'o.");
        System.out.println("My height is " + height + " m.");

    }
}
