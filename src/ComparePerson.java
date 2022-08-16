import java.util.*;

public class ComparePerson <o extends Person> implements Comparator<Person>{

  int maxSize;

  public ComparePerson(int maxSize) {
    this.maxSize = maxSize;
  }

  @Override
    public int compare(Person o1, Person o2) {
    System.out.println("--------------------------------");
    int wordсount1 = 0;
    int wordсount2 = 0;
      String[] words = o1.getSurname().split("-");
      for (String word : words) {
        wordсount1++;
      }
      String[] words1 = o2.getSurname().split("-");
      for (String word : words1) {
        wordсount2++;
      }
      if (wordсount1 > maxSize) {
        wordсount1 = maxSize;
      }
      if (wordсount2 > maxSize) {
        wordсount2 = maxSize;
      }
      if (wordсount1 > wordсount2) {
        System.out.println(
            o1.getSurname() + "w=" + wordсount1 + "     w > ww     ww= " + wordсount2 + " " + o2.getSurname());
        return 1;
      } else if (wordсount1 < wordсount2) {
        System.out.println(
            o1.getSurname() + "w=" + wordсount1 + "   w < ww    ww= " + wordсount2 + " " + o2.getSurname());
        return -1;
      } else
        return Integer.compare(o1.getAge(), o2.getAge());


    }

}

