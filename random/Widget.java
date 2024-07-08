
public class Widget {

  private int inStock;

  public Widget() {

    inStock = 10;

  }

  public void addInventory(int amt) {

    inStock = inStock + amt;

  }

  public static void main(String [] args){

    Widget greenWidget = new Widget();

    greenWidget.addInventory(15);

    greenWidget.addInventory(5);
    
    System.out.println(greenWidget.inStock);

  }

}