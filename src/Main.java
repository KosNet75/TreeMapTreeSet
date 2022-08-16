import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {


    LinkedList<Person> person = new LinkedList<>();

       person.add(new Person("Владимир","Немирович-Данченко",84));
       person.add(new Person("Александр","Голенищев-Кутузов-Смоленский",67));
       person.add(new Person("Александр","Панкратов-Чёрный",73));
       person.add(new Person("Elizabeth II Alexandra Mary","Windsor",96));
       person.add(new Person("Пётр","Румянцев-Задунайский",71));
       person.add(new Person("Елизавета","Боярская",36));
       person.add(new Person("Lindsay","Lohan",36));



     Collections.sort(person, new ComparePerson<Person>(6));
     System.out.println(person);

  }

}
