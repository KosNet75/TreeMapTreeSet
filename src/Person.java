
public class Person {

 // private int id;
  //  Map<String, Integer> map = new HashMap<>();
  private String name;
  private String surname;
  private int age;


  //////////////////////// создайте конструктор на все поля
  public Person(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
   // this.id = id;
  }

  public String getName() {
    return name;
  }

  // создайте геттеры и сеттеры

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // создайте toString
  @Override
  public String toString() {
    return "\n[" + name + " " +
        surname + " " + "   возраст:" + age + "]";
  }

}


