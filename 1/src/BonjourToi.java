import java.util.Scanner;


public class BonjourToi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("quel est ton nom? ");
        String nom = input.nextLine();
        System.out.println("bonjour "+ nom);
        input.close();

    }
}
