package colecoes.test;

import colecoes.dominio.Smartphone;

public class EqualTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "IPhone");
        Smartphone s2 = new Smartphone("1ABC1", "IPhone");
        System.out.println(s1.equals(s2));
    }
}
