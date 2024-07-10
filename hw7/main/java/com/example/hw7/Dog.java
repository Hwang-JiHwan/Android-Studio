package com.example.hw7;

import android.widget.ImageView;

public class Dog extends Animal {

    String name;
    int age;
    String phone;
    ImageView imageView;

    Dog(String name, int age, String phone){
        super();
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    void stand() {
        imageView.setImageResource(R.drawable.dogstand);

    }

    void run() {

        imageView.setImageResource(R.drawable.dogrun);
    }


    void sit() {

        imageView.setImageResource(R.drawable.dogsit);
    }


}
