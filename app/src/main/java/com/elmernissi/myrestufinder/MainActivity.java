package com.elmernissi.myrestufinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.elmernissi.myrestufinder.MyAdapter.MyAdapter;
import com.elmernissi.myrestufinder.model.Magasin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Magasin> listMagasin;

    private Spinner citySpinner;
    private List<String> newcities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //RecyclerView
        List<Magasin>listMagasin= new ArrayList<>();
        listMagasin.add(new Magasin("res1","Safi","07141414"));
        listMagasin.add(new Magasin("res2","Casa","07881414"));
        listMagasin.add(new Magasin("res2","tanger","07100414"));
        MyAdapter myadapter = new MyAdapter(listMagasin);
        recyclerView.setAdapter(myadapter);

        //Spinner
        citySpinner = findViewById(R.id.citySpinner);

        String[] newcities= (getResources().getStringArray(R.array.cities));
        ArrayAdapter spinnerAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,newcities);
        spinnerAdapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        citySpinner.setAdapter(spinnerAdapter);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemid=item.getItemId();
        if(itemid==R.id.contact) {
            Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(itemid==R.id.aide) {
            Toast.makeText(this, "Aide", Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }
}