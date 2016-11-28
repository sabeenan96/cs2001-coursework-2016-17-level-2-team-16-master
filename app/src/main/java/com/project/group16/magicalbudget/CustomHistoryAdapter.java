package com.project.group16.magicalbudget;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by karim on 23/11/16.
 */

public class CustomHistoryAdapter extends ArrayAdapter<String> {

    int layout;
    ArrayList<String> histArray;
    Context context;

    public CustomHistoryAdapter(Context context, int layout, ArrayList<String> histArray) {
        super(context, layout,histArray);
        this.layout = layout;
        this.histArray = histArray;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View row = convertView;

        if (row == null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layout, parent, false);
        }

        TextView textView = (TextView) row.findViewById(R.id.listItemHistoryTextview);
        textView.setText(histArray.get(position));

        ImageButton btnEdit = (ImageButton) row.findViewById(R.id.btnHistoryEdit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        return row;
    }
}
