package com.example.android.cgpacalculator;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class BottomFragment extends Fragment  {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.bottom_fragment, container, false);

        Spinner spinner1 = (Spinner) view.findViewById(R.id.num_of_courses_spinner);
        List<String> courses_spinner = new ArrayList<String>();
        courses_spinner.add("1");
        courses_spinner.add("2");
        courses_spinner.add("3");
        courses_spinner.add("4");
        courses_spinner.add("5");
        courses_spinner.add("6");
        courses_spinner.add("7");
        courses_spinner.add("8");
        courses_spinner.add("9");
        courses_spinner.add("10");

        ArrayAdapter<String> adap = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, courses_spinner);
        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(adap);

        Spinner spinner = (Spinner) view.findViewById(R.id.gradeA);
        //spinner.setOnItemSelectedListener(this); wont work bcos 'this' refers to the fragment instead of main_activity. use line below instead

        spinner.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                         String selected = parent.getItemAtPosition(position).toString();

                        switch(selected) {
                            case "A" :
                                int grStore = 5;

                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                }
        );

        Spinner spinner2 = (Spinner) view.findViewById(R.id.gradeB);
        Spinner spinner3 = (Spinner) view.findViewById(R.id.gradeC);

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);

        Spinner spinner4 = (Spinner) view.findViewById(R.id.unitC);

        spinner4.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });

        Spinner spinner5 = (Spinner) view.findViewById(R.id.unitC2);
        Spinner spinner6 = (Spinner) view.findViewById(R.id.unitC3);
        List<String> unit_list = new ArrayList<String>();
        unit_list.add("1");
        unit_list.add("2");
        unit_list.add("3");
        unit_list.add("4");
        unit_list.add("5");

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, unit_list);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner4.setAdapter(adapter2);
        spinner5.setAdapter(adapter2);
        spinner6.setAdapter(adapter2);


            return view;
    }

    public void gpCal(int gradePoint, int unitPoint) {

    }
}
