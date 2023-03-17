package products;

//. Класс «Весовой товар». Весовой товар хранит название и описание
public class WeightProduct extends Product {
    public WeightProduct(String name, String description)  {
        super(name, description);
    }

    @Override
    public String toString() {
        return "products.WeightProduct{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
