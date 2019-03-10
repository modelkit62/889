package optionsals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        /*List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
        Optional<List<String>> listOptional = Optional.of(companyNames);

        System.out.println(listOptional.flatMap(gender -> gender.map(String::toUpperCase)));*/

       /* Optional<String> nonEmptyGender = Optional.of("male");

        System.out.println(nonEmptyGender.map(String::toUpperCase).get());

        Optional<Optional<String>> nonEmptyOtionalGender = Optional.of(Optional.of("male"));
        System.out.println(nonEmptyGender.get());
        System.out.println(" ---------------- ");
        System.out.println(nonEmptyOtionalGender.get().get());
        System.out.println(nonEmptyOtionalGender.map(s -> s.map(String::toUpperCase)));
        System.out.println(nonEmptyOtionalGender.flatMap(s -> s.map(String::toUpperCase)));
        System.out.println("----------------");*/


        App app = new App();
        app.metodo();
    }

    private void metodo() {
        List<String> companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");

        Optional<List<String>> names = Optional.of(companyNames);


        List<String> filteredList2 = names.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());


        Optional<Optional<Optional<List<String>>>> names1 = Optional.of(Optional.of(names));
        System.out.println(names.get().get(1));
        String x = names1.flatMap(s -> s.map(Optional::toString)).get();
        System.out.println(Optional.of(x));
        System.out.println("==================");


        List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(), Optional.of("foo"), Optional.empty(), Optional.of("bar"));

        List<String> filteredList = listOfOptionals.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        System.out.println("==============");
        System.out.println(Arrays.toString(filteredList.toArray()));
        filteredList.forEach(System.out::println);

    }

}
