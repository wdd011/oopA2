import java.io.*;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Ride implements RideInterface {
    Employee employee;
    String Program;
    int maxRider;
    int numOfCycles;
    int nowRider;

    private final Lock lock = new ReentrantLock();

    public Ride(String Program, int maxRider) {
        this.Program = Program;
        this.employee = employee;
        this.maxRider = maxRider;
        this.numOfCycles = 0;
        this.nowRider=0;
    }

    public Ride() {
        LinkedList<Visitor> vistorslist = new LinkedList<>();
        Queue<Visitor> vistorQueue = new LinkedList<>();
        LinkedList<Ride> Ridelist=new LinkedList<>();
        LinkedList<Employee> employeeslist=new LinkedList<>();
    }



    final LinkedList<Employee> employeeslist=new LinkedList<>();
    @Override
    public void setEmployeeslist(Employee employee) {
        if (employee != null) {
            employeeslist.add(employee);
        } else {
            throw new IllegalArgumentException("employee is null");
        }
    }
    final LinkedList<Ride> Ridelist=new LinkedList<>();

    @Override
    public void setRidelist(Ride ride) {
        if (ride != null) {
            Ridelist.add(ride);
        } else {
            throw new IllegalArgumentException("Visitor is null");
        }
    }

    public int getmaxRider() {
        return maxRider;
    }


    public Employee getStaff() {
        return employee;
    }

    public String getClassName() {
        return Program;
    }


    public void setClassName(String className) {

        if (className == null) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.Program = className;
        }
    }


    public void setStaff(Employee employee) {

        if (employee == null) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.employee = employee;
        }
    }


    public void setmaxRider(int maxRider) {

        if (maxRider <= 0) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.maxRider = maxRider;
        }
    }


    final LinkedList<Visitor> visitorslist=new LinkedList<>();

    @Override
    public void setVisitorlist(Visitor visitor) {

        if (visitor != null) {
            visitorslist.add(visitor);
        } else {
            throw new IllegalArgumentException("Visitor is null");
        }
    }



    @Override
    public void deleteVisitorlist(Visitor visitor) {

        if (visitorslist.contains(visitor)) {
            visitorslist.remove(visitor);
        } else {
            throw new IllegalArgumentException("Visitor is not in the list.");
        }
    }

    @Override
    public void printVisitorlist() {

        Iterator<Visitor> it = visitorslist.iterator();
        System.out.println("Name\t" + "Level\t" + "Program\t" + "High\t" + "Weight\t" + "Years\t" + "\n");
        while (it.hasNext()) {
            Visitor A = it.next();
            System.out.println(A.getName() + "\t" + A.getLevel() + "\t" + A.getProgram() + "\t" + A.getHigh() + "\t" + A.getWeight() + "\t" + A.getYears() + "\t" + "\n");
        }
    }

    @Override
    public int numberOfVisitorlist(){
        int X;
        X = visitorslist.size();
        return X;
    }

    final Queue<Visitor> visitorQueue = new LinkedList<>();

    @Override
    public void addVisitorHistory(Visitor A) {
        visitorQueue.offer(A);
    }

    final LinkedList<Visitor> X =new LinkedList<>();


    @Override
    public int numberOfVisitorHistory() {
        int X;
        X = visitorQueue.size();
        return X;
    }

    @Override
    public boolean checkVisitorFormHistory(Visitor visitor) {
        boolean X;
        X = visitorQueue.contains(visitor);
        return X;
    }

    @Override
    public void printVisitorHistory() {
        System.out.println("Name\t" + "Level\t" + "Program\t" + "High\t" + "Weight\t" + "Years\t" + "\n");
        for (Visitor A : visitorQueue) {
            System.out.println(A.getName() + "\t" + A.getLevel() + "\t" + A.getProgram() + "\t" + A.getHigh() + "\t" + A.getWeight() + "\t" + A.getYears() + "\t" + "\n");
        }
    }

    @Override
    public void sortVisitorHistory() {
        X.addAll(visitorQueue);
        visitorQueue.clear();
        Collections.sort(X, new comparator());
        for (Visitor A : X) {
            visitorQueue.offer(A);
        }
    }

    @Override
    public boolean checkEmployee(Ride ride) {
        if (ride == null || employeeslist == null) {
            return false;
        }

        for (Employee A : employeeslist) {
            if (A.getFuntion().equals(ride.Program)) {
                return true;
            }
        }
        return false;
    }

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
