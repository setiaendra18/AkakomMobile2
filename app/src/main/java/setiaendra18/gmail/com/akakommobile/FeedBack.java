package setiaendra18.gmail.com.akakommobile;

/**
 * Created by ADHIT on 12/27/2017.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FeedBack extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_feedback);
        Button showToast = (Button) findViewById(R.id.ShowToast);
        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FeedBack.this, "Toast Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}


