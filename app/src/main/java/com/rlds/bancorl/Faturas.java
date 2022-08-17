package com.rlds.bancorl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rlds.bancorl.databinding.ActivityFaturasBinding;
import com.rlds.bancorl.databinding.ActivitySaldoBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class Faturas extends AppCompatActivity {
    private ActivityFaturasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaturasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.toolbarFaturas.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Faturas.this, MainActivity.class);
                startActivity(intent);
            }
        });
        CreditCardView cartaoDeCredito = binding.cartaoDeCredito;
        cartaoDeCredito.setCardNumber("4235 6477 2802 5682");
        cartaoDeCredito.setCardName("Maria lima Silva");
        cartaoDeCredito.setExpiryDate("11/25");
        cartaoDeCredito.setType(CardType.MASTERCARD);
    }
}