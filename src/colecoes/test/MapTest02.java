package colecoes.test;

import colecoes.dominio.Consumidor;
import colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William");
        Consumidor consumidor2 = new Consumidor("Arthur");

        Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9, 0);
        Manga manga2 = new Manga(1L, "Berserk", 8.9, 5);
        Manga manga3 = new Manga(4L, "Pokemon", 3.2, 0);
        Manga manga4 = new Manga(3L, "Attack on Titan", 11.20, 2);
        Manga manga5 = new Manga(2L, "Naruto", 2.99, 0);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4); //explicação do código
        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
