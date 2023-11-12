package com.avengers.casad.ui.client.product_selection;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.avengers.casad.databinding.ActivityClientProductSelectionBinding;
import com.avengers.casad.ui.client.shopping_cart.ClientShoppingCart;

public class ClientProductSelectionActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityClientProductSelectionBinding binding = ActivityClientProductSelectionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        View shoppingCart = binding.shoppingCartIcon;

        shoppingCart.setOnClickListener(v -> {
            Intent intent = new Intent(this, ClientShoppingCart.class);
            startActivity(intent);
        });
    }
}
