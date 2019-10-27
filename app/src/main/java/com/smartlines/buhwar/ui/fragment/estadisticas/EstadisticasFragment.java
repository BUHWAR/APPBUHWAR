package com.smartlines.buhwar.ui.fragment.estadisticas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.smartlines.buhwar.R;

import java.util.ArrayList;


public class EstadisticasFragment extends Fragment {

    PieChart pieChart;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_estadisticas, container, false);
        pieChart = (PieChart) inflatedView.findViewById(R.id.grafico_pastel);
        fillGraphic();
        return inflatedView;
    }

    private void fillGraphic() {
        Description description = new Description();
        description.setText("Progreso mensual");

        pieChart.setDescription(description);

        ArrayList<PieEntry> pieEntrys = new ArrayList<PieEntry>();
        pieEntrys.add(new PieEntry(2,3));
        pieEntrys.add(new PieEntry(2,8));
        pieEntrys.add(new PieEntry(2,6));
        pieEntrys.add(new PieEntry(2,9));
        PieDataSet pieDataSet =new PieDataSet(pieEntrys,"Meses");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData pieData =new PieData(pieDataSet);

        pieChart.setData(pieData);
    }


    public static EstadisticasFragment newInstance() {
        EstadisticasFragment frag = new EstadisticasFragment();
        Bundle args = new Bundle();
        frag.setArguments(args);
        return frag;
    }


}
