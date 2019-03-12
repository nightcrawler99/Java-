package com.company;


import java.util.ArrayList;

public class Album {

    private String name;
    private ArrayList<Songs>songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public Songs findSong(String song){
        for(int i=0;i<this.songs.size();i++){
            Songs checkedSong=this.songs.get(i);
            if(checkedSong.getName().equals(song)){
                return checkedSong;
            }
        }return null;
    }
    public String getName() {
        return name;
    }

    public ArrayList<Songs> getSongs() {
        return songs;
    }

    public void makeAlbum(String song,String duration){
        songs.add(new Songs(song,duration));
    }



}
