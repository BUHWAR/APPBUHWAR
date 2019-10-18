package com.smartlines.buhwar.ui.fragment.helper;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.smartlines.buhwar.R;

import org.w3c.dom.Text;

import static com.smartlines.buhwar.utils.Constanst.INFO;
import static com.smartlines.buhwar.utils.Constanst.MISION;
import static com.smartlines.buhwar.utils.Constanst.PERSONA;
import static com.smartlines.buhwar.utils.Constanst.VISION;

public class InfoFragment extends Fragment {

    private Button btnInfo;
    private Button btnMision;
    private Button btnVision;
    private Button btnPersonal;
    private TextView txtInfo;
    private TextView txtMision;
    private TextView txtVision;
    private TextView txtPersonal;
    private boolean flagInfo = false;
    private boolean flagMision = false;
    private boolean flagVision = false;
    private boolean flagPersonal = false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_info, container, false);
        btnInfo = (Button) view.findViewById(R.id.btnInfo);
        btnMision = (Button) view.findViewById(R.id.btnMision);
        btnVision = (Button) view.findViewById(R.id.btnVsion);
        btnPersonal = (Button) view.findViewById(R.id.btnPersonal);

        txtInfo = (TextView) view.findViewById(R.id.txtInfo);


        txtMision = (TextView) view.findViewById(R.id.txtMision);
        txtVision = (TextView) view.findViewById(R.id.txtVision);
        txtPersonal = (TextView) view.findViewById(R.id.txtPerosnal);


        btnInfo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!flagInfo){
                    txtInfo.setText(INFO);
                    txtInfo.setBackgroundColor(Color.WHITE);
                    flagInfo = true;
                }else {
                    txtInfo.setText("");
                    txtInfo.setBackgroundColor(Color.parseColor("#6A6A72"));
                    flagInfo = false;
                }
            }
        }); btnMision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!flagMision){
                    txtMision.setText(MISION);
                    txtMision.setBackgroundColor(Color.WHITE);
                    flagMision = true;
                }else {
                    txtMision.setText("");
                    txtMision.setBackgroundColor(Color.parseColor("#6A6A72"));
                    flagMision = false;


                }
            }
        }); btnVision.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!flagVision){
                    txtVision.setText(VISION);
                    txtVision.setBackgroundColor(Color.WHITE);

                    flagVision = true;
                }else {
                    txtVision.setText("");
                    txtVision.setBackgroundColor(Color.parseColor("#6A6A72"));
                    flagVision = false;


                }
            }
        }); btnPersonal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!flagPersonal){
                    txtPersonal.setText(PERSONA);
                    txtPersonal.setBackgroundColor(Color.WHITE);
                    flagPersonal = true;
                }else {
                    txtPersonal.setText("");
                    txtPersonal.setBackgroundColor(Color.parseColor("#6A6A72"));
                    flagPersonal = false;


                }
            }
        });

        return view;
    }

    public static InfoFragment newInstance() {
        InfoFragment frag = new InfoFragment();
        Bundle args = new Bundle();
        frag.setArguments(args);
        return frag;
    }


}
