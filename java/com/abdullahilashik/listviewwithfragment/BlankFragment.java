package com.abdullahilashik.listviewwithfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    View view;
    ListView listView;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        String[] names = new String[20];
        for (int i = 0; i < 20; i++) {
            names[i] = "Item " + i;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapter);

        return view;
    }

}
