class ParameterizedConstructor2 {

  private int var;

  // default constructor
  public ParameterizedConstructor2() {
    this.var = 10;
  }

  // parameterized constructor
  public ParameterizedConstructor2(int num) {
    this.var = num;
  }

  public int getValue() {
    return this.var;
  }

}
class TestParameterizedConstructor2 {

  public static void main(String[] args) {

    ParameterizedConstructor2 pc1 = new ParameterizedConstructor2();
    System.out.println(pc1.getValue());

    ParameterizedConstructor2 pc2 = new ParameterizedConstructor2(50);
    System.out.println(pc2.getValue());

  }

}