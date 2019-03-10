package argument;

public class PersonService {

    private PersonRepository repository;

    PersonService(PersonRepository repository){
        this.repository = repository;
    }

    public void save(PersonRepository repository){
        String data = new String("Daniel");
        repository.guarda(data);
    }


    public static void main(String[] args) {
        PersonService personService = new PersonService(new PersonRepository());
        personService.save(new PersonRepository());
    }

}
