import builder.Person;

import java.util.HashSet;
import java.util.Set;

public class StartClass {


    Person builder = new Person.Builder()
           .withAge(10)
           .withName("Olya")
           .withSurname("Igoreva")
           .withHeight(122)
           .withWeight(45)
           .withParents(new HashSet<>())
            .build();
}
