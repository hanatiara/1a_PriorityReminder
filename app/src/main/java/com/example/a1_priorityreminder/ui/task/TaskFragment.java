package com.example.a1_priorityreminder.ui.task;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

import com.example.a1_priorityreminder.MainActivity;
import com.example.a1_priorityreminder.R;
import com.example.a1_priorityreminder.taskData;

public class TaskFragment extends Fragment {
    private ArrayList<String> Data;
    public TaskFragment() {}

    private String[] title = {"PR Matematika Hal 23, Rapat Osis", "Tugas Seni Budaya Teater", "Presentasi Sejarah"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_task, null);
        ListView listView = (ListView) view.findViewById(R.id.listtask);

        Data = new ArrayList<>();
        getData();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, title);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent,View view, int position, long id) {
                Intent sendData = new Intent(getActivity(), taskData.class);
                sendData.putExtra("Title", title[position]);
                startActivity(sendData);
            }
        });

        return listView;
    }

    private void getData () {

        Collections.addAll(Data, title);
    }
}