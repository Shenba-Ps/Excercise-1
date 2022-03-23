class ClassObjectDemo{
    public static void main(String[] args) {
        Car car1 = new Car(33.3, "red", 40.4);
        System.out.println(car1.have_ac);
        System.out.println(car1.bootspace);
        System.out.println(car1.colour);
        System.out.println(car1.fuelcapacity);
    }
}
   class Car {
public boolean have_ac=true;
public double bootspace;
public String colour;
public  double fuelcapacity;
         Car(double bootspace,String colour,double fuelcapacity){
        this.bootspace=bootspace;
        this.colour=colour;
        this.fuelcapacity=fuelcapacity;

        }
}

