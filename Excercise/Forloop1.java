import java.util.*;
class Forloop1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter starting point");
        int a = scan.nextInt();
        System.out.println("enter ending point");
        int b = scan.nextInt();
        System.out.println("enter divident number");
        int c=scan.nextInt();

        for (int i = a; i <= b; i++){//i=iteration
            if (i%c==0) {
                System.out.println(i);
            }
            }
    }
}