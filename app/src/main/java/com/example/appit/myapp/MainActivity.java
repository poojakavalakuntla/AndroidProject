package com.example.appit.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String[] androidTopics={"Image View","ButtonPractice","SpinnerPractice","Radio ButtonPractice","Check box","Toggle ButtonPractice"};
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Toolbar toolbar=(Toolbar)findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.main_toolbar_heading);

        onInit();

    }

    private void onInit() {
        ListView listView=(ListView)findViewById(R.id.lv_android_topics);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, androidTopics);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition=position;
                switch (itemPosition){
                    case 0:
                        intent=new Intent(MainActivity.this,ImageViewPractice.class);
                        break;
                    case 1:
                        intent=new Intent(MainActivity.this,ButtonPractice.class);
                        break;
                    case 2:
                        intent=new Intent(MainActivity.this,SpinnerPractice.class);
                        break;
                    case 3:
                        intent=new Intent(MainActivity.this,RadioButtonPractice.class);
                        break;
                    case 4:
                        intent=new Intent(MainActivity.this,CheckBoxPractice.class);
                        break;
                    case 5:
                        intent=new Intent(MainActivity.this,ToggleButton.class);
                        break;
                }
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.option1:
                Toast.makeText(getApplicationContext(),"you select option1",Toast.LENGTH_LONG).show();
                break;
            case R.id.option2:
                Toast.makeText(getApplicationContext(),"you select option2",Toast.LENGTH_LONG).show();
                break;
            case R.id.option3:
                Toast.makeText(getApplicationContext(),"you select option3",Toast.LENGTH_LONG).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
