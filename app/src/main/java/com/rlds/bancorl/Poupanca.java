package com.rlds.bancorl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rlds.bancorl.databinding.ActivityPoupancaBinding;
import com.rlds.bancorl.databinding.ActivitySaldoBinding;

public class Poupanca extends AppCompatActivity {
    private ActivityPoupancaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPoupancaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.toolbarPoupanca.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Poupanca.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}