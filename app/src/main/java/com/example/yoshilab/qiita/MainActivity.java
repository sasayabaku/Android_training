package com.example.yoshilab.qiita;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView sub001 = (TextView) findViewById(R.id.sub001);
        TextView sub002 = (TextView) findViewById(R.id.sub002);
        TextView sub003 = (TextView) findViewById(R.id.sub003);
        TextView sub004 = (TextView) findViewById(R.id.sub004);

        sub001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent001 = new Intent(getApplication(), Sub001Activity.class);
                startActivity(intent001);
            }
        });
        sub002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent002 = new Intent(getApplication(), Sub002Activity.class);
                startActivity(intent002);
            }
        });
        sub003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent003 = new Intent(getApplication(), Sub003Activity.class);
                startActivity(intent003);
            }
        });
        sub004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent004 = new Intent(getApplication(), Sub004Activity.class);
                startActivity(intent004);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


}
