package com.aditya.rxjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;

import com.aditya.rxjava.databinding.ActivityMain2Binding;
import com.aditya.rxjava.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity2 extends AppCompatActivity implements TextToSpeech.OnInitListener {
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        TextToSpeech tts = new TextToSpeech(this, this);
        tts.setLanguage(Locale.US);
        binding.btnTts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = binding.input.getText().toString();
                tts.speak(text, TextToSpeech.QUEUE_ADD, null);
            }
        });
    }

    @Override
    public void onInit(int i) {

    }
}