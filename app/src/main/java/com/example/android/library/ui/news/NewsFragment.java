package com.example.android.library.ui.news;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.library.R;

import java.util.ArrayList;
import java.util.List;

public class NewsFragment extends Fragment{
    RecyclerView recyclerView;
    NewsAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        recyclerView = (RecyclerView) inflater.inflate(
                R.layout.recycler_view, container, false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        List<String> mass = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            mass.add("1");
        }
        Log.e("TEST", "start");
        adapter = new NewsAdapter(mass);
        recyclerView.setAdapter(adapter);
        recyclerView.getAdapter().notifyDataSetChanged();
        return recyclerView;
    }
}
