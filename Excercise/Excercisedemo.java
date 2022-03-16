import java.util.*;
class Excercisedemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the amount");
        String currency = scan.nextLine();
        switch (currency) {
            case "10" : {
                System.out.println("100");
                break;
            }
            case "20" : {
                System.out.println("200");
                break;
            }
            case "22" : {
                System.out.println("300");
                break;
            }
            default: {
                System.out.println("400");
            }
        }
    }
}
