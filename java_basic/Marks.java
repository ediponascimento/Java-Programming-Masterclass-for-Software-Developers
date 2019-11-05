class marks {

  public static void main(String[] args) {

    int marks[];

    marks = new int[5]; // you should specify the array's length.

    marks[0] = 10;
    marks[1] = 20;
    marks[2] = 30;
    marks[3] = 40;
    marks[4] = 50;

    for(int mark : marks) 
      System.out.println(mark);


    String people[] = {"Edipo", "Enzo", "Sophia", "Rosa"};

    for( String person : people) 
      System.out.println(person);

    System.out.println("Marks length is : " + marks.length);
    System.out.println("People length is : " + people.length);
  }

}