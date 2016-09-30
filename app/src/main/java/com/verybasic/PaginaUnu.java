package com.verybasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class PaginaUnu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_unu);


        Button butonBackToMainMenu = (Button) findViewById(R.id.backToMainMenu);
        butonBackToMainMenu.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PaginaUnu.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}