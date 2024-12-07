import java.io.File;

public interface RideInterface {

    public void setEmployeeslist(Employee employee);

    public void setRidelist(Ride ride);
    public void setVisitorlist(Visitor visitor);

    public void deleteVisitorlist(Visitor visitor);

    public void printVisitorlist();

    public void sortVisitorHistory();

    public void addVisitorHistory(Visitor A);

    public int numberOfVisitorHistory();

    public boolean checkVisitorFormHistory(Visitor visitor);

    public void printVisitorHistory();

    public void RunOneCycle();

    public void writefile();

    public void readFile(File filename);

    public int numberOfVisitorlist();

    public boolean checkEmployee(Ride ride);
}
