import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner myobj = new Scanner(System.in);

        System.out.println("Hi employee, enter your name:");
        String name = myobj.nextLine();

        System.out.println("Enter your role:");
        String role = myobj.nextLine();

        System.out.println("Enter your experience:");
        int experience = myobj.nextInt();

        System.out.println("Enter your salary:");
        double salary = myobj.nextDouble();

        System.out.println("Name = " + name +
                           ", Role = " + role +
                           ", Experience = " + experience +
                           ", Salary = " + salary);

        myobj.close();
    }
}