import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drink> hotDrinks=new ArrayList<>(Arrays.asList(
                new HotDrink("coffee",120.0,200.0,60),
                new HotDrink("tea",100.0,250.0,45),
                new Drink("water",50.0,500.0)));


        VendingMachine m1 = new HotDrinkVendingMachine();
        HotDrinkVendingMachine m2 = new HotDrinkVendingMachine();
        HotDrinkVendingMachine m3 = new HotDrinkVendingMachine();

        m1.produceDrink(m1.getProduct("water",50));
        m2.produceDrink(m2.getProduct("coffee",120,200));
        m3.produceDrink(m3.getProduct("tea",100,250, 45));
    }
}