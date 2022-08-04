public class Car {
    //instance variables
    public String name;
    public int speed;
    public String color;

    public Car(int speed, String name) {
        this.name = name;
        this.speed = speed;
    }

    public Car(String n) {
        name = n;
    }

    public void goMaxSpeed() {
        System.out.println("I am driving at max speed " + speed);
    }

    public void getColor() {
        System.out.println("My color is " + color);
    }

    public static void whatIam(){
        System.out.println("I am function inside the class ");
    }


}
