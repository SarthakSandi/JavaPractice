import java.util.Scanner;

public class Calculator {
    public static void main(){
    }
    public void add(){

    }
    public void subtract(){

    }
    public void multiply(){

    }
    public void division(){

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        Calculator obj = new Calculator();

        int result = a+b;
        System.out.println(result);
        obj.add();
        obj.division();
        obj.multiply();
        obj.subtract();
    }
}