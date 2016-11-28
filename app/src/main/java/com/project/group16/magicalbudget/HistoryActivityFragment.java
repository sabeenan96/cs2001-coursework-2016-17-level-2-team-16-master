package com.project.group16.magicalbudget;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class HistoryActivityFragment extends Fragment {

    public HistoryActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       final ArrayList<String> dummyData = new ArrayList<String>();
        dummyData.add("- £40 Tesco");
        dummyData.add("+ £25 Argos");
        dummyData.add("- £20 Lidl");
        dummyData.add("- £43 Tesco");
        dummyData.add("+ £45 Argos");
        dummyData.add("- £70 Lidl");
        dummyData.add("- £12 Tesco");
        dummyData.add("+ £21 Argos");
        dummyData.add("- £34 Lidl");
        dummyData.add("- £87 Tesco");
        dummyData.add("+ £43 Argos");
        dummyData.add("- £87 Lidl");
        dummyData.add("- £34 Tesco");
        dummyData.add("+ £56 Argos");
        dummyData.add("- £12 Lidl");


        View rootView = inflater.inflate(R.layout.fragment_history, container, false);
        final CustomHistoryAdapter histAdapter = new CustomHistoryAdapter(getContext(),R.layout.list_item_history,dummyData);

        final ListView listView =(ListView) rootView.findViewById(R.id.lstviewHistory);
        listView.setAdapter(histAdapter);


        Spinner spinner = (Spinner) rootView.findViewById(R.id.spnnrCatHistory);

        final List<String> dummyCat = new ArrayList<String>();
        dummyCat.add("All Categories");
        dummyCat.add("Travel");
        dummyCat.add("Food");
        dummyCat.add("Bills");
        dummyCat.add("Clothing");
        dummyCat.add("Social");
        dummyCat.add("Toiletries");
        dummyCat.add("Other");




        final ArrayAdapter<String> catAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_item,dummyCat);

        catAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(catAdapter);

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
