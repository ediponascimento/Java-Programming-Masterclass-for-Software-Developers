abstract class Car {

  public String carName;

  public abstract void start();

  public void showMessage() {
    System.out.println("Nonabstract method in Abstract class");
  }

}
class CreateCar extends Car {

  public static void main(String[] srgs) {

    CreateCar cc;
    cc = new CreateCar();

    cc.start();


  }
  @Override
  public void start() {
    System.out.println("Carro criado ");
  }

}