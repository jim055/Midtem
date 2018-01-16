package Midtem;

import java.util.Scanner;

public class Test2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        String id = getID();
        String name = getName();
        String salary = getSalary();
        String overTime = getOverTime();
        String calculateTax = calculateTax();
        String showDataInfo = showDataInfo();


    }//main
    private static String getID(){
        System.out.print("Enter employee id: ");
        return scanner.nextLine();
    }

    private static String getName(){
        System.out.print("Enter employee name: ");
        return scanner.nextLine();

    }

    private static String getSalary(){
        System.out.print("Enter employee salary: ");
        return scanner.nextLine();
    }

    private static String getOverTime(){
        System.out.print("Enter employee overtime: ");
        return scanner.nextLine();
    }

    private static String calculateTax(){
        System.out.print("Enter employee calculatetax: ");
        return scanner.nextLine();

    }

    private static String showDataInfo(){
        System.out.print("Enter employee showdatainfo: ");
        return scanner.nextLine();




    }

}//class
