package com.example.hw7;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    EditText input3;

    ImageView imageView;

    Animal dog;
    Animal cat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        imageView = findViewById(R.id.imageView);

        Button sitButton = findViewById(R.id.sitButton);
        Button standButton = findViewById(R.id.standButton);
        Button runButton = findViewById(R.id.runButton);

        Button createDogButton = findViewById(R.id.createDogButton);
        createDogButton.setOnClickListener(v -> {
            String name = input1.getText().toString();
            String ageStr = input2.getText().toString();
            String phone = input3.getText().toString();
            int age = Integer.parseInt(ageStr);

            createDog(name,age,phone);
            Animal.run();

            dog = new Dog(name,age,phone);

            imageView.setImageResource(R.drawable.dogstand);

            sitButton.setOnClickListener(view -> {
                imageView.setImageResource(R.drawable.dogsit);

            });

            standButton.setOnClickListener(view -> {
                imageView.setImageResource(R.drawable.dogstand);

            });

            runButton.setOnClickListener(view -> {
                imageView.setImageResource(R.drawable.dogrun);

            });
        });

        Button createCatButton = findViewById(R.id.createCatButton);
        createCatButton.setOnClickListener(v -> {
            String name = input1.getText().toString();
            String ageStr = input2.getText().toString();
            String phone = input3.getText().toString();
            int age = Integer.parseInt(ageStr);

            cat = new Cat(name,age,phone);

            imageView.setImageResource(R.drawable.catstand);

            sitButton.setOnClickListener(view -> {
                imageView.setImageResource(R.drawable.catsit);

            });

            standButton.setOnClickListener(view -> {
                imageView.setImageResource(R.drawable.catstand);

            });

            runButton.setOnClickListener(view -> {
                imageView.setImageResource(R.drawable.catrun);

            });

        });





    }
    void createDog(String name, int age, String phone){

        Animal dog = new Dog(name, age, phone);
    }
}