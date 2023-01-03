public class HotDrinkVendingMachine extends VendingMachine{
    public Product getProduct(String name, double price, double volume){
        return new Drink(name, price, volume);
    }
    public Product getProduct(String name, double price, double volume, int temperature) {
        return new HotDrink(name, price, volume, temperature);
    }
}