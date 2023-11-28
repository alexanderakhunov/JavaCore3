package main.java.otherClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WorkerGroup {
    private BaseWorker[] workers;

    public WorkerGroup(BaseWorker[] workers) {
        this.workers = workers;
    }

//region Методы сортировки
    public void sortByName(){
        Arrays.sort(workers, Comparator.comparing(BaseWorker::getName));
        printGroup();
    }
    public void sortByAge(){
        Arrays.sort(workers, Comparator.comparing(BaseWorker::getAge));
        printGroup();
    }
    public void sortBySalary(){
        Arrays.sort(workers, Comparator.comparing(BaseWorker::getAVGsalary));
       printGroup();
    }


    //endregion
    public void printGroup() {
        for (BaseWorker worker : workers)
        {
            System.out.println(worker + "\n");
        }
    }
}
