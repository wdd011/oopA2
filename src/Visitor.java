public class Visitor extends Person{
    int level;

    String program;

    public Visitor(){

    }

    public Visitor(int level, String program, String name, int years, int weight, int high){
        super(years, weight, high, name);
        this.level = level;
        this.program = program;
    }

    public void setProgram(String program) {
        if (program == null) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.program = program;
        }
    }

    public void setLevel(int level) {
        if (level <= 0) {
            throw new IllegalArgumentException("Invalid value");
        } else {
            this.level = level;
        }
    }

    public int getLevel() {
        return level;
    }

    public String getProgram() {
        return program;
    }
}
