package main.java.otherClass;

public class Worker extends BaseWorker {
    private int salary;

    public Worker(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    //region GetSetSalary
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
//endregion

    @Override
    public int getAVGsalary() {
        return getSalary();
    }

    }

