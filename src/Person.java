/**
 * Represents a person with basic attributes such as age, weight, height, and name.
 * This class serves as a base class for other person-related classes, such as Employee.
 */
public class Person {
    /**
     * The age of the person in years.
     */
    protected int years;

    /**
     * The name of the person.
     */
    protected String name;

    /**
     * The weight of the person.
     */
    protected int weight, high;

    /**
     * Default constructor for Person.
     */
    public Person() {
    }

    /**
     * Constructor for Person that initializes the person's attributes.
     *
     * @param years  The age of the person.
     * @param weight The weight of the person.
     * @param high   The height of the person.
     * @param name   The name of the person.
     */
    public Person(int years, int weight, int high, String name) {
        this.years = years;
        this.weight = weight;
        this.high = high;
        this.name = name;
    }

    /**
     * Sets the age of the person.
     *
     * @param y The new age of the person.
     * @throws IllegalArgumentException If the provided age is not greater than 0.
     */
    public void setYears(int y) {
        if (y > 0) {
            this.years = y;
        } else {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    /**
     * Sets the weight of the person.
     *
     * @param w The new weight of the person.
     * @throws IllegalArgumentException If the provided weight is not greater than 0.
     */
    public void setWeight(int w) {
        if (w > 0) {
            this.weight = w;
        } else {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    /**
     * Sets the height of the person.
     *
     * @param h The new height of the person.
     * @throws IllegalArgumentException If the provided height is not greater than 0.
     */
    public void setHigh(int h) {
        if (h > 0) {
            this.high = h;
        } else {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    /**
     * Sets the name of the person.
     *
     * @param n The new name of the person.
     * @throws IllegalArgumentException If the provided name is null.
     */
    public void setName(String n) {
        if (n != null) {
            this.name = n;
        } else {
            throw new IllegalArgumentException("Invalid value");
        }
    }

    /**
     * Returns the height of the person.
     *
     * @return The height of the person.
     */
    public int getHigh() {
        return high;
    }

    /**
     * Returns the weight of the person.
     *
     * @return The weight of the person.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Returns the age of the person.
     *
     * @return The age of the person.
     */
    public int getYears() {
        return years;
    }

    /**
     * Returns the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }
}
