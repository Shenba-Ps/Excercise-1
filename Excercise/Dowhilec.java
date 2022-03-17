import java.util.*;
class Dowhilec{
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i == 7) {
                continue;
            }

            System.out.println(i);
            i++;
        }

        while (i<=10);
    }
}