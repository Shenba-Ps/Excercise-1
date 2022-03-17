import java.util.*;
class Array{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] cars={"tata","maruti","bmw","audi"};
        System.out.println("enter the cars name ");
        String a=scan.nextLine();
       // System.out.println(cars.length);
       // System.out.println(cars[0]);
        //System.out.println(cars[1]);
       // System.out.println(cars[2]);
      //  System.out.println(cars[3]);
        for (int i=0;i<cars.length;i++){
            if(cars[i].equals(a)){
                continue;

            }
            System.out.println(cars[i]);
         //   System.out.println(cars[i]);
        //for (String a:cars){
           // System.out.println(a);
        }
        }

    }
