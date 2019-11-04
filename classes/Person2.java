class Person2 {

  String name;
  int age;

  Person() {
    name = "John";
    age = 27;
  }


  Person2(String sName, int iAge) {
    name = sName;
    age = iAge;
  }

  public void display() {
    System.out.println("Name = "+ name + ", age = " + age);
  }

}

class DemoPerson2 {

  public static void main(String[] args) {

    Person2 p1 = new Person2("Édipo", 28);
    Person2 p2 = new Person2("Sophia", 7);

    p1.display();
    p2.display();
   

  }

}