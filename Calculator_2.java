import java.util.Scanner;

public class Calculator_2 {
    public static void main(){
    }
    public void add(int a,int b){
        int valueA=a;
        int valueB=b;
        int result = a+b;
        System.out.println("addition" +result);

    }
    public void subtract(float a,float b){
        float floatValue1=2.0f;
        float floatValue2=4.0f;
        float floatResult = floatValue1 - floatValue2;
        System.out.println("subtraction" +floatResult);

    }
    public void multiply(double a,double b){
        double doubleValueA=2.0D;
        double doubleValueB=5.0D;
        double doubleResult = doubleValueA*doubleValueB;
        System.out.println("Multiplcation: " +doubleResult);

    }
    public void division(double a,double b){
        double doubleValueA=8.0D;
        double doubleValueB=2.0D;
        double doubleResult = doubleValueA/doubleValueB;
        System.out.println("Division: " +doubleResult);

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
