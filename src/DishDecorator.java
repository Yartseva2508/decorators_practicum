public abstract class DishDecorator implements Dish {
    protected Dish wrappedDish;

    public DishDecorator(Dish dish) {
        this.wrappedDish = dish;
    }
}