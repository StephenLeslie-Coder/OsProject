package osproject;

import java.util.ArrayList;

public class Task {
    private int taskID;
    private ArrayList<Integer> sharedList;


    public Task(int taskID,ArrayList<Integer> sharedList) {
        this.taskID = taskID;
        this.sharedList = sharedList;

    }
    public void Adding(){
        int firstLocation = getRandomNumber();
        int secondLocation = getRandomNumber();
        while(secondLocation==firstLocation){
            secondLocation = getRandomNumber();
        }
        int firstLocationValue = sharedList.get(firstLocation);
        int secondLocationValue = sharedList.get(secondLocation);
        int result = firstLocationValue+secondLocationValue;
        sharedList.set(secondLocation,result);
        System.out.printf("The first location(%s) value:%s\n",firstLocation,firstLocationValue);
        System.out.printf("The second location(%s) value:%s\n",secondLocation,secondLocationValue);
        System.out.printf("result = %s\n",result);

    }
    public void Copying(){
        int firstLocation = getRandomNumber();
        int secondLocation = getRandomNumber();
        while(secondLocation==firstLocation){
            secondLocation = getRandomNumber();
        }
        int firstLocationValue = sharedList.get(firstLocation);
        int secondLocationValue = sharedList.get(secondLocation);
        sharedList.set(secondLocation,firstLocationValue);
        int secondLocationValueUpdated = sharedList.get(secondLocation);
        System.out.printf("The previous value of index %s was %s\n",secondLocation,secondLocationValue);
        System.out.printf("The updated value of index %s is %s\n",secondLocation,secondLocationValueUpdated);

    }
    public void Display(){
        int indexToDisplay = getRandomNumber();
        System.out.printf("Displaying index %s: %s\n",indexToDisplay,sharedList.get(indexToDisplay));

    }
    private int getRandomNumber(){
       return (int) Math.floor(Math.random()*(9-0+1)+0);
    }




}
