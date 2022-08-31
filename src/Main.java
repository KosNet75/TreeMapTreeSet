import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Main {

  public static void main(String[] args) {

    ComparePerson sortPerson = new ComparePerson(3);
    TreeSet<Person> person = new TreeSet<>(sortPerson);

    person.add(new Person("Владимир", "Немирович-Данченко", 84));
    person.add(new Person("Александр", "Голенищев-Кутузов-Смоленский", 67));
    person.add(new Person("Elizabeth II", "Alexandra-Mary-Windsor", 96));
    person.add(new Person("Анна", "Ковальчук", 45));
    person.add(new Person("Михаил", "Салтыков-Щедрин", 63));
    person.add(new Person("Елизавета", "Боярская", 36));
    person.add(new Person("Сергей", "Капица", 84));
    person.add(new Person("Георгий", "Тесля-Герасимов", 45));
    person.add(new Person("Анна", "Цуканова-Котт", 33));

    NavigableSet<Person> PersonBack = person.descendingSet();
    System.out.println("\nРейтинг по убыванию сверху вниз: " + PersonBack);

    System.out.println("\nУдалены лица менее 18 лет:");
    Predicate<Person> teen = x -> x.getAge() < 18;
    person.removeIf(teen);
    System.out.println(person.descendingSet());

  }
}