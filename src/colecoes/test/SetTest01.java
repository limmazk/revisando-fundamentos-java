package colecoes.test;

import colecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    static void main(String[] args) {
        Set<Manga>  mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9, 0));
        mangas.add(new Manga(5L, "Berserk", 8.9, 5));
        mangas.add(new Manga(5L, "Pokemon", 3.2, 0));
        mangas.add(new Manga(5L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(5L, "Naruto", 2.99, 0));

        for(Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
