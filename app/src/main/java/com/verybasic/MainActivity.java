package com.verybasic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button butonPaginaUnu = (Button) findViewById(R.id.pagina_unu);
        butonPaginaUnu.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, PaginaUnu.class);
                    startActivity(intent);
                }
            });

     Button butonPaginaDoi = (Button) findViewById(R.id.pagina_doi);
     butonPaginaDoi.setOnClickListener(new View.OnClickListener()

     {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this, PaginaDoi.class);
             startActivity(intent);
         }
     });
    }


}
