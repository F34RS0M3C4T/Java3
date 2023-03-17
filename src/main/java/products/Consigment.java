package products;

import java.util.Arrays;
import java.util.Objects;
//Класс «Партия товаров». Партия товаров имеет описание и содержит некоторое
//количество упакованных товаров, возможно, разных типов (в том числе наборов
//товаров). Методы: конструктор по произвольному набору упаковок товаров,
//получить массу всей партии (суммарная масса брутто всех товаров в партии).

public class Consigment {
    Coverable[]coverables;
    String description;

    public Consigment(String description, Coverable...coverables){
        this.description = description;
        this.coverables = coverables;
        //System.arraycopy(coverables, 0, this.coverables, 0, coverables.length);
    }

    public double getMass(){
        double mass = 0;
        for (Coverable coverable : coverables) {
            mass += coverable.getGrossMass();
        }
        return mass;
    }

    public Coverable[] getCoverables() {
        return coverables;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consigment that = (Consigment) o;
        return Arrays.equals(coverables, that.coverables) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(description);
        result = 31 * result + Arrays.hashCode(coverables);
        return result;
    }

    @Override
    public String toString() {
        return "products.Consigment{" +
                "coverables=" + Arrays.toString(coverables) +
                ", description='" + description + '\'' +
                '}';
    }
}
