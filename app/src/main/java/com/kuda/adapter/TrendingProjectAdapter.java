package com.kuda.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.kuda.DetailsProjectDescriptionFragment;
import com.kuda.R;
import com.kuda.SecondScreen;
import com.kuda.model.Project;

import java.util.List;

public class TrendingProjectAdapter extends PagerAdapter {
    Context context;
    List<Project> trendingProjectList;

    public TrendingProjectAdapter(Context context, List<Project> trendingProjectList) {
        this.context = context;
        this.trendingProjectList = trendingProjectList;
    }

    @Override
    public int getCount() {
        return trendingProjectList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item,container,false);

        ImageView trendingProjectImage = (ImageView) view.findViewById(R.id.trending_project_image);


        // =================================
        TextView trendingProjectNama = (TextView) view.findViewById(R.id.trendingProjectNama);
        TextView trendingProjectProgress = (TextView) view.findViewById(R.id.trendingProjectProgress);
        TextView trendingProjectCategory = (TextView) view.findViewById(R.id.trendingProjectCategory);
        TextView trendingProjectDescription = (TextView) view.findViewById(R.id.trendingProjectDescription);
        TextView trendingProjectTargetDana = (TextView) view.findViewById(R.id.trendingProjectTargetDana);


        // =====================

        trendingProjectNama.setText(trendingProjectList.get(position).getNamaProject());
        trendingProjectProgress.setText(trendingProjectList.get(position).getProgress());
        trendingProjectCategory.setText(trendingProjectList.get(position).getCategory());
        trendingProjectDescription.setText(trendingProjectList.get(position).getDescription());
        trendingProjectTargetDana.setText(trendingProjectList.get(position).getTargetDana());
        // =====================

        trendingProjectImage.setImageResource(trendingProjectList.get(position).getImage());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bitmap bmp = ((BitmapDrawable)trendingProjectImage.getDrawable()).getBitmap();

                Intent intentSecondActivity=new Intent(context, SecondScreen.class);

                intentSecondActivity.putExtra("tpImage",bmp);

                intentSecondActivity.putExtra("namaObj",trendingProjectList.get(position));

                context.startActivity(intentSecondActivity);
//                Intent intentDetails = new Intent(context, DetailsProjectDescriptionFragment.class);
//
//                intentDetails.putExtra("descObj",trendingProjectList.get(position));
//                context.startActivity(intentDetails);
            }
        });

        container.addView(view);
        return view;
    }
}
