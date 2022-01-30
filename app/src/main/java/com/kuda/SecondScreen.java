package com.kuda;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.kuda.databinding.ActivityDetailProjectsBinding;
import com.kuda.fragment.DetailsProjectSectionAdapter;
import com.kuda.model.Project;

public class SecondScreen extends AppCompatActivity {
    Context context;
    private ActivityDetailProjectsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        binding = ActivityDetailProjectsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DetailsProjectSectionAdapter sectionsPagerAdapter = new DetailsProjectSectionAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.vpDetailsProject;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);
        setValues();



    }
    private void setValues() {


//        byte[] byteArray = getIntent().getByteArrayExtra("tpImage");
        Bitmap bmp = getIntent().getParcelableExtra("tpImage");

        // get the text from MainActivity
        Intent intent = getIntent();

        Project trendingProject = intent.getParcelableExtra("namaObj");
//        RecommendProject recommendProject = intent.getParcelableExtra("trendObj");
     //   RecommendProject recommendProject = intent.getParcelableExtra("recomObj");



//        // ================
//        String trendingProjectNama = intent.getStringExtra("tpNama");
//        String trendingProjectUsername = intent.getStringExtra("tpUsername");
//        String trendingProjectProgress = intent.getStringExtra("tpProgress");
//        String trendingProjectCategory = intent.getStringExtra("tpCategory");
//        String trendingProjectJumlahPendana = intent.getStringExtra("tpJumlahPendana");
//        String trendingProjectDescription = intent.getStringExtra("tpDescription");
//        String trendingProjectJumlahLike = intent.getStringExtra("tpJumlahLike");
//        String trendingProjectTargetDana = intent.getStringExtra("tpTargetDana");
//        String trendingProjectTenggatWaktu = intent.getStringExtra("tpTenggatWaktu");
//        String trendingProjectJumlahDanaTerkumpul = intent.getStringExtra("tpJumlahDanaTerkumpul");
//        String trendingProjectComment = intent.getStringExtra("tpComment");
//        String trendingProjectRatingProject = intent.getStringExtra("tpRatingProject");
//        String trendingProjectPortofolio = intent.getStringExtra("tpPortofolio");
//        // ================

        // use the text in a TextView

        ImageView ivProjectImage = (ImageView) findViewById(R.id.imageProject);

        // =====================
        TextView tvProjectNama = (TextView) findViewById(R.id.namaProject);
        TextView tvProjectUsername = (TextView) findViewById(R.id.username);
        TextView tvProjectProgress = (TextView) findViewById(R.id.progress);
        TextView tvProjectCategory = (TextView) findViewById(R.id.category);
        TextView tvProjectJumlahPendana = (TextView) findViewById(R.id.jumlahPendana);
        TextView tvProjectDescription = (TextView) findViewById(R.id.description);
        TextView tvProjectJumlahLike = (TextView) findViewById(R.id.jumlahLike);
        TextView tvProjectTargetDana = (TextView) findViewById(R.id.targetDana);
        TextView tvProjectTenggangWaktu = (TextView) findViewById(R.id.tenggatWaktu);
        TextView tvProjectJumlahDanaTerkumpul = (TextView) findViewById(R.id.jumlahDanaTerkumpul);
        TextView tvProjectComment = (TextView) findViewById(R.id.comment);
        TextView tvProjectRatingProject = (TextView) findViewById(R.id.ratingProject);
        TextView tvProjectPortofolio = (TextView) findViewById(R.id.portofolio);
        // ======================




        // =====================
        tvProjectNama.setText(trendingProject.getNamaProject());
        tvProjectUsername.setText(""+trendingProject.getUsername());
        tvProjectProgress.setText(""+trendingProject.getProgress());
        tvProjectCategory.setText(""+trendingProject.getCategory());
        tvProjectJumlahPendana.setText("Funded "+trendingProject.getJumlahPendana()+" people");
        tvProjectDescription.setText(""+trendingProject.getDescription());
        tvProjectJumlahLike.setText("Like : "+trendingProject.getJumlahLike());
        tvProjectTargetDana.setText("Target : Rp."+trendingProject.getTargetDana());
        tvProjectTenggangWaktu.setText(""+ trendingProject.getTenggatWaktu());
        tvProjectJumlahDanaTerkumpul.setText("Rp."+ trendingProject.getJumlahDanaTerkumpul());
        tvProjectComment.setText(""+trendingProject.getComment());
        tvProjectRatingProject.setText(""+trendingProject.getRatingProject());
        tvProjectPortofolio.setText(""+trendingProject.getPortofolio());


        // =====================


        // =====================
//        tvProjectNama.setText("Nama : "+recommendProject.getNamaProject());
//        tvProjectUsername.setText("Username : "+recommendProject.getUsername());
//        tvProjectProgress.setText("Progress : "+recommendProject.getProgress());
//        tvProjectCategory.setText("Category : "+recommendProject.getCategory());
//        tvProjectJumlahPendana.setText("Pendana : "+recommendProject.getJumlahPendana());
//        tvProjectDescription.setText("Description : "+recommendProject.getDescription());
//        tvProjectJumlahLike.setText("Like : "+recommendProject.getJumlahLike());
//        tvProjectTargetDana.setText("Target Dana : "+recommendProject.getTargetDana());
//        tvProjectTenggangWaktu.setText("Tenggang Waktu : "+ recommendProject.getTenggatWaktu());
//        tvProjectJumlahDanaTerkumpul.setText("Jumlah Dana : "+ recommendProject.getJumlahDanaTerkumpul());
//        tvProjectComment.setText("Comment : "+recommendProject.getComment());
//        tvProjectRatingProject.setText("Rating : "+recommendProject.getRatingProject());
//        tvProjectPortofolio.setText("Portofolio : "+recommendProject.getPortofolio());
        // =====================

//        Drawable d = new BitmapDrawable(getResources(),bmp);
        ivProjectImage.setImageBitmap(bmp);
//        ivProjectImage.setImageDrawable(d);
//        Intent intentFragment1 =new Intent(context, DetailsProjectDescriptionFragment.class);
//        intentFragment1.putExtra("descriptionObj", trendingProject);



    }
}
