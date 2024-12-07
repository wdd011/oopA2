import java.io.File;
import java.util.Queue;

/**
 * This class represents the main application for an amusement park assignment.
 * It contains methods for various parts of the assignment, simulating different functionalities of the park.
 */
public class AssignmentTwo {
    /**
     * The main method, which serves as the entry point for the application.
     * It calls each part method in sequence to execute the different functionalities.
     */
    public static void main(String[] args) {
        partThree();
        partFourA();
        partFourB();
        partFive();
        partSix();
        partSeven();
    }

    /**
     * Part Three: Demonstrates the creation of employees, rides, and visitors.
     * It then adds visitors to a ride's visitor list, deletes a visitor, and prints the updated list.
     */
    public static void partThree(){
        // Create employee objects
        Employee James = new Employee("HauntedHouse", 3, "James", 29, 90, 194);
        Employee Richard = new Employee("Rotor", 1, "Richard", 35, 70, 188);
        Employee Joseph = new Employee("Monorail", 2, "Joseph", 22, 65, 189);

        // Create ride objects
        Ride HauntedHouse= new Ride("HauntedHouse", 20);
        Ride Rotor = new Ride("Rotor", 12);
        Ride Monorail  = new Ride("Monorail", 30);

        // Create visitor objects
        Visitor Charles = new Visitor(6, "Charles", "Charles", 35, 53, 162);
        Visitor William = new Visitor(1, "William", "Marven", 45, 45, 189);
        Visitor Patricia = new Visitor(7, "Rotor", "Patricia", 16, 35, 146);
        Visitor Sarah = new Visitor(9, "HauntedHouse", "Sarah", 26, 45, 174);
        Visitor Dorothy = new Visitor(3, "Monorail", "Dorothy", 43, 46, 184);

        // Create a ride list object
        Ride list = new Ride();

        // Add visitors to the ride's visitor list
        list.setVisitorlist(Charles);
        list.setVisitorlist(William);
        list.setVisitorlist(Patricia);
        list.setVisitorlist(Sarah);
        list.setVisitorlist(Dorothy);

        // Delete a visitor from the list
        list.deleteVisitorlist(Sarah);

        // Print the updated visitor list
        list.printVisitorlist();

        System.out.println("-----------------------------------------------------------------");
    }

    /**
     * Part Four A: Illustrates the use of a queue to manage visitor history.
     * It adds visitors to the history, checks a visitor's history, and prints the number of visitors.
     */
    public static void partFourA(){
        // Create employee objects
        Employee James = new Employee("HauntedHouse", 3, "James", 29, 90, 194);
        Employee Richard = new Employee("Rotor", 1, "Richard", 35, 70, 188);
        Employee Joseph = new Employee("Monorail", 2, "Joseph", 22, 65, 189);

        // Create ride objects
        Ride HauntedHouse= new Ride("HauntedHouse", 20);
        Ride Rotor = new Ride("Rotor", 12);
        Ride Monorail  = new Ride("Monorail", 30);

        // Create visitor objects
        Visitor Charles = new Visitor(6, "Charles", "Charles", 35, 53, 162);
        Visitor William = new Visitor(1, "William", "Marven", 45, 45, 189);
        Visitor Patricia = new Visitor(7, "Rotor", "Patricia", 16, 35, 146);
        Visitor Sarah = new Visitor(9, "HauntedHouse", "Sarah", 26, 45, 174);
        Visitor Dorothy = new Visitor(3, "Monorail", "Dorothy", 43, 46, 184);

        // Create a ride queue object
        Ride Queue = new Ride();

        // Add visitors to the visitor history
        Queue.addVisitorHistory(Charles);
        Queue.addVisitorHistory(William);
        Queue.addVisitorHistory(Patricia);
        Queue.addVisitorHistory(Sarah);
        Queue.addVisitorHistory(Dorothy);

        // Check a visitor's history
        Queue.checkVisitorFormHistory(Dorothy);

        // Print the number of visitors in history
        System.out.println("The number of list:" + Queue.numberOfVisitorHistory());

        // Print the visitor history
        Queue.printVisitorHistory();

        System.out.println("-----------------------------------------------------------------");
    }

    /**
     * Part Four B: Demonstrates the sorting of visitor history.
     * It prints the visitor history before and after sorting.
     */
    public static void partFourB(){
        // Create employee objects
        Employee James = new Employee("HauntedHouse", 3, "James", 29, 90, 194);
        Employee Richard = new Employee("Rotor", 1, "Richard", 35, 70, 188);
        Employee Joseph = new Employee("Monorail", 2, "Joseph", 22, 65, 189);

        // Create ride objects
        Ride HauntedHouse= new Ride("HauntedHouse", 20);
        Ride Rotor = new Ride("Rotor", 12);
        Ride Monorail  = new Ride("Monorail", 30);

        // Create visitor objects
        Visitor Charles = new Visitor(6, "Charles", "Charles", 35, 53, 162);
        Visitor William = new Visitor(1, "William", "Marven", 45, 45, 189);
        Visitor Patricia = new Visitor(7, "Rotor", "Patricia", 16, 35, 146);
        Visitor Sarah = new Visitor(9, "HauntedHouse", "Sarah", 26, 45, 174);
        Visitor Dorothy = new Visitor(3, "Monorail", "Dorothy", 43, 46, 184);

        // Create a ride queue object
        Ride Queue = new Ride();

        // Add visitors to the visitor history
        Queue.addVisitorHistory(Charles);
        Queue.addVisitorHistory(William);
        Queue.addVisitorHistory(Patricia);
        Queue.addVisitorHistory(Sarah);
        Queue.addVisitorHistory(Dorothy);

        // Print visitor history before sorting
        System.out.println("Sort before:" + "\n");
        Queue.printVisitorHistory();

        // Sort the visitor history
        Queue.sortVisitorHistory();

        // Print visitor history after sorting
        System.out.println("After sort:" + "\n");
        Queue.printVisitorHistory();

        System.out.println("-----------------------------------------------------------------");
    }

    /**
     * Part Five: Simulates one cycle of the amusement park operation.
     * It sets up employees, rides, and visitors, then runs a cycle, and finally prints the remaining visitors and those who have played.
     */
    public static void partFive(){
        // Create employee objects
        Employee James = new Employee("HauntedHouse", 3, "James", 29, 90, 194);
        Employee Richard = new Employee("Rotor", 1, "Richard", 35, 70, 188);
        Employee Joseph = new Employee("Monorail", 2, "Joseph", 22, 65, 189);

        // Create ride objects
        Ride HauntedHouse= new Ride("HauntedHouse", 20);
        Ride Rotor = new Ride("Rotor", 12);
        Ride Monorail  = new Ride("Monorail", 30);
        Ride Astrojet  = new Ride("Astrojet", 5);

        // Create visitor objects
        Visitor Charles = new Visitor(6, "Charles", "Charles", 35, 53, 162);
        Visitor William = new Visitor(1, "William", "Marven", 45, 45, 189);
        Visitor Patricia = new Visitor(7, "Rotor", "Patricia", 16, 35, 146);
        Visitor Sarah = new Visitor(9, "HauntedHouse", "Sarah", 26, 45, 174);
        Visitor Dorothy = new Visitor(3, "Monorail", "Dorothy", 43, 46, 184);
        Visitor Elizabeth = new Visitor(4, "FerrisWheels", "Elizabeth", 28, 75, 185);        Visitor Margaret = new Visitor(6, "Whirligig", "Margaret", 24, 45, 184);
        Visitor Thomas = new Visitor(7, "FerrisWheels", "Thomas", 25, 55, 176);
        Visitor Lisa = new Visitor(5, "FerrisWheels", "Lisa", 29, 46, 162);
        Visitor Nancy = new Visitor(6, "Whirligig", "Nancy", 22, 56, 191);
        // Create a ride list object
        Ride list =new Ride();

        // Add employees, rides, and visitors to the list
        list.setEmployeeslist(James);
        list.setEmployeeslist(Richard);
        list.setEmployeeslist(Joseph);
        list.setRidelist(HauntedHouse);
        list.setRidelist(Rotor);
        list.setRidelist(Monorail);
        list.setRidelist(Astrojet);
        list.setVisitorlist(Charles);
        list.setVisitorlist(William);
        list.setVisitorlist(Patricia);
        list.setVisitorlist(Sarah);
        list.setVisitorlist(Dorothy);
        list.setVisitorlist(Elizabeth);
        list.setVisitorlist(Margaret);
        list.setVisitorlist(Thomas);
        list.setVisitorlist(Lisa);
        list.setVisitorlist(Nancy);
        // Print the initial visitor list
        list.printVisitorlist();

        // Run one cycle of the amusement park operation
        list.RunOneCycle();// Print the remaining visitors after one cycle
        System.out.println("Current remaining tourists");
        list.printVisitorlist();
        System.out.println("Current tourists who have played");
        list.printVisitorHistory();// Print the visitors who have played after one cycle

        System.out.println("-----------------------------------------------------------------");
    }
    /**
     * Part Six: Demonstrates writing visitor data to a file.
     * It creates a list of visitors and writes it to a file named "visitorsList.csv".
     */
    public static void partSix(){
        Employee James = new Employee("HauntedHouse", 3, "James", 29, 90, 194);
        Employee Richard = new Employee("Rotor", 1, "Richard", 35, 70, 188);
        Employee Joseph = new Employee("Monorail", 2, "Joseph", 22, 65, 189);

        Ride HauntedHouse= new Ride("HauntedHouse", 20);
        Ride Rotor = new Ride( "Rotor", 12);
        Ride Monorail  = new Ride("Monorail", 30);

        Visitor Charles = new Visitor(6, "Charles", "Charles", 35, 53, 162);
        Visitor William = new Visitor(1, "William", "Marven", 45, 45, 189);
        Visitor Patricia = new Visitor(7, "Rotor", "Patricia", 16, 35, 146);
        Visitor Sarah = new Visitor(9, "HauntedHouse", "Sarah", 26, 45, 174);
        Visitor Dorothy = new Visitor(3, "Monorail", "Dorothy", 43, 46, 184);

        Ride list=new Ride();

        list.setVisitorlist(Charles);
        list.setVisitorlist(William);
        list.setVisitorlist(Patricia);
        list.setVisitorlist(Sarah);
        list.setVisitorlist(Dorothy);
        list.writefile();
        System.out.println("-----------------------------------------------------------------");
    }
    /**
     * Part Seven: Demonstrates reading visitor data from a file.
     * It reads visitors from a file named "visitorsList.csv" and prints the list.
     */
    public static void partSeven(){
        Ride visitorslist = new Ride();

        visitorslist.readFile(new File("visitorsList.csv"));

        System.out.println("The number of the list: " + visitorslist.numberOfVisitorlist());

        System.out.println("Name\t" + "Level\t" + "Program\t" + "Height\t" + "Weight\t" + "Years\t" + "\n");

        visitorslist.printVisitorlist();

        System.out.println("-----------------------------------------------------------------");
    }

}