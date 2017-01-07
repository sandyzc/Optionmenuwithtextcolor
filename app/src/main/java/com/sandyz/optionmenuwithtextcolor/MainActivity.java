package com.sandyz.optionmenuwithtextcolor;

import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_menu);
        textView = (TextView) findViewById(R.id.text1);
        getSupportActionBar();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater m = getMenuInflater();
        m.inflate(R.menu.menu, menu);

        return true;


    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.blue) {
            textView.setTextColor(getResources().getColor(R.color.blue, null));
            return true;
        } else if (id == R.id.red) {
            textView.setTextColor(getResources().getColor(R.color.red, null));
            return true;

        } else if (id == R.id.green) {
            textView.setTextColor(getResources().getColor(R.color.green, null));
            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}
