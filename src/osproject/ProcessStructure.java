package osproject;

import java.util.ArrayList;
import java.util.Date;

public class ProcessStructure {

    private int PID;
    private Task task;
    private ArrayList<Integer> data;
    private Date startTime;
    private Date endTime;
    private int attempts;

    public ProcessStructure() {
        this.task = new Task(generateRandomNumberForTask(),Os.sharedList);
        this.PID = generatePID();

    }
    private int generateRandomNumberForTask(){
        return (int) Math.floor(Math.random()*(3-1+1)+1);

    }
    private int generatePID(){
        return (int) Math.floor(Math.random()*(Integer.MAX_VALUE-1+1)+1);

    }
}
