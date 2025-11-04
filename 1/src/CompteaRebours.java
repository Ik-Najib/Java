import java.util.Scanner;
public class CompteaRebours {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Number: ");
    int number = input.nextInt();
    for (int i = number; i >= 0; i--){
        System.out.println(i);
    }
}
}

