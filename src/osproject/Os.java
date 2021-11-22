package osproject;


import java.util.ArrayList;
import java.util.Scanner;

public class Os {

    static  ArrayList<Integer> sharedList = new ArrayList<>();
    static  ArrayList<Integer> jobList  = new ArrayList<>();
    ArrayList<ProcessStructure> activeProcesses = new ArrayList<>();

    public void beginSimulation(){
        Scanner scan = new Scanner(System.in);
        int result=0;
        int numTries=0;
        while (true) {

            System.out.println("Choose option:");
            System.out.println("1.Please enter the number of processes to be simulated (10-30)");
            try {
                result = scan.nextInt();
                if (result<10 || result > 30) {
                    throw new Exception();
                }
                numTries = 3;
                break;
            } catch (Exception e) {

                if (--numTries == 0) {
                    System.out.println("Maximum amount of tries reached.Please try again later");
                    break;
                }
            }
            System.out.println("Invalid input, Please try again");
            scan.nextLine();
        }
        System.out.println(result);
    }


}
