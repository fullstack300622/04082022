import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int x = 5;
        //Scanner s1
        Car car1 = new Car(220,"Lamborgini");
        Car car2 = new Car(80,"Honda");
        Car car3 = new Car("Honda");

//        car1.color="RED";
//        car1.name="Lamborgini";
//        car1.speed=220;
//
//        car2.color="White";
//        car2.speed=80;
//        car2.name="Honda";
//
        System.out.println(car1.name);
        System.out.println(car2.name);

        car1.goMaxSpeed();
        car2.goMaxSpeed();

        car1.getColor();
        car2.getColor();


//        Targil:
//        Create Class named "Person"
//        Create two instance variables Name and Age
//        Create method in the class "printMyName"
//        Create method in the class "printMyAge"
//        Create 2 instances (objects) of this class
//        Add name and age to the objects
//        Call both methods in the objects


//        Car.whatIam();


//    Targil: Create AirPlane class
//    //create instance variables: name, capacity, speed, weight, manufacturing date, model
//    create 3 instance of different airplanes
//    create method that tell maximum speed of the plane
//    etgar: if trying to initiate plane object with speed higher than 1000, speed should be 1000!
//    for example if Trying to create plane with speed 1200, it should initiate the plane with speed 1000

    }
}
