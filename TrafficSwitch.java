import java.util.Scanner;
public class TrafficSwitch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter traffic light color:");
        sc.nextLine(); 
        String color = sc.nextLine().toLowerCase();


        switch (color) {
            case "red": System.out.println("Stop"); break;
            case "green": System.out.println("Go"); break;
            case "yellow": System.out.println("Wait"); break;
            default: System.out.println("Invalid color");
        }

        sc.close();


    }
}