package com.smartlines.buhwar.ui.fragment.visitante;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.smartlines.buhwar.R;
import com.smartlines.buhwar.ui.adpater.guardias.GuardiasAdapter;
import com.smartlines.buhwar.ui.fragment.guardias.tabs.ActivosFragment;
import com.smartlines.buhwar.ui.fragment.guardias.tabs.IncativosFragment;
import com.smartlines.buhwar.ui.fragment.visitante.tabs.VisitadoFragment;
import com.smartlines.buhwar.ui.fragment.visitante.tabs.VisitanteFragment;


public class VisitaFragment extends Fragment {

    ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = (View) inflater.inflate(R.layout.fragment_visita, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.viewPagerVisita);

        addTabs(viewPager);
        TabLayout tabLayout =  view.findViewById(R.id.tabLayoutVisita);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FF0000"));
        tabLayout.setSelectedTabIndicatorHeight((int) (5 * getResources().getDisplayMetrics().density));
        tabLayout.setTabTextColors(Color.parseColor("#ED6A5A"), Color.parseColor("#ffffff"));
        tabLayout.setupWithViewPager( viewPager );
        return view;
    }
    private void addTabs(ViewPager viewPager) {
        GuardiasAdapter adapter = new GuardiasAdapter(getFragmentManager());
        adapter.addFrag(new VisitanteFragment(), "Visitante");
        adapter.addFrag(new VisitadoFragment(), "Visita");

        viewPager.setAdapter(adapter);
    }

    public static VisitaFragment newInstance() {
        VisitaFragment frag = new VisitaFragment();
        Bundle args = new Bundle();
        frag.setArguments(args);
        return frag;
    }


}
