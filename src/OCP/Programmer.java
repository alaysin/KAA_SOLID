package OCP;

import SRP.Worker2;

public class Programmer extends Worker {

    public Programmer(String name, int salary, int workingDays) {
        super(name, salary, workingDays);
    }

    public Programmer(int id, String name, int salary, int workingDays) {
        super(id, name, salary, workingDays);
    }

    public int bonus(){
        return (int) (monthSalayry()*0.2);
    }
}
