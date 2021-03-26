package com.example.lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat murzik = new Cat();
        murzik.name = "Мурзик";
        murzik.age = 7;
        murzik.color = Color.GRAY;

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Log.i("GSON", gson.toJson(murzik));


        String jsonText = gson.toJson(murzik);


        Cat murzik1 = gson.fromJson(jsonText, Cat.class);
        Log.i("GSON","Кот: " + murzik.name + ", " + murzik.age + "лет," + "цвет" );

        TextView textView = findViewById(R.id.textView);
        textView.setText("Кот: " + murzik.name + ", " + murzik.age + "лет, " + "цвет:");
    }
}
