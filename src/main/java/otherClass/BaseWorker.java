package main.java.otherClass;

import java.util.Comparator;

public abstract class BaseWorker implements Comparable<BaseWorker> {

    //region поля
    protected String name;
    protected int Age;
    protected int salary;
    //endregion


    public BaseWorker(String name, int age) {
        this.name = name;
        this.Age = age;
    }

    //region методы
    public int  getAVGsalary(){return this.salary;};

    @Override
    public int compareTo(BaseWorker o) {
        return this.Age - getAge();
    }


    @Override
    public String toString() {
        return String.format("Name: " + getName() + "\n"+"Age: " + getAge() + "\n" + "Salary :" + getAVGsalary() );
    }
    //endregion

    //region методы GetSet
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    //endregion
}
