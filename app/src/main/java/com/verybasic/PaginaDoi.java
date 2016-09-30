package com.verybasic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PaginaDoi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_doi);


        Button butonBackToMainMenu = (Button) findViewById(R.id.backToMainMenu);
        butonBackToMainMenu.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaginaDoi.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}