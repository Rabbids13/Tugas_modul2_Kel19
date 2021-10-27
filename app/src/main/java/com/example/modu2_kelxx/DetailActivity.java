package com.example.modu2_kelxx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.modu2_kelxx.R;

public class DetailActivity extends AppCompatActivity {

    private TextView tvNama;
    private TextView tvLName;
    private TextView tvEmail;
    private ImageView ivProflie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNama = findViewById(R.id.tv_first_name);
        tvLName = findViewById(R.id.tv_item_last_name);
        tvEmail = findViewById(R.id.tv_item_email);
        ivProflie =findViewById(R.id.img_photo_user);

        if (getIntent().hasExtra("name") && getIntent().hasExtra("last name") && getIntent().hasExtra("email")) {

            String nama = getIntent().getStringExtra("name");
            tvNama.setText(nama);
            String last_name = getIntent().getStringExtra("last name");
            tvLName.setText(last_name);
            String email = getIntent().getStringExtra("email");
            tvEmail.setText(email);
            String profile = getIntent().getStringExtra("img");
            Glide.with(DetailActivity.this)
                    .load(profile)
                    .into(ivProflie);

        }

    }
}
