class Hello {

  String name = "Édipo";

  // constructor
  Hello() {
    this.name = "BeginnersBooks.com"; 
  }
}

class DemoHello {

  public static void main(String[] args) {
    
    Hello obj = new Hello(); // this automaticly initialize the constructor method. 
    System.out.println(obj.name);
  
  } 

}