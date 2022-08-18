
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {

  public static  void main(String[] args) {

  LinkedList<Person> person = new LinkedList<>();


   // PersonComparator pcomp = new PersonComparator();
   // TreeSet<Person> people = new TreeSet<Person>(pcomp);



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
    person.sort(new ComparePerson<>(2));
    System.out.println();
    System.out.println("Рейтинг по убыванию, сверху вниз: " + person);









  }
}
