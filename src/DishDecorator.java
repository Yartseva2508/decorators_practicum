public abstract class DishDecorator implements Dish {
    private final Dish wrappedDish;

    public DishDecorator(Dish dish) {
        this.wrappedDish = dish;
    }

    @Override
    public int getPrice() {
        return wrappedDish.getPrice();
    }

    @Override
    public String getName() {
        return wrappedDish.getName();
    }
}