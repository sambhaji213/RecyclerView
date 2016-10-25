package com.recyclerview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.recyclerview.R;
import com.recyclerview.adapter.AdapterMainActivity;
import com.recyclerview.dataModel.DataModelMainActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int[] imageArray = {
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo
    };

    String[] nameArray = {
            "Symbiosis International School",
            "St. Mary's School, Pune",
            "St. Vincent's High School",
            "Air Force School",
            "Hutchings High School & Junior College",
            "Shri Shivaji Preparatory Military School",
            "Kendriya Vidyalaya",
            "The Orbis School",
            "Victorious Kidss Educares",
            "Vikhe Patil Memorial School",
            "Delhi Public School Pune"
    };

    String[] statusArray = {
            "Active",
            "Active",
            "Active",
            "Not Active",
            "Active",
            "Active",
            "Not Active",
            "Active",
            "Active",
            "Active",
            "Not Active"
    };

    String[] mobileArray = {
            "+91 9595500400",
            "+91 9595500401",
            "+91 9595500402",
            "+91 9595500403",
            "+91 9595500404",
            "+91 9595500405",
            "+91 9595500406",
            "+91 9595500407",
            "+91 9595500408",
            "+91 9595500409",
            "+91 9595500410"
    };

    GridLayoutManager gridLayoutManager;
    RecyclerView recyclerView;

    AdapterMainActivity mAdapter;
    ArrayList<DataModelMainActivity> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        gridLayoutManager = new GridLayoutManager(getApplicationContext(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        data = new ArrayList<DataModelMainActivity>();
        for (int i = 0; i < nameArray.length; i++) {
            data.add(new DataModelMainActivity(imageArray[i], nameArray[i], statusArray[i], mobileArray[i]));
        }

        mAdapter = new AdapterMainActivity(data, MainActivity.this);
        recyclerView.setAdapter(mAdapter);
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
