package com.company;

import java.util.ArrayList;

public class FootballClubs {

    private String name;
    private ArrayList<FootballPlayers>footballPlayers;

    public FootballClubs(String name) {
        this.name = name;
        this.footballPlayers =new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<FootballPlayers> getFootballPlayers() {
        return footballPlayers;
    }

    //search player in starting line up
    private FootballPlayers findPlayerInStartingLineUp(String name){
        for(int i=0;i<footballPlayers.size();i++){
            FootballPlayers playerChecked=this.footballPlayers.get(i);
            if(playerChecked.getName().equals(name)){
                return playerChecked;
            }
        }
        return null;
    }
    //select players for starting line up/
    public boolean makeStartingLineUp(String name,int number){
        if(findPlayerInStartingLineUp(name)==null){

            this.footballPlayers.add(new FootballPlayers(name,number));
            return true;
        }else {
            System.out.println("**Player is already selected for the line up**");
            return false;
        }
    }





}
