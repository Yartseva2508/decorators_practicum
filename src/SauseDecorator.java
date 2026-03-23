public class SauseDecorator extends DishDecorator {
    public SauseDecorator(Dish dish) { super(dish); }

    @Override
    public int getPrice() {
        return wrappedDish.getPrice() + 10;
    }
    @Override
    public String getName() {
        return wrappedDish.getName() + " с огненным соусом";
    }
}