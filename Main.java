package com.company;


import java.util.Scanner;

public class Main {

    private static Scanner scanner=new Scanner(System.in);//in case need to add data from console

    private static FootballLeague footballLeague=new FootballLeague("Premier League");


    public static void main(String[] args) {


        //testing

        footballLeague.newClubJoined("Chelsea");
        footballLeague.newClubJoined("Mutd");
        footballLeague.newClubJoined("Afc");
        footballLeague.playerInStartingLineUp("Chelsea","Hazard",10);
        footballLeague.getAllClubs();

        footballLeague.playerInStartingLineUp("Chelsea","Hazard",10);//check already in line up
        footballLeague.listPlayersInLineUp("Chelsea");

        footballLeague.playerInStartingLineUp("Spurs","Kane",10);//check doesn't belong in the league


        //user input
        boolean exit=false;

        while(!exit){
            System.out.println("Enter the options from menu: Press <1> for menu ");
            int counter=scanner.nextInt();
            scanner.nextLine();
            switch (counter){
                case 0:
                    exit=true;
                    break;
                case 1:
                    menu();
                    break;
                case 2:
                    clubJoined();
                    break;
                case 3:
                    displayLineUp();
                    break;
                case 4:
                    allClubs();
                    break;
            }
        }

    }
    private static void menu(){
        System.out.println("Enter 0 to quit...\n"+ " <1>. Menu \n" +
                " <2>. Join the league/Add new clubs to the league \n" +
                " <3>. Display line up \n"+
                " <4>. List all clubs \n");
    }
    private static void clubJoined(){

        System.out.println("Enter the name of your club to join: ");
        footballLeague.newClubJoined(scanner.nextLine());

    }

    private static void displayLineUp(){

        System.out.println("Club:");

       footballLeague.listPlayersInLineUp(scanner.nextLine());

    }
    private static void allClubs(){

        footballLeague.getAllClubs();
    }

}
