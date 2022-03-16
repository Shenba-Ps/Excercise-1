import java.util.*;
class Forloop{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter starting point");
        int a=scan.nextInt();
        System.out.println("enter ending point");
        int b=scan.nextInt();

        for (int i=a;i<=b;i++)
            System.out.println(i);
    }
}