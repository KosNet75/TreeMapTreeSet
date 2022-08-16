import java.util.HashMap;
import java.util.Map;

public class Person {

  //  Map<String, Integer> map = new HashMap<>();
  private String name;
  private String surname;
  private int age;


  //////////////////////// создайте конструктор на все поля
  public Person(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;


  }





  public<o> String getName() {
    return name;
  }


  // создайте геттеры и сеттеры

  public<o> void setName(String name) {
    this.name = name;
  }

  public <o>  String getSurname() {
    return surname;
  }

  public<o> void setSurname(String surname) {
    this.surname = surname;
  }

  public<o> int getAge() {
    return age;
  }

  public<o> void setAge(int age) {
    this.age = age;
  }

  // создайте toString
  @Override
  public String toString() {
    return "| " + name +" "+
        surname + " " +
        " " + age + " |";
  }

}


