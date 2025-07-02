import java.util.Scanner;

public class Calculator_2 {
    public static void main(){
    }
    public void add(int a,int b){
        int valueA=a;
        int valueB=b;
        int result = a+b;
        System.out.println(result);

    }
    public void subtract(int a,int b){
        int valueA=a;
        int valueB=b;
        int result = a-b;
        System.out.println(result);

    }
    public void multiply(int a,int b){
        int valueA=a;
        int valueB=b;
        int result = a*b;
        System.out.println(result);

    }
    public void division(int a,int b){
        int valueA=a;
        int valueB=b;
        int result = a%b;
        System.out.println(result);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int valueA = sc.nextInt();
        System.out.println("Enter Number:");
        int valueB = sc.nextInt();

        Calculator_2 obj = new Calculator_2();

        obj.add(valueA,valueB);
        obj.subtract(valueA,valueB);
        obj.multiply(valueA,valueB);
        obj.division(valueA,valueB);

    }
}
