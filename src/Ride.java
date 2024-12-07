import java.io.*;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Represents a ride in an amusement park, implementing the RideInterface.
 * This class encapsulates the properties and behaviors of a ride, including its employees, visitors, and operational logic.
 */
public class Ride implements RideInterface {
    /**
     * The employee assigned to the ride.
     */
    Employee employee;
    /**
     * The name or identifier of the ride program.
     */
    String Program;
    /**
     * The maximum number of riders allowed on the ride at one time.
     */
    int maxRider;
    /**
     * The number of cycles the ride has operated.
     */
    int numOfCycles;
    /**
     * The current number of riders on the ride.
     */
    int nowRider;

    /**
     * A lock object used for synchronizing access to shared resources.
     */
    private final Lock lock = new ReentrantLock();

    /**
     * Constructor for Ride that initializes the ride's properties.
     *
     * @param Program The name or identifier of the ride program.
     * @param maxRider The maximum number of riders allowed on the ride.
     */
    public Ride(String Program, int maxRider) {
        this.Program = Program;
        this.employee = null; // Initialize employee to null
        this.maxRider = maxRider;
        this.numOfCycles = 0;
        this.nowRider = 0;
    }

    /**
     * Default constructor for Ride.
     */
    public Ride() {
        // Initialize lists and queues for visitors, rides, and employees
        LinkedList<Visitor> vistorslist = new LinkedList<>();
        Queue<Visitor> vistorQueue = new LinkedList<>();
        LinkedList<Ride> Ridelist = new LinkedList<>();
        LinkedList<Employee> employeeslist = new LinkedList<>();
    }

    // List of employees assigned to the ride
    final LinkedList<Employee> employeeslist = new LinkedList<>();
    /**
     * Adds an employee to the ride's list of employees.
     *
     * @param employee The employee to add.
     * @throws IllegalArgumentException If the employee is null.
     */
    @Override
    public void setEmployeeslist(Employee employee) {
        if (employee != null) {
            employeeslist.add(employee);
        } else {
            throw new IllegalArgumentException("employee is null");
        }
    }

    // List of rides
    final LinkedList<Ride> Ridelist = new LinkedList<>();

    /**
     * Adds a ride to the ride list.
     *
     * @param ride The ride to add.
     * @throws IllegalArgumentException If the ride is null.
     */
    @Override
    public void setRidelist(Ride ride) {
        if (ride != null) {
            Ridelist.add(ride);
        } else {
            throw new IllegalArgumentException("Visitor is null");
        }
    }

    /**
     * Returns the maximum number of riders allowed on the ride.
     *
     * @return The maximum number of riders.
     */
    public int getmaxRider() {
        return maxRider;
    }

    /**
     * Returns the employee assigned to the ride.
     *
     * @return The employee.
     */
    public Employee getStaff() {
        return employee;
    }

    /**
     * Returns the name or identifier of the ride program.
     *
     * @return The program name.
     */
    public String getClassName() {
        return Program;
    }

    /**
     * Sets the name or identifier of the ride program.
     *
     * @param className The new program name.
     * @throws IllegalArgumentException If the provided value is null.
     */
    public void setClassName(String className) {
        if (className == null) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.Program = className;
        }
    }

    /**
     * Sets the employee assigned to the ride.
     *
     * @param employee The new employee.
     * @throws IllegalArgumentException If the employee is null.
     */
    public void setStaff(Employee employee) {
        if (employee == null) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.employee = employee;
        }
    }

    /**
     * Sets the maximum number of riders allowed on the ride.
     *
     * @param maxRider The new maximum number of riders.
     * @throws IllegalArgumentException If the provided value is less than or equal to 0.
     */
    public void setmaxRider(int maxRider) {
        if (maxRider <= 0) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.maxRider = maxRider;
        }
    }

    // List of visitors waiting for the ride
    final LinkedList<Visitor> visitorslist = new LinkedList<>();

    /**
     * Adds a visitor to the ride's list of visitors.
     *
     * @param visitor The visitor to add.
     * @throws IllegalArgumentException If the visitor is null.
     */
    @Override
    public void setVisitorlist(Visitor visitor) {
        if (visitor != null) {
            visitorslist.add(visitor);
        } else {
            throw new IllegalArgumentException("Visitor is null");
        }
    }

    /**
     * Removes a visitor from the ride's list of visitors.
     *
     * @param visitor The visitor to remove.
     * @throws IllegalArgumentException If the visitor is not in the list.
     */
    @Override
    public void deleteVisitorlist(Visitor visitor) {
        if (visitorslist.contains(visitor)) {
            visitorslist.remove(visitor);
        } else {
            throw new IllegalArgumentException("Visitor is not in the list.");
        }
    }

    /**
     * Prints the list of visitors waiting for the ride.
     */
    @Override
    public void printVisitorlist() {
        Iterator<Visitor> it = visitorslist.iterator();
        System.out.println("Name\t" + "Level\t" + "Program\t" + "High\t" + "Weight\t" + "Years\t" + "\n");
        while (it.hasNext()) {
            Visitor A = it.next();
            System.out.println(A.getName() + "\t" + A.getLevel() + "\t" + A.getProgram() + "\t" + A.getHigh() + "\t" + A.getWeight() + "\t" + A.getYears() + "\t" + "\n");
        }
    }

    /**
     * Returns the number of visitors in the ride's list.
     *
     * @return The number of visitors.
     */
    @Override
    public int numberOfVisitorlist() {
        int X;
        X = visitorslist.size();
        return X;
    }

    // Queue of visitors who have ridden the ride
    final Queue<Visitor> visitorQueue = new LinkedList<>();

    /**
     * Adds a visitor to the ride's history queue.
     *
     * @param A The visitor to add.
     */
    @Override
    public void addVisitorHistory(Visitor A) {
        visitorQueue.offer(A);
    }

    // Temporary list for sorting visitors
    final LinkedList<Visitor> X = new LinkedList<>();

    /**
     * Returns the number of visitors in the ride's history queue.
     *
     * @return The number of visitors.
     */
    @Override
    public int numberOfVisitorHistory() {
        int X;
        X = visitorQueue.size();
        return X;
    }

    /**
     * Checks if a visitor is in the ride's history queue.
     *
     * @param visitor The visitor to check.
     * @return True if the visitor is in the history queue, false otherwise.
     */
    @Override
    public boolean checkVisitorFormHistory(Visitor visitor) {
        boolean X;
        X = visitorQueue.contains(visitor);
        return X;
    }

    /**
     * Prints the list of visitors who have ridden the ride.
     */
    @Override
    public void printVisitorHistory() {
        System.out.println("Name\t" + "Level\t" + "Program\t" + "High\t" + "Weight\t" + "Years\t" + "\n");
        for (Visitor A : visitorQueue) {
            System.out.println(A.getName() + "\t" + A.getLevel() + "\t" + A.getProgram() + "\t" + A.getHigh() + "\t" + A.getWeight() + "\t" + A.getYears() + "\t" + "\n");
        }
    }

    /**
     * Sorts the visitors in the ride's history queue.
     */
    @Override
    public void sortVisitorHistory() {
        X.addAll(visitorQueue);
        visitorQueue.clear();
        Collections.sort(X, new comparator());
        for (Visitor A : X) {
            visitorQueue.offer(A);
        }
    }

    /**
     * Checks if an employee with the matching function exists for the ride.
     *
     * @param ride The ride to check.
     * @return True if an employee exists, false otherwise.
     */
    @Override
    public boolean checkEmployee(Ride ride) {
        if (ride == null || employeeslist == null) {
            return false;
        }

        for (Employee A : employeeslist) {
            if (A.getFunction().equals(ride.Program)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Simulates one cycle of the ride operation, processing visitors and updating ride statistics.
     * It decreases the number of riders in the queue, increments the ride cycle count, and updates the visitor history.
     */
    @Override
    public void RunOneCycle() {
        for (int i = visitorslist.size() - 1; i >= 0; i--) {
            Visitor currentVisitor = visitorslist.get(i);
            String visitorProgram = currentVisitor.getProgram();

            for (Ride ride : Ridelist) {
                if (ride.Program.equals(visitorProgram)) {
                    if (checkEmployee(ride)) {
                        ride.nowRider++;
                        if (ride.nowRider == ride.maxRider || i == 0) {
                            ride.numOfCycles++;
                        }
                        deleteVisitorlist(currentVisitor);
                        addVisitorHistory(currentVisitor);
                        break;
                    } else {
                        System.out.println(ride.getClassName() + " has no staff.");
                    }
                }
            }
        }

        for (Ride ride : Ridelist) {
            if (ride.numOfCycles == 0) {
                System.out.println(ride.getClassName() + " has no tourists waiting.");
            }
        }
    }

    /**
     * Writes the current visitor list to a CSV file named "visitorList.csv".
     * The file will contain the name, weight, height, years, level, and program of each visitor.
     */
    @Override
    public void writefile() {
        lock.lock();
        try {
            File csvfile = new File("visitorList.csv");

            BufferedWriter bufferedWriter = null;
            FileWriter fileWriter = null;

            try {
                fileWriter = new FileWriter(csvfile);

                bufferedWriter = new BufferedWriter(fileWriter);

                for (Visitor visitor : visitorslist) {
                    bufferedWriter.write(visitor.getName() + "," + visitor.getWeight() + "," + visitor.getHigh() + ","
                            + visitor.getYears() + "," + visitor.getLevel() + "," + visitor.getProgram());

                    bufferedWriter.newLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bufferedWriter != null) {
                        bufferedWriter.close();
                    }
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }
    }

    /**
     * Reads visitor data from a CSV file named "visitorList.csv" and adds them to the visitor list.
     * The file is expected to contain the name, weight, height, years, level, and program of each visitor.
     *
     * @param filename The file to read from.
     */
    @Override
    public void readFile(File filename) {
        lock.lock();
        try {
            BufferedReader bufferedReader = null;
            FileReader fileReader = null;
            String[] X;

            try {
                fileReader = new FileReader(filename);
                bufferedReader = new BufferedReader(fileReader);
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    X = line.split(",");
                    Visitor A = new Visitor(0, " ", " ", 0, 0, 0);

                    for (int i = 0; i < X.length; i++) {
                        if (i == 0) {
                            if (X[i] != null) {
                                A.setName(X[i]);
                            }
                        } else if (i == 1) {
                            if (X[i] != null) {
                                A.setWeight(Integer.parseInt(X[i]));
                            }
                        } else if (i == 2) {
                            if (X[i] != null) {
                                A.setHigh(Integer.parseInt(X[i]));
                            }
                        } else if (i == 3) {
                            if (X[i] != null) {
                                A.setYears(Integer.parseInt(X[i]));
                            }
                        } else if (i == 4) {
                            if (X[i] != null) {
                                A.setLevel(Integer.parseInt(X[i]));
                            }
                        } else if (i == 5) {
                            if (X[i] != null) {
                                A.setProgram(X[i]);
                            }
                        }
                    }

                    setVisitorlist(A);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bufferedReader != null) {
                        bufferedReader.close();
                        fileReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
