package com.example.hw7;

public class Cat extends Animal {

    String name;
    int age;
    String phone;

    Cat(String name, int age, String phone){
        super();
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    void stand() {
        imageView.setImageResource(R.drawable.catstand);

    }

    void run() {
        imageView.setImageResource(R.drawable.catrun);
    }


    void sit() {
        imageView.setImageResource(R.drawable.catsit);
    }


}

