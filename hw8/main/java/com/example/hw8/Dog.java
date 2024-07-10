package com.example.hw8;

public class Dog {

    String name;
    String mobile;
    int resId;

    Dog(String name, String mobile){
        this.name = name;
        this.mobile = mobile;
        resId += 1;
        if (resId == 1 ){
            resId = R.drawable.dog_run;
        } else if (resId == 2){
            resId = R.drawable.dog_sit;
        } else if (resId == 3){
            resId = R.drawable.dog_stand;
        }
    }


}
