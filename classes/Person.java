public class Person {

  String name;

  void dysplayName() {
    System.out.println("Name is " + name);
  }

}
class DemoPerson {

  public static void main(String[] args) {

    Person person;
    person = new Person();

    person.name = "Édipo";
    person.dysplayName();

  }

}