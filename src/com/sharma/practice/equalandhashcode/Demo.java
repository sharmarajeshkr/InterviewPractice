package com.sharma.practice.equalandhashcode;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        Movie m = new Movie("Thank you","Akshay",2011);
        Movie m1 = new Movie("Khiladi","Akshay",1993);
        Movie m2 = new Movie("Taskvir","Akshay",2010);
        Movie m3 = new Movie("Taskvir","Akshay",2010);



        HashMap<Movie, String> map = new HashMap<Movie, String>();
        map.put(m, "ThankYou");
        map.put(m1, "Khiladi");
        map.put(m2, "Tasvir");
        map.put(m3, "Duplicate Tasvir");

        //Iterate over HashMap
        for (Movie mm : map.keySet()) {
            System.out.println(map.get(mm).toString());
        }

        Movie m4 = new Movie("Taskvir","Akshay",2010);
        map.put(m4, "Duplicate Tasvir");

        /* We are trying to retrieve m2, by creating object m4 with exact values as of m2, However Hashcode method is not implemented and that why we are not able to get Object m2 */
        if(map.get(m4) == null ){
            System.out.println("----------------");
            System.out.println("Object not found");
            System.out.println("----------------");
        }else{
            System.out.println(map.get(m4).toString());
        }
    }
    }


class Movie {
    private String name, actor;
    private int releaseYr;

    public Movie(String name, String actor, int releaseYr) {
        this.name = name;
        this.actor = actor;
        this.releaseYr = releaseYr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getReleaseYr() {
        return releaseYr;
    }

    public void setReleaseYr(int releaseYr) {
        this.releaseYr = releaseYr;
    }


}
