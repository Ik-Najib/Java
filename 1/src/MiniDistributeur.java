import java.util.Scanner;
public class MiniDistributeur {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int choix;
       int input;
       do{
           System.out.println("1 = solde");
                   System.out.println("2 = depot");
                   System.out.println("3 = Retrait");
                   System.out.println("4 = Quitter");
                   choix = scanner.nextInt();
           switch(choix){
               case 1:
                   System.out.println("votre solde est 363536");
                   break;
               case 2:
                   System.out.println("entre le montant");
                   input = scanner.nextInt();
                   System.out.println(input +" effectue avec success.");
                   break;
               case 3:
                   System.out.println("entre le montant");
                   input = scanner.nextInt();
                   System.out.println(input +" etait retrait avec success.");
                   break;
               case 4:
                   System.out.println("Merci d'avoir utilisé le distributeur !");
                   break;
                   default:
                       System.out.println("Veuillez entrer un choix !");
           }
           System.out.println();
       }while (choix != 4);
    }
}
