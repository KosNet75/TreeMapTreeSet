
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;


public class Main {

  public static void main(String[] args) {

   // LinkedList<Person> person = new LinkedList<>();
    TreeSet<Person> person = new TreeSet<>(new ComparePerson<>();
    //NavigableMap<Person, Person> worldCupMap = new TreeMap<>();

    person.add(new Person("Владимир", "Немирович-Данченко", 84));
    person.add(new Person("Александр", "Голенищев-Кутузов-Смоленский", 67));
    person.add(new Person("Elizabeth II", "Alexandra-Mary-Windsor", 96));
    person.add(new Person("Анна", "Ковальчук", 45));
    person.add(new Person("Михаил", "Салтыков-Щедрин", 63));
    person.add(new Person("Елизавета", "Боярская", 36));
    person.add(new Person("Сергей", "Капица", 84));
    person.add(new Person("Георгий", "Тесля-Герасимов", 45));
    person.add(new Person("Анна", "Цуканова-Котт", 33));

    //Collections.sort(person, new ComparePerson<>(4));
    //person.sort(new ComparePerson<>(1));
    System.out.println();
    System.out.println("Рейтинг по убыванию, сверху вниз: " + person);









  }
}
