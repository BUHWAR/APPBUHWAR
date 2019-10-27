package com.smartlines.buhwar.ui.fragment.incidencias;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.smartlines.buhwar.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class InicidenciasFragment extends Fragment {
    private TextView txtDateInc;
    private TextView txtTimeInc;
    private Spinner spinnerPlace;
    private Spinner spinnerViews;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_incidencias, container, false);
        txtTimeInc = inflatedView.findViewById(R.id.txtTimeInc);
        txtDateInc = inflatedView.findViewById(R.id.txtDateInc);
        spinnerPlace = inflatedView.findViewById(R.id.spinnerPlace);
        spinnerViews = inflatedView.findViewById(R.id.spinnerViews);
        Calendar calender = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("HH:mm:ss");
        String strTime = "Hora actual : " + mdformat.format(calender.getTime());
        SimpleDateFormat  dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = "Fecha : "+dateFormat.format(calender.getTime());

        String[] opcPlace = {"Domicilio particular","Area de esparcimeinto","Area publica","Otro"};
        String[] opcviews = {"Robo a casa habitación"," Robo de vehículo "," Robo a transeúnte",
                "Daño en propiedad ajena","Allanamiento de morada"," Lesiones","Alteración del orden público"};

        ArrayAdapter adapterPlace = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, opcPlace);
        ArrayAdapter adapterviews = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, opcviews);

        spinnerViews.setAdapter(adapterviews);
        spinnerPlace.setAdapter(adapterPlace);
        txtTimeInc.setText(strTime);
        txtDateInc.setText(strDate);


        return inflatedView;
    }


    public static InicidenciasFragment newInstance() {
        InicidenciasFragment frag = new InicidenciasFragment();
        Bundle args = new Bundle();
        frag.setArguments(args);
        return frag;
    }


}
