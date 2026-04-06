public class SauseDecorator extends DishDecorator {
    public SauseDecorator(Dish dish) { super(dish); }

    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }

    @Override
    public String getName() {
        return super.getName() + " с огненным соусом";
    }
}