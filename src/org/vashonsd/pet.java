package org.vashonsd;

public class pet {
    String breed ;
    int year ;
    String name ;
    boolean needRestraint;

    public enum breed{

        germanShepherd,
        Whippets,
        pitbull,
    }

    public pet(String breed , int year , String name , boolean needRestraint){
        this.breed = breed;
        this.year = year;
        this.name = name;
        this.needRestraint = needRestraint ;
    }

    public void typebreed(String breed) { this.breed = breed}

    public void ageYear(int year) { this.year = year}

    public void petName(String name) {this.name = name}

    public void petneedRestraint (boolean needRestraint) {this.needRestraint = needRestraint}






}
