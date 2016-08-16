package com.example.srima.optionsmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()) {
            case R.id.menu1:
                Toast.makeText(this, "you are selected HELP options", Toast.LENGTH_LONG).show();
                 break;
            case R.id.menu2:
                Toast.makeText(this, "you are selected ABOUT options", Toast.LENGTH_LONG).show();
                break;
            default:
                break;
        }
                return super.onOptionsItemSelected(item);

    }
}
