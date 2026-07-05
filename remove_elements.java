import java.util.List;

class remove_elements {

    public static void main(String[] args) {
        
        List<String> names = List.of("bob", "joy", "juice", "juliet", "bob");

        names.removeIf(name->name.startsWith("b"));

        names.forEach(System.out::println);


    }

}