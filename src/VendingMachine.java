public class VendingMachine {
public Product getProduct(String name) {
    return new Product(name);
}
public Product getProduct(String name, double price) {
    return new Product(name, price);
}


public void produceDrink(Product prod) {
    System.out.println("Produced: " + prod);
}
}
