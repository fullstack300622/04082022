public class Main {
    
    public static void printSum(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        printSum(5,10);
        printSum(20);
        printSum(" hello ");
        printSum();

        //targil
        //create two methods with same name, one method get name other gets name and age
        printAboutYou("Beni");
        printAboutYou("Beni", 23);
    }
    public static void printAboutYou(String name , int age){
        System.out.println("Your name is "+name+ " and your age is "+age);
    }

    public static void printAboutYou(String name){
        System.out.println("Your name is "+name);
    }

    public static void printSum(String s) {
        System.out.println("PRINT SUM ?! "+s);
    }

    public static void printSum() {
        System.out.println("Hello world");
    }

    public static void printSum(int y) {
        System.out.println(y);
    }


}
