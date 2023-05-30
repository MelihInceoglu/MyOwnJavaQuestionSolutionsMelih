package EmployeesProject;

import java.util.Scanner;

public class Runner {
    /*
       Çalışanlar Programı

       Calisan Sınıfı Şeklinde Bir Üst Sınıf

       Calisan Sınıfından Türeyen Yazilimci adında Bir Alt Sınıf
       Calisan Sınıfından Türeyen Yonetici adında Bir Alt Sınıf
       */
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    public static final String E = "\u001B[35m";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        menu();

    }

    public static void menu() throws InterruptedException {


        System.out.printf(R + "%50s", "******** EMPLOYESS PROJCET ********\n");
        System.out.printf(B + "%40s", "---Transactions---\n");
        System.out.printf(Y + "%40s", "\t\t1. Programmer Operations\n");
        System.out.printf(G + "%40s", "\t2. Manager Oprations\n");
        System.out.printf(E + "%40s", "Press Q to exit...");
        System.out.println();
        String choice = scanner.next();

        switch (choice) {

            case "1": {
                Programmer programmer = new Programmer("Ayse", "Poyraz", 38, "Java");
                System.out.printf(B + "\t\t 1. Format it...\n" +
                        "\t\t 2. Show informations...\n" +
                        "\t\t Press q to exit...");
                System.out.println("");
                Thread.sleep(4000);

                while (true) {
                    System.out.println("Please, Choesee one of this option");
                    String progOption = scanner.next();

                    if (progOption.equalsIgnoreCase("q")) {
                        System.out.println("Exit from page");
                        break;
                    } else if (progOption.equals("1")) {
                        Programmer.formatIt();
                        Thread.sleep(4000);
                        menu();


                    } else if (progOption.equals("2")) {
                        programmer.ShowInformations();
                        Thread.sleep(4000);
                        menu();

                    } else {
                        System.out.println("Invalid login");
                    }
                }

                break;
            }
            case "2": {
                Manager manager = new Manager("Melih", "Inceoglu", 342, 10);

                System.out.printf(G + "** Manager Operations **\n"
                        + "\t\t1. Make raise\n"
                        + "\t\t2. Show informations\n"
                        + "\t\tPress q to exit...");
                System.out.println();
                Thread.sleep(2000);

                String managerOptions = scanner.next();

                switch (managerOptions) {
                    case "1": {
                        Manager.makeARaise();

                        Thread.sleep(3000);
                        menu();
                        break;
                    }
                    case "2": {
                        manager.ShowInformations();
                        Thread.sleep(3000);
                        menu();
                        break;
                    }
                    case "q":
                    case "Q": {
                        System.out.println("Press q to exit...");
                        Thread.sleep(3000);
                        System.exit(0);


                    }
                    default:
                        System.out.println("Invalid login...");
                }

            }

        }
    }
}
































