import java.io.File;
import java.util.Queue;

public class AssignmentTwo {
    public static void main(String[] args) {
        partThree();
        partFourA();
        partFourB();
        partFive();
        partSix();
        partSeven();
    }
    public static void partThree(){
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

        Ride list = new Ride();

        list.setVisitorlist(Charles);
        list.setVisitorlist(William);
        list.setVisitorlist(Patricia);
        list.setVisitorlist(Sarah);
        list.setVisitorlist(Dorothy);

        list.deleteVisitorlist(Sarah);

        list.printVisitorlist();

        System.out.println("-----------------------------------------------------------------");
    }
    public static void partFourA(){
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

        Ride Queue = new Ride();

        Queue.addVisitorHistory(Charles);
        Queue.addVisitorHistory(William);
        Queue.addVisitorHistory(Patricia);
        Queue.addVisitorHistory(Sarah);
        Queue.addVisitorHistory(Dorothy);

        Queue.checkVisitorFormHistory(Dorothy);

        System.out.println("The number of list:" + Queue.numberOfVisitorHistory());

        Queue.printVisitorHistory();

        System.out.println("-----------------------------------------------------------------");
    }
    public static void partFourB(){
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

        Ride Queue = new Ride();

        Queue.addVisitorHistory(Charles);
        Queue.addVisitorHistory(William);
        Queue.addVisitorHistory(Patricia);
        Queue.addVisitorHistory(Sarah);
        Queue.addVisitorHistory(Dorothy);

        System.out.println("Sort before:" + "\n");
        Queue.printVisitorHistory();

        Queue.sortVisitorHistory();

        System.out.println("After sort:" + "\n");
        Queue.printVisitorHistory();

        System.out.println("-----------------------------------------------------------------");
    }
    public static void partFive(){
        Employee James = new Employee("HauntedHouse", 3, "James", 29, 90, 194);
        Employee Richard = new Employee("Rotor", 1, "Richard", 35, 70, 188);
        Employee Joseph = new Employee("Monorail", 2, "Joseph", 22, 65, 189);

        Ride HauntedHouse= new Ride("HauntedHouse", 20);
        Ride Rotor = new Ride( "Rotor", 12);
        Ride Monorail  = new Ride("Monorail", 30);
        Ride Astrojet  = new Ride("Astrojet", 5);

        Visitor Charles = new Visitor(6, "Charles", "Charles", 35, 53, 162);
        Visitor William = new Visitor(1, "William", "Marven", 45, 45, 189);
        Visitor Patricia = new Visitor(7, "Rotor", "Patricia", 16, 35, 146);
        Visitor Sarah = new Visitor(9, "HauntedHouse", "Sarah", 26, 45, 174);
        Visitor Dorothy = new Visitor(3, "Monorail", "Dorothy", 43, 46, 184);
        Visitor Elizabeth = new Visitor(4, "FerrisWheels", "Elizabeth", 28, 75, 185);
        Visitor Margaret = new Visitor(6, "Whirligig", "Margaret", 24, 45, 184);
        Visitor Thomas = new Visitor(7, "FerrisWheels", "Thomas", 25, 55, 176);
        Visitor Lisa = new Visitor(5, "FerrisWheels", "Lisa", 29, 46, 162);
        Visitor Nancy = new Visitor(6, "Whirligig", "Nancy", 22, 56, 191);

        Ride list =new Ride();

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

        list.printVisitorlist();

        list.RunOneCycle();
        System.out.println("Current remaining tourists");
        list.printVisitorlist();
        System.out.println("Current tourists who have played");
        list.printVisitorHistory();

        System.out.println("-----------------------------------------------------------------");
    }
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
    public static void partSeven(){
        Ride visitorslist = new Ride();

        visitorslist.readFile(new File("visitorsList.csv"));

        System.out.println("The number of the list: " + visitorslist.numberOfVisitorlist());

        System.out.println("Name\t" + "Level\t" + "Program\t" + "Height\t" + "Weight\t" + "Years\t" + "\n");

        visitorslist.printVisitorlist();

        System.out.println("-----------------------------------------------------------------");
    }

}