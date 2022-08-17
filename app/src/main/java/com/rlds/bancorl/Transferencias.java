package com.rlds.bancorl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rlds.bancorl.databinding.ActivityFaturasBinding;
import com.rlds.bancorl.databinding.ActivityTransferenciasBinding;

public class Transferencias extends AppCompatActivity {
    private ActivityTransferenciasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTransferenciasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.toolbarTransferencias.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Transferencias.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}