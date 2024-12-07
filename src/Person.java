public class Person {
    protected int years;

    protected String name;

    protected int weight, high;

    public Person() {

    }


    public Person(int years, int weight, int high, String name) {
        this.years = years;
        this.weight = weight;
        this.high = high;
        this.name = name;
    }


    public void setYears(int y) {
        if (y > 0) {
            this.years = y;
        } else {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setWeight(int w) {
        if (w > 0) {
            this.weight = w;
        } else {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setHigh(int h) {
        if (h > 0) {
            this.high = h;
        } else {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public void setName(String n) {
        if (n != null) {
            this.name = n;
        } else {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    public int getHigh() {
        return high;
    }

    public int getWeight() {
        return weight;
    }

    public int getYears() {
        return years;
    }

    public String getName() {
        return name;
    }
}
