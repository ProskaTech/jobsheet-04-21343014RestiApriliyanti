/*
 * Created by 21343014_Resti Apriliyanti
 */

public class TestOR {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = true;

        //demonstrasi ||
        test = (1 < j) || (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);

        //demonstrasi &
        test = (1 < j) | (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }    
}
