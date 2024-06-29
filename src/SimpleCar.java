public class SimpleCar {

  private int odometer;

  public SimpleCar() {

    odometer = 0;

  }

  public SimpleCar(int miles) {

    odometer = miles;

  }

  public void drive(int miles) {

    odometer = odometer + miles;

  }

  public static void main(String[] args) {

    SimpleCar fordFusion = new SimpleCar();

    SimpleCar hondaAccord = new SimpleCar(30);

    fordFusion.drive(100);

    fordFusion.drive(20);

    System.out.println(fordFusion.odometer);
    
  }

}