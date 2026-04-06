public class BerriesDecorator extends DishDecorator {
    public BerriesDecorator(Dish dish) { super(dish); }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }

    @Override
    public String getName() {
        return super.getName() + " со снежными ягодами";
    }
}