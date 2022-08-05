public class Main {
    public static void main(String[] args) {

        Airplan airplan1 = new Airplan("f35", 1,750);

        Airplan airplan2 = new Airplan("Boeing 747", 350,950);

        Airplan airplan3 = new Airplan("777", 220,2000);


        airplan1.manufacturing = "abs";
        airplan1.model = 1947;


        airplan2.manufacturing = "boeing";
        airplan2.model = 1955;


        airplan3.manufacturing = "rte";
        airplan3.model = 1987;
        

        System.out.println("composition 1");
        airplan1.printName();
        airplan1.printModel();
        airplan1.printSpeed();
        airplan1.printCapacity();
        airplan1.printManufacturing();

        System.out.println("composition 2");
        airplan2.printName();
        airplan2.printModel();
        airplan2.printSpeed();
        airplan2.printCapacity();
        airplan2.printManufacturing();

        System.out.println("composition 3");
        airplan3.printName();
        airplan3.printModel();
        airplan3.printSpeed();
        airplan3.printCapacity();
        airplan3.printManufacturing();
        Airplan.empty();


    }
}
