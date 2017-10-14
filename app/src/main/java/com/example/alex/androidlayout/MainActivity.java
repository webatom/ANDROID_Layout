package com.example.alex.androidlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mytextView = (TextView) findViewById(R.id.mainText);
        String sourceString = "<b>s_reym </b> Съездил по туристическому маршруту Подкаменная-Большой луг с просмотром скальников (на фото - вид с камня Шахтай) #bike #mountainbike #baikal";
        mytextView.setText(Html.fromHtml(sourceString));
    }
}
