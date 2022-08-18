import java.util.*;

public class ComparePerson implements Comparator<Person> {

  int maxSize;

  public ComparePerson(int maxSize) {
    this.maxSize = maxSize;
  }

  @Override
  public int compare(Person o1, Person o2) {

    String[] words1 = o1.getSurname().split("-");
    int wordCount1 = words1.length;
    String[] words2 = o2.getSurname().split("-");
    int wordCount2 = words2.length;

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







