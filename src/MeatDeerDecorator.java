public class MeatDeerDecorator extends DishDecorator {
    public MeatDeerDecorator(Dish dish) { super(dish); }
    @Override
    public int getPrice() {
        return wrappedDish.getPrice() + 20;
    }
    @Override
    public String getName() {
        return wrappedDish.getName() + " с двойной олениной";
    }
}