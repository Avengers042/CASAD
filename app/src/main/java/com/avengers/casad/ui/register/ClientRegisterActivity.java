package com.avengers.casad.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.avengers.casad.databinding.ActivityClientRegisterBinding;
import com.avengers.casad.ui.client.main.ClientMainActivity;

public class ClientRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityClientRegisterBinding binding = ActivityClientRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        final ImageButton backButton = binding.backButton;
        final Button registerButton = binding.buttonRegister;

        backButton.setOnClickListener(v -> finish());
        registerButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, ClientMainActivity.class);
            startActivity(intent);
        });
    }
}