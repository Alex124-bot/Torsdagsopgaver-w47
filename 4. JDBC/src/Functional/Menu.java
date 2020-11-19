package Functional;

import DB.DBInteraction;

import java.util.Scanner;

public class Menu {

    public void menu() {

    DBInteraction DBI = new DBInteraction();

    Scanner input = new Scanner(System.in);

        System.out.println("---------menu---------");
        System.out.println("---------Chose---------");

    System.out.println("1.) get a list of all cities");
    System.out.println("2.) get a list of all cities with Pop. over 5m");

    int cmd = input.nextInt();

    switch (cmd){

        case 1:
            DBI.allCountCity();
            break;
        case 2:
            DBI.popGreaterThen5X();
            break;
        }

    }

}
