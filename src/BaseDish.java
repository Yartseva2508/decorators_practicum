public class BaseDish implements Dish {
    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getName() {
        return "Нордское рагу";
    }
}