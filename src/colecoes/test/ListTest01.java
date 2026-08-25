package colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    static void main(String[] args) {
        List<String> nomes = new ArrayList();
        nomes.add("Arthur");
        nomes.add("William");
        nomes.remove(0);

        for (String nome : nomes){
            System.out.println(nome);
        }

        nomes.add("Suane");
        System.out.println("------------");
        for (int i = 0; i< nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
