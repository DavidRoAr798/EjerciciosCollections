import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista =new ArrayList<>();
        Integer temp;

        for (int i=1; i<=20; i++){
            temp = (int) (Math.random()*100);
            lista.add(temp);
        }

        System.out.println("La lista de numeros random " + lista);
        Collections.sort(lista);
        System.out.println("La lista random ordenada " + lista);
    }
}
