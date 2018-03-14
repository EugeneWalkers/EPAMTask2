package ew.dangerous;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CustomMailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button send = findViewById(R.id.send);
        EditText person = findViewById(R.id.person);
        final String emailString = person.toString();
        EditText subj = findViewById(R.id.subject);
        final String subjectString = subj.toString();
        EditText body = findViewById(R.id.body);
        final String bodyString = body.toString();
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToSenderEmail = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", emailString, null));
                goToSenderEmail.putExtra(Intent.EXTRA_SUBJECT, subjectString);
                goToSenderEmail.putExtra(Intent.EXTRA_TEXT, bodyString);
                startActivity(Intent.createChooser(goToSenderEmail, "Send mail"));
            }
        });
    }
}
