package com.avengers.casad.ui.client.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.avengers.casad.databinding.ActivityClientMainBinding;
import com.avengers.casad.ui.client.product_selection.ClientProductSelectionActivity;
import com.avengers.casad.ui.client.shopping_cart.ClientShoppingCart;

public class ClientMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityClientMainBinding binding = ActivityClientMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ConstraintLayout itemContainerLayout = binding.itemContainerAlface;
        View shoppingCart = binding.shoppingCartIcon;

        itemContainerLayout.setOnClickListener(v -> {
            Intent intent = new Intent(this, ClientProductSelectionActivity.class);
            startActivity(intent);
        });

        shoppingCart.setOnClickListener(v -> {
            Intent intent = new Intent(this, ClientShoppingCart.class);
            startActivity(intent);
        });
    }
}
