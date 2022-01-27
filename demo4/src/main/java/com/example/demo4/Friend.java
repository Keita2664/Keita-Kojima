package com.example.demo4;

public class Friend {
    String name;
    int age;
    String gender;


    Friend(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String toString(){
        return name;
    }

    public void delete(){



        //String str = Integer.toString(age);
        //str = null;
        //name = null;
        //gender = null;

    }
}
