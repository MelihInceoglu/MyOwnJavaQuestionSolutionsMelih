package EmployeesProject;

import java.util.Scanner;

public class Programmer extends Working{

    private String langauges;
    static Scanner scanner=new Scanner(System.in);


    public Programmer(String name, String surname, int id,String langauges) {
        super(name, surname, id);
        this.langauges =langauges;
    }

    public static void formatIt() {
        System.out.println("Choose operating system +\n" +
                "Windows - MacOS (Apple)- Linux");
        String os= scanner.next();
        System.out.println("Operating system :" + os + " looding...");

        if (os.equalsIgnoreCase("Windows")){
            System.out.println("Pay :" +350+"$");
        } else if (os.equalsIgnoreCase("MacOs")) {
            System.out.println("Pay :" +650+"$");
        } else if (os.equalsIgnoreCase("Linux")){
            System.out.println("Pay :" +550 + "$");
        }else {
            System.out.println("The operator you brought is fugitive");
        }
        System.exit(0);
    }
}
