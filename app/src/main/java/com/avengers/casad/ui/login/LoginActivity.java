package com.avengers.casad.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.avengers.casad.databinding.ActivityLoginBinding;
import com.avengers.casad.ui.register.ClientRegisterActivity;

public class LoginActivity extends AppCompatActivity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final ImageButton backButton = binding.backButton;
        final TextView registerRedirection = binding.registerRedirection;

        backButton.setOnClickListener(v -> finish());

        registerRedirection.setOnClickListener(v -> {
            Intent intent = new Intent(this, ClientRegisterActivity.class);
            startActivity(intent);
        });
    }
}