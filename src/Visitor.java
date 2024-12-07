/**
 * Represents a visitor in the amusement park system, extending the Person class.
 * This class encapsulates the properties and behaviors specific to visitors.
 */
public class Visitor extends Person {
    /**
     * The level or classification of the visitor.
     */
    int level;

    /**
     * The program or ride associated with the visitor.
     */
    String program;

    /**
     * Default constructor for Visitor.
     */
    public Visitor() {
    }

    /**
     * Constructor for Visitor that initializes the visitor's properties.
     *
     * @param level   The level of the visitor.
     * @param program The program or ride associated with the visitor.
     * @param name    The name of the visitor.
     * @param years   The age of the visitor.
     * @param weight  The weight of the visitor.
     * @param high    The height of the visitor.
     */
    public Visitor(int level, String program, String name, int years, int weight, int high) {
        super(years, weight, high, name);
        this.level = level;
        this.program = program;
    }

    /**
     * Sets the program or ride associated with the visitor.
     *
     * @param program The new program or ride.
     * @throws IllegalArgumentException If the provided program is null.
     */
    public void setProgram(String program) {
        if (program == null) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.program = program;
        }
    }

    /**
     * Sets the level of the visitor.
     *
     * @param level The new level.
     * @throws IllegalArgumentException If the provided level is less than or equal to 0.
     */
    public void setLevel(int level) {
        if (level <= 0) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.level = level;
        }
    }

    /**
     * Returns the level of the visitor.
     *
     * @return The level of the visitor.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Returns the program or ride associated with the visitor.
     *
     * @return The program or ride.
     */
    public String getProgram() {
        return program;
    }
}
