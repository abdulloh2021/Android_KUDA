package com.kuda.adapter;

import android.annotation.SuppressLint;
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
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.kuda.R;
import com.kuda.SecondScreen;
import com.kuda.model.Project;

import java.util.List;

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.RecommendProjectHolder> {

    private Context context;
    private List<Project> recommendProjects;

    public CustomAdaptor(Context context, List<Project> recommendProjects) {
        this.context = context;
        this.recommendProjects = recommendProjects;
    }

    public class RecommendProjectHolder extends RecyclerView.ViewHolder {

        TextView recommendProjectNama,recommendProjectUsername,recommendProjectProgress,recommendProjectCategory,recommendProjectJumlahPendana,recommendProjectDescription,recommendProjectLike,recommendProjectTargetDana,recommendProjectTenggatWaktu,recommendProjectJumlahDanaTerkumpul,recommendProjectComment,recommendProjectRatingProject,recommendProjectPortofolio;
        ImageView imageProject;
        CardView cardView;

        public RecommendProjectHolder(@NonNull View itemView) {
            super(itemView);



            imageProject = itemView.findViewById(R.id.image_project);
            cardView = itemView.findViewById(R.id.card_project);

            recommendProjectNama = itemView.findViewById(R.id.recommendProjectNama);
//            recommendProjectUsername = itemView.findViewById(R.id.recommendProjectUsername);
//            recommendProjectProgress = itemView.findViewById(R.id.recommendProjectProgress);
//            recommendProjectCategory = itemView.findViewById(R.id.recommendProjectCategory);
//            recommendProjectJumlahPendana = itemView.findViewById(R.id.recommendProjectJumlahPendana);
//            recommendProjectDescription = itemView.findViewById(R.id.recommendProjectDescription);
//            recommendProjectLike = itemView.findViewById(R.id.recommendProjectLike);
            recommendProjectTargetDana = itemView.findViewById(R.id.recommendProjectTargetDana);
//            recommendProjectTenggatWaktu = itemView.findViewById(R.id.recommendProjectTenggatWaktu);
//            recommendProjectJumlahDanaTerkumpul = itemView.findViewById(R.id.recommendProjectJumlahDanaTerkumpul);
//            recommendProjectComment = itemView.findViewById(R.id.recommendProjectComment);
//            recommendProjectRatingProject = itemView.findViewById(R.id.recommendProjectRatingProject);
//            recommendProjectPortofolio = itemView.findViewById(R.id.recommendProjectPortofolio);
        }
    }

    @NonNull
    @Override
    public RecommendProjectHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout_list_item,parent,false);

        return new RecommendProjectHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendProjectHolder holder, @SuppressLint("RecyclerView") int position) {

        Project recommendProject = recommendProjects.get(position);




        holder.recommendProjectNama.setText(recommendProject.getNamaProject());
//        holder.recommendProjectUsername.setText(recommendProject.getUsername());
//        holder.recommendProjectProgress.setText(recommendProject.getProgress());
//        holder.recommendProjectCategory.setText(recommendProject.getCategory());
//        holder.recommendProjectJumlahPendana.setText(recommendProject.getJumlahPendana());
//        holder.recommendProjectDescription.setText(recommendProject.getDescription());
//        holder.recommendProjectLike.setText(recommendProject.getJumlahLike());
        holder.recommendProjectTargetDana.setText(recommendProject.getTargetDana());
//        holder.recommendProjectTenggatWaktu.setText(recommendProject.getTenggatWaktu());
//        holder.recommendProjectJumlahDanaTerkumpul.setText(recommendProject.getJumlahDanaTerkumpul());
//        holder.recommendProjectComment.setText(recommendProject.getComment());
//        holder.recommendProjectRatingProject.setText(recommendProject.getRatingProject());
//        holder.recommendProjectPortofolio.setText(recommendProject.getPortofolio());

        holder.imageProject.setImageResource(recommendProject.getImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView recommend_project_image = (ImageView) view.findViewById(R.id.image_project);
                recommend_project_image.setImageResource(recommendProject.getImage());

                Bitmap bmp = ((BitmapDrawable) recommend_project_image.getDrawable()).getBitmap();
//

                Intent intentSecondActivity=new Intent(context, SecondScreen.class);
                intentSecondActivity.putExtra("namaObj", recommendProject);
                intentSecondActivity.putExtra("tpImage",bmp);

                context.startActivity(intentSecondActivity);

            }
        });

    }

    @Override
    public int getItemCount() {
        return recommendProjects.size();
    }

}
