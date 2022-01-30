package com.kuda;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.kuda.databinding.ActivityDetailProjectsBinding;
import com.kuda.databinding.ActivityDetailsProjectBinding;
import com.kuda.databinding.ActivitySecondScreenBinding;
import com.kuda.fragment.DetailsProjectSectionAdapter;
import com.kuda.model.Project;

public class DetailProjectsActivity extends AppCompatActivity {
    Project selectedProject;
    private ActivitySecondScreenBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_projects);
        binding = ActivitySecondScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        DetailsProjectSectionAdapter sectionsPagerAdapter = new DetailsProjectSectionAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.vpDetailsProject;
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);


        getSelectedProject();
        setValues();


    }

    private void getSelectedProject() {
        Intent previousIntent = getIntent();
        String parsedStringID = previousIntent.getStringExtra("id");
        selectedProject = getParsedProject(parsedStringID);
    }

    private Project getParsedProject(String parsedID) {
        for (Project project : SearchActivity.projectList) {
            if (project.getId().equals(parsedID))
                return project;
        }
        return null;
    }

    private void setValues() {


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

        ImageView ivProject = (ImageView) findViewById(R.id.imageProject);


        tvProjectNama.setText(""+selectedProject.getNamaProject());
        tvProjectUsername.setText(""+selectedProject.getUsername());
        tvProjectProgress.setText(""+selectedProject.getProgress());
        tvProjectCategory.setText(""+selectedProject.getCategory());
        tvProjectJumlahPendana.setText("Funded "+selectedProject.getJumlahPendana()+" people");
        tvProjectDescription.setText(""+selectedProject.getDescription());
        tvProjectJumlahLike.setText("Like "+selectedProject.getJumlahLike());
        tvProjectTargetDana.setText("Target : Rp."+selectedProject.getTargetDana());
        tvProjectTenggangWaktu.setText(""+selectedProject.getTenggatWaktu());
        tvProjectJumlahDanaTerkumpul.setText("Rp."+selectedProject.getJumlahDanaTerkumpul());
        tvProjectComment.setText(""+selectedProject.getComment());
        tvProjectRatingProject.setText(""+selectedProject.getRatingProject());
        tvProjectPortofolio.setText(""+selectedProject.getPortofolio());

        ivProject.setImageResource(selectedProject.getImage());



    }
}