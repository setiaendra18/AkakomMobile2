package setiaendra18.gmail.com.akakommobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tautan extends AppCompatActivity  {
    ListView listView;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tautan);
        listView = (ListView)findViewById(R.id.listView);
        adapter = ArrayAdapter.createFromResource(this,R.array.array_list,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

    }

}
