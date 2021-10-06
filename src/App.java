import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> places = Arrays.asList("Maadi City Center","Cairo Festival City","Club");
        List<String> specConditions = Arrays.asList("High Blood Pressure","Special Condition");
        List<String> allergies = Arrays.asList("Nuts","Allergy2","Allergy3");

        List<Person> people = Arrays.asList(
            new Person(123 , "Nouran" , places , false , false , "Negative" , specConditions , allergies),
            new Person(456 , "Ahmed" , places , true , true , "Negative" , specConditions , allergies),
            new Person(789 , "Farah" , places , true , false , "Positive" , specConditions , allergies)
        );

        for (Person person : people) {
            person.sequence();
            System.out.println();
        }

    }
}
