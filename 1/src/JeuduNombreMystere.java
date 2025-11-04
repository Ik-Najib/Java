import java.util.Random;
import java.util.Scanner;

public class JeuduNombreMystere {   // évite les accents dans le nom de classe
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Générer un nombre aléatoire entre 1 et 10
        int nombreSecret = rand.nextInt(10) + 1;  // nextInt(10) → 0-9, +1 → 1-10
        int t9mira = 0;

        System.out.println("Devinez un nombre entre 1 et 10");

        while (t9mira != nombreSecret) {
            System.out.print("Votre proposition : ");
            t9mira = input.nextInt();

            if (t9mira < nombreSecret) {
                System.out.println("Trop petit ! Essayez encore.");
            } else if (t9mira > nombreSecret) {
                System.out.println("Trop grand ! Essayez encore.");
            } else {
                System.out.println("Bravo ! Vous avez trouvé.");
            }
        }

        input.close();
    }
}
