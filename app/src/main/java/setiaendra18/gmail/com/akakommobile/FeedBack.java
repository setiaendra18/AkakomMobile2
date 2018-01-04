package setiaendra18.gmail.com.akakommobile;

/**
 * Created by ADHIT on 12/27/2017.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FeedBack extends AppCompatActivity {

    EditText to,subject,message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_feedback);


        to = (EditText) findViewById(R.id.to);
        subject = (EditText) findViewById(R.id.subject);
        message = (EditText) findViewById(R.id.message);
        send    = (Button)   findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TO      =to.getText().toString();
                String SUBJECT =subject.getText().toString();
                String MESSAGE =message.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[] {TO});
                intent.putExtra(intent.EXTRA_SUBJECT,SUBJECT);
                intent.putExtra(intent.EXTRA_TEXT,MESSAGE);

                startActivity(Intent.createChooser(intent,"Select Action"));
            }
        });
    }
}


