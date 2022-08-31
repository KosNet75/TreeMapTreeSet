import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {

    Comparator<Person> sortPerson = (o1, o2) -> {

      int maxSize = 3;
      String[] words1 = o1.getSurname().split("\\P{IsAlphabetic}+");
      int wordCount1 = words1.length;
      String[] words2 = o2.getSurname().split("\\P{IsAlphabetic}+");
      int wordCount2 = words2.length;
      if (wordCount1 > maxSize) {
        wordCount1 = maxSize;
      }
      if (wordCount2 > maxSize) {
        wordCount2 = maxSize;
      }

      if (wordCount1 > wordCount2 || wordCount1 < wordCount2) {
        return wordCount1 > wordCount2 ? 1 : -1;
      }
      return Integer.compare(o1.getAge(), o2.getAge());
    };

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

  }
}