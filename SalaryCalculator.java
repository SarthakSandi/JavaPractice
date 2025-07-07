import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee level (1-4): ");
        int level = sc.nextInt();

        double baseSalary = 0;
        double hraPercentage = 0;

        switch (level) {
            case 1:
                baseSalary = 50000;
                hraPercentage = 30;
                break;
            case 2:
                baseSalary = 40000;
                hraPercentage = 25;
                break;
            case 3:
                baseSalary = 30000;
                hraPercentage = 20;
                break;
            case 4:
                baseSalary = 20000;
                hraPercentage = 15;
                break;
            default:
                System.out.println("Invalid level entered!");
                return;
        }

        double hra = (hraPercentage / 100) * baseSalary;
        double totalSalary = baseSalary + hra;

        System.out.println("Total Salary: Rs" + totalSalary);
    }
}