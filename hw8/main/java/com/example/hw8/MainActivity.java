package com.example.hw8;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    TextView output1;
    TextView output2;
    TextView outputText;
    Dog dog;
    ArrayList<Dog>dogs = new ArrayList<Dog>();
    int selected = 0;
    int count =0;
    ImageView outputImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton dogButton1 = findViewById(R.id.dogButton1);
        ImageButton dogButton2 = findViewById(R.id.dogButton2);
        ImageButton dogButton3 = findViewById(R.id.dogButton3);
        ImageView outputImage = findViewById(R.id.outputImage);



        // 강아지 만들기 버튼
        Button createDogButton = findViewById(R.id.createDogButton);
        createDogButton.setOnClickListener(v -> {
            createDog();
            count +=1;
            if (count == 1){
                dogs.add(dog);

                dogButton1.setImageResource(R.drawable.dog_run);
                outputText.setText("총 " + count + "마리");
            } else if (count == 2) {
                dogs.add(dog);

                dogButton2.setImageResource(R.drawable.dog_sit);
                outputText.setText("총 " + count + "마리");
            } else if (count == 3) {
                dogs.add(dog);

                dogButton3.setImageResource(R.drawable.dog_stand);
                outputText.setText("총 " + count + "마리");
            } else {
                count = 3;
                outputText.setText("총 " + count + "마리"
                        + "\n더이상 강아지를 만들 수 없습니다." );

            }


        });
        dogButton1.setOnClickListener(v -> {

            selected = 0;

            outputImage.setImageResource(R.drawable.dog_run);
            output1.setText(dogs.get(selected).name);
            output2.setText(dogs.get(selected).mobile);

        });

        dogButton2.setOnClickListener(v -> {

            selected = 1;

            outputImage.setImageResource(R.drawable.dog_sit);
            output1.setText(dogs.get(selected).name);
            output2.setText(dogs.get(selected).mobile);

        });

        dogButton3.setOnClickListener(v -> {

            selected = 2;

            outputImage.setImageResource(R.drawable.dog_stand);
            output1.setText(dogs.get(selected).name);
            output2.setText(dogs.get(selected).mobile);

        });





    }

    void createDog(){
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        output1 = findViewById(R.id.output1);
        output2 = findViewById(R.id.output2);
        outputText = findViewById(R.id.outputText);

        String name = input1.getText().toString();
        String mobile = input2.getText().toString();
        dog = new Dog(name,mobile);
    }
}