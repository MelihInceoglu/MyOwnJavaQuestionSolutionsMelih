package EmployeesProject;

public class Manager extends Working{
    static double managerVwage = 7.000;
    private int perponsiblePersonNum;
    public Manager(String name, String surname, int id,int perponsiblePersonNum) {
        super(name, surname, id);
        this.perponsiblePersonNum =perponsiblePersonNum;
    }

    public static void makeARaise() {
        double managerwage = managerVwage*1.15;
        System.out.println("Your manager salary is increased :" + managerwage);


    }
}