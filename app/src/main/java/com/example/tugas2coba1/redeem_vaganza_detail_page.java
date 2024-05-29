package com.example.tugas2coba1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class redeem_vaganza_detail_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_redeem_vaganza_detail_page);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

//    public void redeemvaganza(View view) {
//        Intent redeemvaganza = new Intent(layer5.this, redeem_vaganza_katalog_page.class);
//        startActivity(redeemvaganza);
//    }

    public void redeemvaganza_back(View view) {
        Intent redeemvaganza_back = new Intent(redeem_vaganza_detail_page.this, redeem_vaganza_katalog_page.class);
        startActivity(redeemvaganza_back);
    }
}