import java.util.*;

public class ComparePerson<o extends Person> implements Comparator<Person> {

  int maxSize;

  public ComparePerson(int maxSize) {
    this.maxSize = maxSize;
  }

  @Override
  public int compare(Person o1, Person o2) {
    int wordCount1 = 0;
    int wordCount2 = 0;
    String[] words = o1.getSurname().split("-");
    for (String ignored : words) {
      wordCount1++;
    }
    String[] words1 = o2.getSurname().split("-");
    for (String ignored : words1) {
      wordCount2++;
    }
    if (wordCount1 > maxSize) {
      wordCount1 = maxSize;
    }
    if (wordCount2 > maxSize) {
      wordCount2 = maxSize;
    }
    if (wordCount1 > wordCount2) {
      return 1;
    } else if (wordCount1 < wordCount2) {
      return -1;
    } else {
      return Integer.compare(o1.getAge(), o2.getAge());
    }


  }

}

