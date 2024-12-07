public class Employee extends Person{
    String funtion;

    int workYear;

    public Employee(){

    }


    public Employee(String funtion, int workYear, String name, int years, int weight, int high){
        super(years, weight, high, name);
        this.funtion = funtion;
        this.workYear = workYear;
    }


    public void setFuntion(String funtion) {
        if (funtion == null) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.funtion = funtion;
        }
    }


    public void setWorkYear(int workYear) {
        if (workYear < 0) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.workYear = workYear;
        }
    }


    public int getWorkYear() {
        return workYear;
    }


    public String getFuntion() {
        return funtion;
    }
}
