import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Person x = new Person();
        System.out.print("Enter your Name : ");
        x.setName(in.next());
        System.out.print("Enter your age : ");
        x.setAge(in.nextInt());
        System.out.print("Enter your city : ");
        x.setCity(in.next());
        System.out.print("Enter your job : ");
        x.setJob(in.next());
        System.out.print("Enter your Salary : ");
        x.setSalary(in.nextFloat());
    }
}