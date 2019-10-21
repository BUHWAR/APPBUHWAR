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
import com.smartlines.buhwar.model.VisitadoModel;
import com.smartlines.buhwar.model.VisitanteModel;

import java.util.ArrayList;
import java.util.List;

public class VisitadoFragment extends Fragment {

    private TextView txtName;
    private TextView txtLastName;
    private TextView txtAdress;
    private TextView txtemail;
    private TextView txtBuscarVisitado;
    private Button btnBuscarVisitado;
    private VisitadoModel visitadoModel1;
    private VisitadoModel visitadoModel2;
    private VisitadoModel visitadoModel3;
    private VisitadoModel visitadoModel4;
    private VisitadoModel visitadoModel5;
    private List<VisitadoModel> listModelos;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = (View)  inflater.inflate(R.layout.fragment_visitado, container, false);

        btnBuscarVisitado = (Button)view.findViewById(R.id.btnBuscarVisitado);
        txtBuscarVisitado = (TextView)view.findViewById(R.id.etxtSearchAdd);
        txtName = (TextView)view.findViewById(R.id.etxtNameVisitado);
        txtLastName = (TextView)view.findViewById(R.id.etxtLastNemVisitado);
        txtAdress = (TextView)view.findViewById(R.id.etxtAdressVisitado);
        txtemail = (TextView)view.findViewById(R.id.etxtEmailVisitado);

        visitadoModel1 = new VisitadoModel("Angel","Rojas","Zacatecas,Mexico","myemail@gmail.com");
        visitadoModel2 = new VisitadoModel("Juan jose","Gomez","Jalisco,Mexico","myemail@gmail.com");
        visitadoModel3 = new VisitadoModel("Francisco","Ibañez","Aguascalientes,Mexico","myemail@gmail.com");
        visitadoModel4 = new VisitadoModel("Oscar","Alvares","Queretaro,Mexico","myemail@gmail.com");
        visitadoModel5 = new VisitadoModel("Rolando","Godinez","CDMX,Mexico","myemail@gmail.com");
        listModelos = new ArrayList<VisitadoModel>();
        listModelos.add(visitadoModel1);
        listModelos.add(visitadoModel2);
        listModelos.add(visitadoModel3);
        listModelos.add(visitadoModel4);
        listModelos.add(visitadoModel5);
        btnBuscarVisitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String value = txtBuscarVisitado.getText().toString();
                for (VisitadoModel mModel: listModelos) {
                    String aux = mModel.getAdress();
                    if(value.equals(aux)){
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
                        txtLastName.setText(mModel.getLastName());
                        txtAdress.setText(mModel.getAdress());
                        txtemail.setText(mModel.getEmail());
                        break;
                    }
                }
            }
        });
        return view;
    }


}