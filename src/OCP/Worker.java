package OCP;

public class Worker {
    private int id;
    private String name;
    private int salary;
    private int workingDays;

    public Worker(int id, String name, int salary, int workingDays) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.workingDays = workingDays;
    }

    public Worker(String name, int salary, int workingDays) {
        this.name = name;
        this.salary = salary;
        this.workingDays = workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public int monthSalayry(){
        return salary * workingDays;
    }
    public int monthSalayryWOTax(){
        return (int) (salary * workingDays * 0.87);
    }

}
