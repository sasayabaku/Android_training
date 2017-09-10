package com.example.yoshilab.qiita;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import org.w3c.dom.Text;

import java.util.Random;

public class Sub002Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub002);

        // 戻るアイコンの指定
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    // Homeに戻る処理関数
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // 乱数を取得する関数
    public void getrandom(View view) {
        Random r = new Random();
        int n = r.nextInt(30) + 1;
        TextView tv = (TextView) findViewById(R.id.number);
        tv.setText(String.valueOf(n));
    }



}
