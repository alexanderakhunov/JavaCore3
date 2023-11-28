package main.java.otherClass;

public class Freelancer extends BaseWorker {
    private int hourlyRate;
    public Freelancer(String name, int age, int hourlyRate) {
        super(name, age);
        this.hourlyRate = hourlyRate;
    }

//region GetSetHourlyRate
    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
//endregion

    @Override
    public int getAVGsalary() {
        return  (int)20.8 * 8 * getHourlyRate();
    }
}
