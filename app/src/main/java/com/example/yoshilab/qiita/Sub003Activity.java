package com.example.yoshilab.qiita;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sub003Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub003);

        // 戻るアイコンの指定
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final TextView gottext = (TextView) findViewById(R.id.gottext);
        final TextView gottext2 = (TextView) findViewById(R.id.gottext2);
        final EditText editname = (EditText) findViewById(R.id.editname);
        final EditText editpass = (EditText) findViewById(R.id.editPassword);
        Button imputbutton = (Button) findViewById(R.id.importbutton);

        imputbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // エディットテキストのテキスト取得
                // Name
                String text = editname.getText().toString();
                gottext.setText(text);
                // Password
                String password = editpass.getText().toString();
                gottext2.setText(password);
            }
        });

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



}
