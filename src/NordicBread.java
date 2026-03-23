public class NordicBread extends DishDecorator {
    public NordicBread(Dish dish) { super(dish); }
    @Override
    public int getPrice() {
        return wrappedDish.getPrice() + 7;
    }
    @Override
    public String getName() {
        return wrappedDish.getName() + " с нордской лепешкой";
    }
}