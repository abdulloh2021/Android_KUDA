package com.kuda;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kuda.model.Project;

public class DetailsProjectDescriptionFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details_project_description, container, false);

//        setValues();

    }

    private void setValues() {


//
//        // get the text from MainActivity
//        Intent intent = getIntent();
//
//        Project trendingProject = intent.getParcelableExtra("namaObj");
//
////        // ================
////
//        TextView tvProjectNama = (TextView) findViewById(R.id.namaProject);
//        TextView tvProjectUsername = (TextView) findViewById(R.id.username);
//        TextView tvProjectProgress = (TextView) findViewById(R.id.progress);
//        TextView tvProjectCategory = (TextView) findViewById(R.id.category);
//        TextView tvProjectJumlahPendana = (TextView) findViewById(R.id.jumlahPendana);
//        TextView tvProjectDescription = (TextView) findViewById(R.id.description);
//        TextView tvProjectJumlahLike = (TextView) findViewById(R.id.jumlahLike);
//        TextView tvProjectTargetDana = (TextView) findViewById(R.id.targetDana);
//        TextView tvProjectTenggangWaktu = (TextView) findViewById(R.id.tenggatWaktu);
//        TextView tvProjectJumlahDanaTerkumpul = (TextView) findViewById(R.id.jumlahDanaTerkumpul);
//        TextView tvProjectComment = (TextView) findViewById(R.id.comment);
//        TextView tvProjectRatingProject = (TextView) findViewById(R.id.ratingProject);
//        TextView tvProjectPortofolio = (TextView) findViewById(R.id.portofolio);
//        // ======================
//
//
//
//
//        // =====================
//        tvProjectNama.setText(trendingProject.getNamaProject());
//        tvProjectUsername.setText(""+trendingProject.getUsername());
//        tvProjectProgress.setText(""+trendingProject.getProgress());
//        tvProjectCategory.setText(""+trendingProject.getCategory());




    }
}