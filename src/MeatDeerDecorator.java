public class MeatDeerDecorator extends DishDecorator {
    public MeatDeerDecorator(Dish dish) { super(dish); }

    @Override
    public int getPrice() {
        return super.getPrice() + 20;
    }

    @Override
    public String getName() {
        return super.getName() + " с двойной олениной";
    }
}