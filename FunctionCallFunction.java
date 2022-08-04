import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        printHelloWorld();

//        System.out.println(sum);
//        System.out.println(getSum(20,30));
//                int sum = getSum(5,10);
//        Scanner scanner = new Scanner(System.in);
//        int intNum = scanner.nextInt();
//        System.out.println(intNum);

        functionA();
    }

    public static void functionA(){
        System.out.println("I am function A");
        functionB();
    }

    public static void functionB(){
        System.out.println("I am function B");
        functionA();
    }


    public static void printHelloWorld() {
        System.out.println("Hello world");
    }
    public static void printSum(int x, int y) {
        System.out.println(x+y);
    }
    public static int getSum(int x, int y) {
        return (x + y);
    }



}
