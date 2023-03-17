package products;

import java.util.Objects;

//. Класс «Упаковка товара». Упаковка имеет название и массу в кг (собственная масса
//упаковки).

public class Cover {
    private String name;
    double coverWeight;

    public String getName() {
        return name;
    }

    public double getCoverWeight() {
        return coverWeight;
    }

    public Cover(String name, double coverWeight) {
        this.name = name;
        this.coverWeight = coverWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cover cover = (Cover) o;
        return Double.compare(cover.coverWeight, coverWeight) == 0 &&
                Objects.equals(name, cover.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, coverWeight);
    }
}
