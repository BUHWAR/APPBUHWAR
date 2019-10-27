package com.smartlines.buhwar.ui.fragment.visitante;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.smartlines.buhwar.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class VisitaFragment extends Fragment {

    private TextView txtNameVisitante;
    private TextView txtLatsNameVistante;
    private TextView txtMatriculaVisitante;
    private TextView txtDateVistante;
    private TextView txtTimeVisitante;
    private TextView txtNameVistado;
    private TextView txtLatsNameVistado;
    private TextView txtAdressVisitado;
    private TextView txtEmalVisitado;
    private Button btnVisistante;
    private Button btnVisitado;
    private Spinner spinnerSopecha;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_visita, container, false);
          txtNameVisitante = inflatedView.findViewById(R.id.txtNameVisitante);
          txtLatsNameVistante  = inflatedView.findViewById(R.id.txtLastNameVisitante);
          txtMatriculaVisitante = inflatedView.findViewById(R.id.txtMatriculaVisitante);
          txtDateVistante  = inflatedView.findViewById(R.id.txtDateVisitante);
          txtTimeVisitante  = inflatedView.findViewById(R.id.txtTimeVisitante);
          txtNameVistado  = inflatedView.findViewById(R.id.txtNameVisitado);
          txtLatsNameVistado  = inflatedView.findViewById(R.id.txtLastnameVisitado);
          txtAdressVisitado  = inflatedView.findViewById(R.id.txtxAdressVisitado);
          txtEmalVisitado  = inflatedView.findViewById(R.id.txtEmailVisitado);
          btnVisistante  = inflatedView.findViewById(R.id.btnSubmitVisitante);
          btnVisitado  = inflatedView.findViewById(R.id.btnVisitado);
          spinnerSopecha  = inflatedView.findViewById(R.id.spinnerSopecha);

        Calendar calender = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("HH:mm:ss");
        String strTime = "" + mdformat.format(calender.getTime());
        SimpleDateFormat  dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = ""+dateFormat.format(calender.getTime());
        txtDateVistante.setText(strDate);
        txtTimeVisitante.setText(strTime);

        String[] opcSospecha = {"bajo","Moderado","Alto"};
        ArrayAdapter adapterPlace = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, opcSospecha);
        spinnerSopecha.setAdapter(adapterPlace);

        return inflatedView;
    }


    public static VisitaFragment newInstance() {
        VisitaFragment frag = new VisitaFragment();
        Bundle args = new Bundle();
        frag.setArguments(args);
        return frag;
    }


}
