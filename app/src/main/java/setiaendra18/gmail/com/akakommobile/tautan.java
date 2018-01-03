package setiaendra18.gmail.com.akakommobile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class tautan extends program_studi {

    ListView listView;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tautan);
/*        listView = (ListView)findViewById(R.id.listView);
        adapter = ArrayAdapter.createFromResource(this,R.array.array_list,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
    }
}
*/
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        adapter = ArrayAdapter.createFromResource(this, R.array.array_list, android.R.layout.simple_list_item_1);
//    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //          R.array.array_list, );
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position) {
                    case 0:
                        String url0 = "https://www.akakom.ac.id/";
                        Intent i0 = new Intent(Intent.ACTION_VIEW);
                        i0.setData(Uri.parse(url0));
                        startActivity(i0);
                        break;
                    case 1:
                        String url1 = "http://siakad.akakom.ac.id/";
                        Intent i1 = new Intent(Intent.ACTION_VIEW);
                        i1.setData(Uri.parse(url1));
                        startActivity(i1);
                        break;
                    case 2:
                        String url2 = "http://lab.akakom.ac.id/";
                        Intent i2 = new Intent(Intent.ACTION_VIEW);
                        i2.setData(Uri.parse(url2));
                        startActivity(i2);
                        break;
                    case 3:
                        String url3 = "http://widyabaktiyk.or.id/";
                        Intent i3 = new Intent(Intent.ACTION_VIEW);
                        i3.setData(Uri.parse(url3));
                        startActivity(i3);
                        break;
                    case 4:
                        String url4 = "http://pmb.akakom.ac.id/";
                        Intent i4 = new Intent(Intent.ACTION_VIEW);
                        i4.setData(Uri.parse(url4));
                        startActivity(i4);
                        break;
                    case 5:
                        String url5 = "https://ti.akakom.ac.id/";
                        Intent i5 = new Intent(Intent.ACTION_VIEW);
                        i5.setData(Uri.parse(url5));
                        startActivity(i5);
                        break;
                    case 6:
                        String url6 = "https://perpus.akakom.ac.id/";
                        Intent i6 = new Intent(Intent.ACTION_VIEW);
                        i6.setData(Uri.parse(url6));
                        startActivity(i6);
                        break;
                    case 7:
                        String url7 = "http://blog.akakom.ac.id/";
                        Intent i7 = new Intent(Intent.ACTION_VIEW);
                        i7.setData(Uri.parse(url7));
                        startActivity(i7);
                        break;
                    case 8:
                        String url8 = "https://hmjti.akakom.ac.id/";
                        Intent i8 = new Intent(Intent.ACTION_VIEW);
                        i8.setData(Uri.parse(url8));
                        startActivity(i8);
                        break;
                    case 9:
                        String url9 = "https://hmjsi.akakom.ac.id/\n";
                        Intent i9 = new Intent(Intent.ACTION_VIEW);
                        i9.setData(Uri.parse(url9));
                        startActivity(i9);
                        break;
                    case 10:
                        String url10 = "http://hmjtk.akakom.ac.id/\n";
                        Intent i10 = new Intent(Intent.ACTION_VIEW);
                        i10.setData(Uri.parse(url10));
                        startActivity(i10);
                        break;
                    case 11:
                        String url11 = "https://ukm-ik.akakom.ac.id/";
                        Intent i11 = new Intent(Intent.ACTION_VIEW);
                        i11.setData(Uri.parse(url11));
                        startActivity(i11);
                        break;
                }
            }

            @SuppressWarnings("unused")
            public void onClick(View v) {
            }
        });
    }//end oncreate
}//endactivity