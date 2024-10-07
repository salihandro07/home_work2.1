package com.example.home_work21;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Получение данных из Intent
        String songTitle = getIntent().getStringExtra("songTitle");

        // Создание экземпляра DetailFragment и передача данных
        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("songTitle", songTitle);
        detailFragment.setArguments(bundle);

        // Замена текущего фрагмента на DetailFragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, detailFragment)
                .commit();
    }
}
