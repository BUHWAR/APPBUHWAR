package com.smartlines.buhwar.ui.fragment.incidencias;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.smartlines.buhwar.R;


public class InicidenciasFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_incidencias, container, false);
    }


    public static InicidenciasFragment newInstance() {
        InicidenciasFragment frag = new InicidenciasFragment();
        Bundle args = new Bundle();
        frag.setArguments(args);
        return frag;
    }


}
