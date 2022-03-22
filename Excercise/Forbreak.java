import java.util.*;
class Forbreak {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            //System.out.println(Home1.boxVolume(4,6,2));
            Home1 _objhome=new Home1();
            System.out.println(_objhome.boxVolume(4,6,2));
        }
    }
}