package com.smartlines.buhwar.ui.fragment.guardias.tabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smartlines.buhwar.R;
import com.smartlines.buhwar.model.GuardiaModel;
import com.smartlines.buhwar.ui.adpater.guardias.InactivoAdapter;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class IncativosFragment extends Fragment {

    private InactivoAdapter mAdapter;
    private RecyclerView mRecyclerView;
    private List<GuardiaModel> list;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflatedView = (View) inflater.inflate(R.layout.fragment_inactivos, container, false);
        mRecyclerView = (RecyclerView) inflatedView.findViewById(R.id.rvInactivo);
        list = new ArrayList<GuardiaModel>();
        GuardiaModel guardia1 = new GuardiaModel("Guardia 1", 12345, "", false);
        GuardiaModel guardia2 = new GuardiaModel("Guardia 2", 12345, "", false);
        GuardiaModel guardia3 = new GuardiaModel("Guardia 3", 12345, "", false);
        list.add(guardia1);
        list.add(guardia2);
        list.add(guardia3);



        fillAdapter(list);
        return inflatedView;

    }

    public void  fillAdapter(List<GuardiaModel> list){
        mAdapter = new InactivoAdapter(list,getActivity());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

}
