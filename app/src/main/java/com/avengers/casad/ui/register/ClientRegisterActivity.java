package com.avengers.casad.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.avengers.casad.databinding.ActivityClientRegisterBinding;

public class ClientRegisterActivity extends AppCompatActivity {
    private ActivityClientRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityClientRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final ImageButton backButton = binding.backButton;
        final Button registerButton = binding.buttonRegister;

        backButton.setOnClickListener(v -> finish());
        registerButton.setOnClickListener(v -> {
            Intent intent = new Intent();
            startActivity(intent);
        });
    }
}