import java.util.Scanner;   // Scanner wird importiert damit User auch Eingaben machen kann
import java.util.Random;    // Random erstellt eine zufällige Zahl die gesetzt wird


public class Main {
    public static void main(String[] args) {






        int versuche = 0; // Integer "Versuche" wird definiert, dieser zeigt am Ende des Spiels die Versuche an
        Scanner userinput = new Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(20); // Zufällige Zahl von 1-20 wird generiert


        while (true){ // While Schleife läuft solange bis gesuchte Zahl gefunden wird
            System.out.println("Hallo, erraten Sie meine Zahl von 1-20 :=) ");
            int userinput1 = Integer.valueOf(userinput.nextLine());

            if (userinput1 == random){ // If-Abfrage addiert den gebrauchten Versuch um 1 und gibt bei richtiger Zahl den unteren Text aus und Schleife bricht durch "Break" ab
                versuche++;
                System.out.println("GUT GEMACHT DU HAST MEINE ZAHL " + random + " ERRATEN UND NUR " + versuche + " VERSUCHE GEBRAUCHT");
                break;
            } if (userinput1 > random){ // Wenn die eingegebene Zahl zu groß ist, wird der unten stehende Text ausgegeben, Versuch wird um 1 addiert
                System.out.println("ZAHL ZU GROß ");
                versuche++;
                continue;
            } if (userinput1 < random){ // Wenn die eingegebene Zahl zu klein ist, wird der unten stehende Text ausgegeben, Versuch wird um 1 addiert
                System.out.println("ZAHL ZU KLEIN ");
                versuche++;
            }

        }







































    }
}