import java.util.Scanner;
public class Home2 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int x = in.nextInt();
        System.out.print("Input the Second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number: ");
        int z = in.nextInt();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }

    public static int smallest(int x, int y, int z)
    {
        return Math.min(Math.min(x, y), z);
    }
}