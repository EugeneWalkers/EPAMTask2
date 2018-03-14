package ew.dangerous;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CustomMailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send = findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSenderEmail = new Intent();
                goToSenderEmail.addCategory(Intent.CATEGORY_APP_EMAIL);
                //goToSenderEmail.setAction(Intent.)
                startActivity(goToSenderEmail);
            }
        });
    }
}
