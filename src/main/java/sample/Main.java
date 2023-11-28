package main.java.sample;

import main.java.otherClass.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        BaseWorker[] bw = new BaseWorker[4];
        bw[0] = new Worker("Alex", 27, 27000);
        bw[1] = new Freelancer("Bob", 25, 10);
        bw[2] = new Worker("Max", 19, 50000);
        bw[3] = new Freelancer("Devid", 22, 20);
        WorkerGroup wg = new WorkerGroup(bw);
        wg.printGroup();
        System.out.println("//////////////////|||||||||||///////||||||||||");
        wg.sortBySalary();
    }
}
