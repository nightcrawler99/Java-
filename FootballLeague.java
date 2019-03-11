package com.company;

import java.util.ArrayList;

public class FootballLeague {

    private String name;
    private ArrayList<FootballClubs>footballClubs;

    public FootballLeague(String name) {
        this.name = name;
        this.footballClubs = new ArrayList<FootballClubs>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<FootballClubs> getFootballClubs() {
        return footballClubs;
    }
    //search club from the leagues
    private FootballClubs findFootballClub(String club){
        for(int i=0;i<this.footballClubs.size();i++){
            FootballClubs clubSearched=this.footballClubs.get(i);
            if(clubSearched.getName().equals(club)){
                return clubSearched;
            }

        }
        return null;
    }

    //New club joined the league or promoted from another league

    public boolean newClubJoined(String club){
        if(findFootballClub(club)==null){
            this.footballClubs.add(new FootballClubs(club));
            return true;
        }
        System.out.println("The club is already competing in the "+this.name);
        return false;
    }

    //players selected for line up in their league matches

    public boolean playerInStartingLineUp(String club,String player,int number){
        FootballClubs currentClub=findFootballClub(club);
        if(currentClub!=null){
            currentClub.makeStartingLineUp(player,number);
            return true;
        }
        System.out.println("**This club does not belong to our league**");
        return false;
    }

    //print all clubs
    public void getAllClubs(){
        System.out.println(name+ " Has following clubs competing \n");

        for(int i=0;i<footballClubs.size();i++){
            System.out.println("#"+(i+1)+" "+footballClubs.get(i).getName()+" \n");

        }

    }
    //print players in line up for selected club
    public void listPlayersInLineUp(String selectedClub){
        FootballClubs club=findFootballClub(selectedClub);
        if(club!=null){
            System.out.println("!!Starting line up for "+club.getName()+" is: \n");
            ArrayList<FootballPlayers>players=club.getFootballPlayers();
            for(int i=0;i<players.size();i++){
                System.out.println("#"+(i+1)+ " "+ players.get(i).getName()+" "+players.get(i).getNumber());
            }
        }
    }
}
