package setiaendra18.gmail.com.akakommobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView;
    private List<News> newsList;
    private RecyclerViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        initPersonData();
        adapter=new RecyclerViewAdapter(newsList,MainActivity.this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        }
    private void initPersonData() {
        newsList =new ArrayList<>();

        newsList.add(new News(getString(R.string.news_one_title),getString(R.string.news_one_desc),R.drawable.umar));
        newsList.add(new News(getString(R.string.news_two_title),getString(R.string.news_two_desc),R.drawable.aksikebangsaan));
        newsList.add(new News(getString(R.string.news_three_title),getString(R.string.news_three_desc),R.drawable.devsummit2017));
        newsList.add(new News(getString(R.string.news_four_title),getString(R.string.news_four_desc),R.drawable.kuliahtamu));
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.beranda) {
            Intent intentku= new Intent(MainActivity.this,MainActivity.class);
            startActivity(intentku);
        } else if (id == R.id.profil) {
            Intent intentku= new Intent(MainActivity.this,profil.class);
            startActivity(intentku);
        } else if (id == R.id.program_studi) {
            Intent intentku= new Intent(MainActivity.this,program_studi.class);
            startActivity(intentku);
        } else if (id == R.id.tautan) {
            Intent intentku= new Intent(MainActivity.this,tautan.class);
            startActivity(intentku);
        } else if (id == R.id.kontak_kami) {
            Intent intentku= new Intent(MainActivity.this,kontak_kami.class);
            startActivity(intentku);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}