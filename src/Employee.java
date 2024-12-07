/**
 * Represents an employee in the system, extending the Person class.
 * This class encapsulates the properties and behaviors specific to employees.
 */
public class Employee extends Person {
    /**
     * The function or role of the employee within the organization.
     */
    String function;

    /**
     * The number of years the employee has worked.
     */
    int workYear;

    /**
     * Default constructor for Employee.
     */
    public Employee() {
    }

    /**
     * Constructor for Employee that initializes the employee's properties.
     *
     * @param function   The role or function of the employee.
     * @param workYear   The number of years the employee has worked.
     * @param name       The name of the employee.
     * @param years      The age of the employee.
     * @param weight     The weight of the employee.
     * @param high       The height of the employee.
     */
    public Employee(String function, int workYear, String name, int years, int weight, int high) {
        super(years, weight, high, name);
        this.function = function;
        this.workYear = workYear;
    }

    /**
     * Sets the function or role of the employee.
     *
     * @param function The new function of the employee.
     * @throws IllegalArgumentException If the provided function is null.
     */
    public void setFunction(String function) {
        if (function == null) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.function = function;
        }
    }

    /**
     * Sets the number of years the employee has worked.
     *
     * @param workYear The new work year value.
     * @throws IllegalArgumentException If the provided work year is negative.
     */
    public void setWorkYear(int workYear) {
        if (workYear < 0) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.workYear = workYear;
        }
    }

    /**
     * Returns the number of years the employee has worked.
     *
     * @return The work year of the employee.
     */
    public int getWorkYear() {
        return workYear;
    }

    /**
     * Returns the function or role of the employee.
     *
     * @return The function of the employee.
     */
    public String getFunction() {
        return function;
    }
}