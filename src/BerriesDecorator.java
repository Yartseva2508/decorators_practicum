public class BerriesDecorator extends DishDecorator {
    public BerriesDecorator(Dish dish) { super(dish); }

    @Override
    public int getPrice() {
        return wrappedDish.getPrice() + 5;
    }

    @Override
    public String getName() {
        return wrappedDish.getName() + " со снежными ягодами";
    }
}