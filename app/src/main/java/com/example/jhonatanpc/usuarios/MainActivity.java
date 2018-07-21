package com.example.jhonatanpc.usuarios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<User> items = new ArrayList<>();

        items.add(new User("1- Jose","SanJuan"));
        items.add(new User("2- Jose","SanJuan"));
        items.add(new User("3- Jose","SanJuan"));
        items.add(new User("4- Jose","SanJuan"));
        items.add(new User("5- Jose","SanJuan"));
        items.add(new User("6- Jose","SanJuan"));
        items.add(new User("7- Jose","SanJuan"));
        items.add(new User("8- Jose","SanJuan"));
        items.add(new User("9- Jose","SanJuan"));
        items.add(new User("10- Jose","SanJuan"));
        items.add(new User("11- Jose","SanJuan"));
        items.add(new User("12- Jose","SanJuan"));
        items.add(new User("13- Jose","SanJuan"));
        items.add(new User("14- Jose","SanJuan"));

        //instancia adaptador
        UserAdapter adapter = new UserAdapter(this, items);
        listView.setAdapter(adapter);
    }
}
