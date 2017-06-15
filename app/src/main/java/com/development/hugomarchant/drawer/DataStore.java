package com.development.hugomarchant.drawer;

import android.app.Application;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hugo Marchant on 21/03/2017.
 */

public class DataStore extends Application {
    private static final String tag = "DataStore";

    public void setSubjectsStore1(String s, String s2, String s3, String s4) {
        ArrayList list = new ArrayList();
        list.add(s);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Log.i(tag,"Received:" + s + ", " + s2 + ", " + s3 + ", " + s4);
    }

    ArrayList list1 = new ArrayList();

    private Boolean Art;
    private Boolean Biology;
    private Boolean Chemistry;
    private Boolean Classics;
    private Boolean DT;
    private Boolean Drama;
    private Boolean Economics;
    private Boolean English;
    private Boolean FoodTech;
    private Boolean French;
    private Boolean Geography;
    private Boolean German;
    private Boolean History;
    private Boolean IT;
    private Boolean Latin;
    private Boolean Maths;
    private Boolean Music;
    private Boolean MusicTech;
    private Boolean PE;
    private Boolean Physics;
    private Boolean Politics;
    private Boolean Psychology;
    private Boolean RS;
    private Boolean Spanish;

    private int maxSubjectIndex;


    public void setSubjectsArt(Boolean s) {
        Art = s;
        Log.i(tag,"Received: Art");
    }

    public void setSubjectsBiology(Boolean s) {
        Biology = s;
        Log.i(tag,"Received: Biology");
    }

    public void setSubjectsChemistry(Boolean s) {
        Chemistry = s;
        Log.i(tag,"Received: Chemistry");
    }

    public void setSubjectsClassics(Boolean s) {
        Classics = s;
        Log.i(tag,"Received: Classics");
    }

    public void setSubjectsDT(Boolean s) {
        DT = s;
        Log.i(tag,"Received: D.T.");
    }

    public void setSubjectsDrama(Boolean s) {
        Drama = s;
        Log.i(tag,"Received: Drama");
    }

    public void setSubjectsEconomics(Boolean s) {
        Economics = s;
        Log.i(tag,"Received: Economics");
    }

    public void setSubjectsEnglish(Boolean s) {
        English = s;
        Log.i(tag,"Received: English");
    }

    public void setSubjectsFoodTech(Boolean s) {
        FoodTech = s;
        Log.i(tag,"Received: FoodTech");
    }

    public void setSubjectsFrench(Boolean s) {
        French = s;
        Log.i(tag,"Received: French");
    }

    public void setSubjectsGeography(Boolean s) {
        Geography = s;
        Log.i(tag,"Received: Geography");
    }

    public void setSubjectsGerman(Boolean s) {
        German = s;
        Log.i(tag,"Received: German");
    }

    public void setSubjectsHistory(Boolean s) {
        History = s;
        Log.i(tag,"Received: History");
    }

    public void setSubjectsIT(Boolean s) {
        IT = s;
        Log.i(tag,"Received: I.T.");
    }

    public void setSubjectsLatin(Boolean s) {
        Latin = s;
        Log.i(tag,"Received: Latin");
    }

    public void setSubjectsMaths(Boolean s) {
        Maths = s;
        Log.i(tag,"Received: Maths");
    }

    public void setSubjectsMusic(Boolean s) {
        Music = s;
        Log.i(tag,"Received: Music");
    }

    public void setSubjectsMusicTech(Boolean s) {
        MusicTech = s;
        Log.i(tag,"Received: MusicTech");
    }

    public void setSubjectsPE(Boolean s) {
        PE = s;
        Log.i(tag,"Received: P.E.");
    }

    public void setSubjectsPhysics(Boolean s) {
        Physics = s;
        Log.i(tag,"Received: Physics");
    }

    public void setSubjectsPolitics(Boolean s) {
        Politics = s;
        Log.i(tag,"Received: Politics");
    }

    public void setSubjectsPsychology(Boolean s) {
        Psychology = s;
        Log.i(tag,"Received: Psychology");
    }

    public void setSubjectsRS(Boolean s) {
        RS = s;
        Log.i(tag,"Received: R.S.");
    }

    public void setSubjectsSpanish(Boolean s) {
        Spanish = s;
        Log.i(tag,"Received: Spanish");
    }

    public ArrayList getSubjects(){
        if (Art == true){
            list1.add("Art");
        }else if (Biology == true){
            list1.add("Biology");
        }else if (Chemistry == true){
            list1.add("Chemistry");
        } else if (Classics == true){
            list1.add("Classics");
        } else if (DT == true){
            list1.add("D.T.");
        } else if (Drama == true){
            list1.add("Drama");
        } else if (Economics == true){
            list1.add("Economics");
        } else if (English == true){
            list1.add("English");
        } else if (FoodTech == true){
            list1.add("FoodTech");
        } else if (French == true){
            list1.add("French");
        } else if (Geography == true){
            list1.add("Geography");
        } else if (German == true){
            list1.add("German");
        } else if (History == true){
            list1.add("History");
        } else if (IT == true){
            list1.add("I.T.");
        } else if (Latin == true){
            list1.add("Latin");
        } else if (Maths == true){
            list1.add("Maths");
        } else if (Music == true){
            list1.add("Music");
        } else if (MusicTech == true){
            list1.add("MusicTech");
        } else if (PE == true){
            list1.add("P.E.");
        } else if (Physics == true){
            list1.add("Physics");
        } else if (Politics == true){
            list1.add("Politics");
        } else if (Psychology == true){
            list1.add("Psychology");
        } else if (RS == true){
            list1.add("R.S.");
        } else if (Spanish == true){
            list1.add("Spanish");
        }
        Log.i(tag, list1.get(0) + ", " + list1.get(1) + ", " + list1.get(2) + ", " + list1.get(3));
        return list1;
    }

    public int getSubjectsLength(){
        maxSubjectIndex = list1.size();
        return maxSubjectIndex;
    }
}


