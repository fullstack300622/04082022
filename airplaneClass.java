public class Airplan {
    public Airplan(String n, int c,int s) {
        name = n;
        capacity = c;
        speed=s;{
            if (speed>1000){
                this.speed=1000;
            }
        }
    }

    public String name;
    public int capacity;
    public int speed;
    public String manufacturing;
    public int model;

    public void printName() {
        System.out.println("my name " + name);
    }

    public void printSpeed() {
        System.out.println("maximum speed " + speed);
    }

    public void printCapacity() {
        System.out.println("maximum capacity " + capacity);
    }

    public void printModel() {
        System.out.println("my model " + model);
    }

    public void printManufacturing() {
        System.out.println("my manufacturing " + manufacturing);
    }
    public static void empty(){

    }

}
