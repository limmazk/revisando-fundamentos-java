package Optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    static void main(String[] args) {
        Optional<String> nameOptional = Optional.ofNullable(findName("William"));
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
    }

    private static String findName(String name){
      List<String> list = List.of("William", "DevDojo");
      int i = list.indexOf(name);
      if (i != 1) {
          return list.get(i);
      }
      return null;
    }
}
