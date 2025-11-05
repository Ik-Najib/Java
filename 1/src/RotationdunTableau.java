import java.util.Scanner;
import java.util.ArrayList;

public class RotationdunTableau {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        ArrayList<Integer> srebmun = new ArrayList<>();
                for ( int i = numbers.length - 1; i >= 0; i-- ) {

                    srebmun.add(numbers[i]);
                }
                System.out.println(srebmun);
    }
}
