package colecoes.test;

import colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "IPhone");
        Smartphone s2 = new Smartphone("22222", "IPhone");
        Smartphone s3 = new Smartphone("33333", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        for (Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }
        Smartphone s4 = new Smartphone("33333", "Samsung");
        System.out.println(s4.equals(s3));
        System.out.println(smartphones.contains(s4));
        int indexSmartphone4 = smartphones.indexOf(s4); //posicao dele
        System.out.println(indexSmartphone4);
    }
}
