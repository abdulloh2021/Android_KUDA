package com.kuda.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kuda.R;
import com.kuda.model.Project;

import java.util.List;

public class ProjectAdapter extends ArrayAdapter<Project> {

    public ProjectAdapter(Context context, int resource, List<Project> projectList)
    {
        super(context,resource,projectList);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Project project = getItem(position);
        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.project_cell, parent, false);
        }

        TextView tv = (TextView) convertView.findViewById(R.id.projectName);
        TextView tvKategori = (TextView) convertView.findViewById(R.id.projectKategori) ;
        ImageView iv = (ImageView) convertView.findViewById(R.id.projectImage);


        tv.setText( project.getNamaProject() + " - " + project.getUsername()+ " - " + project.getTargetDana());
        tvKategori.setText(project.getCategory());
        iv.setImageResource(project.getImage());


        return convertView;
    }
}
