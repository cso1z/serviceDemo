package com.xyz.service;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.menucontainer.Adapter;
import com.example.menucontainer.MenuContainer;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private Map<String, Class> map = new LinkedHashMap<>();
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MenuContainer container = new MenuContainer(this);
        setContentView(container);
        adapter = new Adapter(map);
        container.setAdapter(adapter);
        addData();
    }

    private void addData() {
        map.put("Simple Service", SimpleServiceActivity.class);
        adapter.notifyDataSetChanged();
    }
}