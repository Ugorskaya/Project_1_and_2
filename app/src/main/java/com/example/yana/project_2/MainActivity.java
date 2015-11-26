package com.example.yana.project_2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private TextView textView;

    Button buttonWeb;
    Button buttonMaps;
    Button buttonPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText  = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView  = (TextView) findViewById(R.id.textView);

        buttonWeb = (Button) findViewById(R.id.buttonWeb);
        buttonMaps = (Button) findViewById(R.id.buttonMaps);
        buttonPhone = (Button) findViewById(R.id.buttonPhone);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent;
                switch (view.getId()) {
                    case R.id.buttonWeb:
                        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com"));
                        startActivity(intent);
                        break;
                    case R.id.buttonMaps:
                        intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("geo:55.754283,37.62002"));
                        startActivity(intent);
                        break;
                    case R.id.buttonPhone:
                        intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:12345"));
                        startActivity(intent);
                        break;
                }
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

    public void ClickButton(View v)
    {
        double a = Double.parseDouble(editText.getText().toString());
        double b = Double.parseDouble(editText2.getText().toString());
        double c = a+b;
        textView.setText(Double.toString(c));
    }

    public void ClickButton2(View v)
    {
        Intent intent;
        switch (v.getId()) {
            case R.id.buttonWeb:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/search?q=dblbj+rfntyrf+lf.n+yt+h%27yljvyj(&oq=dblbj+rfntyrf+lf.n+yt+h%27yljvyj(&aqs=chrome..69i57.905j0j1&sourceid=chrome&es_sm=122&ie=UTF-8#newwindow=1&q=%D0%BF%D1%80%D0%BE%D0%B2%D0%B5%D1%80%D0%BA%D0%B0+%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D1%8B+%D0%BA%D0%BD%D0%BE%D0%BF%D0%BA%D0%B8+buttonWeb"));
                startActivity(intent);
                break;
            case R.id.buttonMaps:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:52.249574, 104.263928"));
                startActivity(intent);
                break;
            case R.id.buttonPhone:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:224-22-49"));
                startActivity(intent);
                break;
        }
    }
    }



