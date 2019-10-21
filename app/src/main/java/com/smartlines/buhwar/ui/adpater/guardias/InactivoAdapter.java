package com.smartlines.buhwar.ui.adpater.guardias;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.smartlines.buhwar.R;
import com.smartlines.buhwar.model.GuardiaModel;

import java.util.List;

public class InactivoAdapter extends RecyclerView.Adapter<InactivoAdapter.CustomViewHolder>{
    private List<GuardiaModel> dataList;
    private Activity context;

    public InactivoAdapter(List<GuardiaModel> dataList,  Activity context) {
        this.dataList = dataList;
        this.context = context;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

//Get a reference to the Views in our layout//

        public final View myView;

        TextView txtName;
        TextView txtNoControl;
        ImageView imageView;
        RelativeLayout relativeLayout;
        View viewGenders;
        CustomViewHolder(View itemView) {
            super(itemView);
            myView = itemView;

            txtName = myView.findViewById(R.id.txtName);
            txtNoControl = myView.findViewById(R.id.txtAdress);
            imageView = myView.findViewById(R.id.imgGuardia);
            viewGenders = myView.findViewById(R.id.viewGenders);
        }
    }

    @Override

//Construct a RecyclerView.ViewHolder//

    public InactivoAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_guardias, parent, false);
        return new InactivoAdapter.CustomViewHolder(view);
    }

    @Override

//Set the data//

    public void onBindViewHolder(InactivoAdapter.CustomViewHolder holder, final int position) {
        //holder.txtName.setText(dataList.get(position).getName());
       // holder.txtNoControl.setText(dataList.get(position).getNoControl());
      //  Glide.with(context).load("https://www.google.com/url?sa=i&url=http%3A%2F%2Fwww.iconarchive.com%2Fshow%2Fpolicemen-icons-by-dapino%2FPoliceman-Uniform-icon.html&psig=AOvVaw3EAkIMVFajUwHnv1yVi4ut&ust=1571699865249000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCKixo7P8q-UCFQAAAAAdAAAAABAE").into(holder.imageView);

        RelativeLayout relativeLayout = holder.relativeLayout;


    }

//Calculate the item count for the RecylerView//

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
