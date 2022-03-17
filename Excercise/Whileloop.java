import java.util.*;
class Whileloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of i");
        int i = scan.nextInt();
        System.out.println("enter the value of b");
        int b = scan.nextInt();
        System.out.println("enter the value of c");
        int c = scan.nextInt();

        while (i <= b) {
            if (i % c == 0) {
                System.out.println(i);
            }
            i++;

        }
    }
}

