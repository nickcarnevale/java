public class Student {

  private double myGPA;

  private int myCredits;

  public void increaseCredits(int amount) {

    myCredits = myCredits + amount;

  }

  public void setCredits(int credits) {

    myCredits = credits;

  }

  public int getCredits() {

    return myCredits;

  }

  public static void main(String [] args) {

    Student s = new Student();

    s.setCredits(6);

    s.increaseCredits(12);

    System.out.println(s.getCredits());

  }

}