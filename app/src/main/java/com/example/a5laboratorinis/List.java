package com.example.a5laboratorinis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class List extends Fragment {

    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        final ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Tekstas su A raidėmis");
        arrayList.add("Be ieškomo simbolio");
        arrayList.add("Čia yra ieškomas simbolis");
        arrayList.add("Nieko nebus");
        arrayList.add("Rasi ko ieškai");
        arrayList.add("Tekstas su A raidėmis");
        arrayList.add("Be ieškomo simbolio");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), arrayList.get(position), Toast.LENGTH_SHORT).show();
                fragment(arrayList.get(position));
            }
        });
        return view;
    }

    private void fragment (String text)
    {
        if(text.toLowerCase().contains("a"))
        {
            MainActivity.WithA(text);
        }
        else
        {
            MainActivity.WithoutA(text);
        }
    }
}
