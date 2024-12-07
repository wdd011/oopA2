import java.io.File;

/**
 * Defines the contract for a ride in the amusement park system.
 * This interface includes methods for managing employees, visitors, and the ride's operation.
 */
public interface RideInterface {

    /**
     * Adds an employee to the ride's list of employees.
     *
     * @param employee The employee to add.
     */
    public void setEmployeeslist(Employee employee);

    /**
     * Adds a ride to the ride list.
     *
     * @param ride The ride to add.
     */
    public void setRidelist(Ride ride);

    /**
     * Adds a visitor to the ride's list of visitors.
     *
     * @param visitor The visitor to add.
     */
    public void setVisitorlist(Visitor visitor);

    /**
     * Removes a visitor from the ride's list of visitors.
     *
     * @param visitor The visitor to remove.
     */
    public void deleteVisitorlist(Visitor visitor);

    /**
     * Prints the list of visitors waiting for the ride.
     */
    public void printVisitorlist();

    /**
     * Sorts the visitor history.
     */
    public void sortVisitorHistory();

    /**
     * Adds a visitor to the ride's history.
     *
     * @param A The visitor to add to history.
     */
    public void addVisitorHistory(Visitor A);

    /**
     * Returns the number of visitors in the ride's history.
     *
     * @return The number of visitors in history.
     */
    public int numberOfVisitorHistory();

    /**
     * Checks if a visitor is in the ride's history.
     *
     * @param visitor The visitor to check.
     * @return True if the visitor is in history, false otherwise.
     */
    public boolean checkVisitorFormHistory(Visitor visitor);

    /**
     * Prints the list of visitors who have ridden the ride.
     */
    public void printVisitorHistory();

    /**
     * Simulates one cycle of the ride operation.
     */
    public void RunOneCycle();

    /**
     * Writes the current visitor list to a file.
     */
    public void writefile();

    /**
     * Reads visitor data from a file and adds them to the visitor list.
     *
     * @param filename The file to read from.
     */
    public void readFile(File filename);

    /**
     * Returns the number of visitors in the ride's list.
     *
     * @return The number of visitors.
     */
    public int numberOfVisitorlist();

    /**
     * Checks if an employee with the matching function exists for the ride.
     *
     * @param ride The ride to check.
     * @return True if an employee exists, false otherwise.
     */
    public boolean checkEmployee(Ride ride);
}
