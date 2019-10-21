package com.smartlines.buhwar.ui.fragment.visitante.tabs;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.smartlines.buhwar.R;
import com.smartlines.buhwar.model.VisitanteModel;

import java.util.ArrayList;
import java.util.List;

public class VisitanteFragment extends Fragment {

    private Button btnSearch;
    private TextView txtSearch;
    private TextView txtName;
    private TextView txtlastNema;
    private TextView txtNoControl;
    private TextView txtDate;
    private TextView txtTime;
    private TextView txtSuspect;
    private VisitanteModel visitanteModel1;
    private VisitanteModel visitanteModel2;
    private VisitanteModel visitanteModel3;
    private VisitanteModel visitanteModel4;
    private VisitanteModel visitanteModel5;
    private List<VisitanteModel> listModelos;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_visitante, container, false);

          btnSearch = (Button)view.findViewById(R.id.btnBuscarVisitado);
          txtSearch = (TextView)view.findViewById(R.id.etxtSearchAdd);
          txtName = (TextView)view.findViewById(R.id.etxtNameVisitado);
          txtlastNema = (TextView)view.findViewById(R.id.etxtLastNemVisitado);
          txtNoControl = (TextView)view.findViewById(R.id.etxtAdressVisitado);
          txtDate = (TextView)view.findViewById(R.id.etxtDate);
          txtTime = (TextView)view.findViewById(R.id.etxtTime);
          txtSuspect = (TextView)view.findViewById(R.id.etxtEmailVisitado);

        visitanteModel1 = new VisitanteModel("Jesus","Ramires","100","10/10/2019","13:45","Ninguno");
        visitanteModel2 = new VisitanteModel("Ivan","Reyes","101","10/10/2019","13:45","Ninguno");
        visitanteModel3 = new VisitanteModel("Alex","Gonzalez","102","10/10/2019","13:45","Ninguno");
        visitanteModel4 = new VisitanteModel("Luis Jr","Aguayo","103","10/10/2019","13:45","Ninguno");
        visitanteModel5 = new VisitanteModel("Jesus","Nuñes","104","10/10/2019","13:45","Ninguno");
       listModelos = new ArrayList<VisitanteModel>();
        listModelos.add(visitanteModel1);
        listModelos.add(visitanteModel2);
        listModelos.add(visitanteModel3);
        listModelos.add(visitanteModel4);
        listModelos.add(visitanteModel5);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
               String value = txtSearch.getText().toString();

                for (VisitanteModel mModel: listModelos) {
                    if(value.equals(mModel.getNoControl())){
                        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                        builder.setMessage("Usuario encontrado")
                                .setTitle("Busqueda terminada");
                        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });
                        AlertDialog dialog = builder.create();
                        dialog.show();
                          txtName.setText(mModel.getName());
                          txtlastNema.setText(mModel.getLastNema());
                          txtNoControl.setText(mModel.getNoControl());
                          txtDate.setText(mModel.getmDate());
                          txtTime.setText(mModel.getmTime());
                          txtSuspect.setText(mModel.getSuspect());
                          break;
                    }
                }
            }
        });
        return view;
    }



}