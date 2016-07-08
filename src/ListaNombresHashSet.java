import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaNombresHashSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<String> names = new LinkedHashSet<>();//Linked y no solo hash para conservar
        //orden de inserción


        System.out.println("Introduce los nombres, fin para terminar: ");
        String name = sc.nextLine();
        names.add(name);

        while (!name.equalsIgnoreCase("fin")) {
            System.out.println("Introduce nombre: ");
            name = sc.nextLine();
            names.add(name);
        }

        System.out.println("La lista de nombres sin repetidos: " + names);
    }
}
