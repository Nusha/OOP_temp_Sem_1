public class HotDrink extends Drink {
    int temperature;

    public HotDrink(String name, double price, double volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "Name: " + getName() +
                ", price: " + getPrice() +
                ", volume: " + getVolume() +
                ", temperature: " + temperature +
                '}';
    }
}
