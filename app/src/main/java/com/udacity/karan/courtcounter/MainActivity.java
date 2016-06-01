package com.udacity.karan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id == R.id.action_share){
            Toast.makeText(this, "Share clicked", Toast.LENGTH_LONG ).show();
        } else if(id == R.id.action_search){
            Toast.makeText(this, "Search clicked", Toast.LENGTH_LONG ).show();
        }else if(id == R.id.action_settings){
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_LONG ).show();
        }else if(id == R.id.action_code){
            Toast.makeText(this, "Code clicked", Toast.LENGTH_LONG ).show();
        }else if(id == R.id.action_contact_us){
            Toast.makeText(this, "Contact us clicked", Toast.LENGTH_LONG ).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
