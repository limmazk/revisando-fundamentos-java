package StreamApiAndLambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.IO.print;

public class Main {
    static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Roberto", 30));
        clientes.add(new Cliente("Pedro", 20));
        clientes.add(new Cliente("Carlos", 40));
        clientes.add(new Cliente("Arthur", 10));
        clientes.add(new Cliente("Francisco", 20));
        clientes.add(new Cliente("Marcos", 15));
        clientes.add(new Cliente("Paulo", 70));
        clientes.add(new Cliente("Gustavo", 18));

        List<String> nomes = List.of("Arthur", "João", "Maria", "Ana");

        nomes.stream()
                .filter(nome -> nome.startsWith("A"))
                .forEach(System.out::println);
    }
}

