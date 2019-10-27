package com.smartlines.buhwar.ui.fragment.sos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.smartlines.buhwar.R;


public class SosFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sos, container, false);
    }


    public static SosFragment newInstance() {
        SosFragment frag = new SosFragment();
        Bundle args = new Bundle();
        frag.setArguments(args);
        return frag;
    }


}
