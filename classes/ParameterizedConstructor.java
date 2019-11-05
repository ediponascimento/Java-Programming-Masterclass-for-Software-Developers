class ParameterizedConstructor {

  int empId;
  String empName;

  // parameterized constructor with two parameters.
  ParameterizedConstructor(int id, String name) {

    this.empId = id;
    this.empName = name;

  }   

  void info() {

    System.out.println("Id: "+empId+ " Name: " + empName);
  
  }

}

class TestParameterizedConstructor {
  

  public static void main(String[] args) {

    ParameterizedConstructor pc1 = new ParameterizedConstructor(45352810, "Édipo Nascimento");
    ParameterizedConstructor pc2 = new ParameterizedConstructor(173030, "Sophia Nascimento");

    pc1.info();
    pc2.info();

  }
}