package components.dao;

import components.models.Person;
import components.models.Teacher;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> persons;

    {
        persons = new ArrayList<>();
        persons.add(new Person(1, "Samuel Jackson", "samuel", "111", "01.01.1960", "Преподаватель", "Physics"));
        persons.add(new Person(2, "Pool Richardson", "pool", "222", "01.01.1960", "Преподаватель",  "Chemistry"));
        persons.add(new Person(3, "Sam Martyn", "sam", "333", "01.01.1960", "Преподаватель",  "Astronomy"));
    }

    public Person show(int id) {
        return persons.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person){
        persons.add(person);
    }

    public void sout(){
        for(int i = 0; i < persons.size(); i++){
            if(i == persons.size() - 1){
                System.out.println("Id: " + persons.get(i).getId());
                System.out.println("login: " + persons.get(i).getLogin());
                System.out.println("Password: " + persons.get(i).getPassword());
                System.out.println("fullName: " + persons.get(i).getFullName());
                System.out.println("DateOfBirth: " + persons.get(i).getDateOfBirth());
                System.out.println("Role: " + persons.get(i).getRole());
                System.out.println("SubjectArea: "+ persons.get(i).getSubjectArea());
            }

        }
    }
}