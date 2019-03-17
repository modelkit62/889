package optionsals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {


        App app = new App();
        app.metodo();
    }

    private void metodo() {
        List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");

        Optional<List<String>> names = Optional.of(companyNames);

        names.stream().forEach(s-> System.out.println(s));

    }

}
