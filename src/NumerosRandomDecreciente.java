import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class NumerosRandomDecreciente {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Integer temp;

        for (int i = 1; i <= 20; i++) {
            temp = (int) (Math.random() * 100);
            lista.add(temp);
        }

        System.out.println("La lista de numeros random " + lista);
        EnterosDecrecientes comp = new EnterosDecrecientes();
        Collections.sort(lista, comp);
        System.out.println("La lista de numeros random en orden decreciente" + lista);

    }
}

class EnterosDecrecientes implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
