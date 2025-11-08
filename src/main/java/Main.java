import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        /**
         * Hier wird die FileHandler Methode angewendet um mit ihr eine Texdatei von Messungen
         * einzuselen und in in einer Liste von "Bundesländern abzuspeichern.
         */
        List<Bundesland> tempMessungen = (FileHandler.readMeasurements("temperaturmessungen_oesterreich.txt"));

        tempMessungen.forEach(System.out::println);
        System.out.println();
        System.out.println(tempMessungen.getFirst());
        System.out.println();
        System.out.println(tempMessungen.get(0));

    }
}
