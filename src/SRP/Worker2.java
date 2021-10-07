package SRP;

public class Worker2 {


    private int id;
    private String name;
    private int salary;
    private String position;
    private String responsibility;
    private String tool;
    private String task;



    public Worker2(String name, int salary, String position, String responsibility, String tool, String task) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.responsibility = responsibility;
        this.tool = tool;
        this.task = task;
    }

    public Worker2(String name, int salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public int getId() {
        return id;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

}
