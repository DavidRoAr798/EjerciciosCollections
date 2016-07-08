import java.util.*;

public class FunciónEliminaRepetidos {

    static List eliminaRepetidos(List c) {
        Set namesRandom = new LinkedHashSet<>(c);
        return new ArrayList<>(namesRandom);
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los nombres, fin para terminar: ");
        String name = sc.nextLine();
        names.add(name);

        while (!name.equalsIgnoreCase("fin")) {
            System.out.println("Introduce nombre: ");
            name = sc.nextLine();
            names.add(name);
        }

        System.out.println("La lista original: " + names);
        names = eliminaRepetidos(names);
        System.out.println("Lista sin repetidos: " + names);

    }
}

