package com.kuda;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kuda.adapter.CustomAdaptor;
import com.kuda.adapter.TrendingProjectAdapter;
import com.kuda.model.Project;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    HorizontalInfiniteCycleViewPager viewPager;
    List<Project> trendingProjectList = new ArrayList<>();

    RecyclerView viewListRecommendProject;
    List<Project> projectList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Trending Project
        initData();
        viewPager = (HorizontalInfiniteCycleViewPager)findViewById(R.id.view_pager);
        TrendingProjectAdapter adapter = new TrendingProjectAdapter(this,trendingProjectList);
        viewPager.setAdapter(adapter);
        //End Trending Project

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //Set Home Selected
        bottomNavigationView.setSelectedItemId(R.id.home);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        return true;

                    case R.id.search:
                        startActivity(new Intent(getApplicationContext(),SearchActivity.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        return true;

                    case R.id.add:
                        startActivity(new Intent(getApplicationContext(),AddProjectActivity.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        return true;

                    case R.id.setting:
                        startActivity(new Intent(getApplicationContext(),SettingsActivity.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        return true;

                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext(),UserProfile.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        return true;

                }
                return false;
            }
        });

        viewListRecommendProject = findViewById(R.id.list_recommend_project);

        projectList = new ArrayList<>();


        projectList.add(new Project("1","Teknologi","Muhammad Arief","2.000.000","30","2","1.800.000","4","Funding","Deskripsi Project Alat Pendeteksi Banjir Keliling","Comment Alat Pendeteksi Banjir","4","Portofolio Alat Pendeteksi Banjir","Alat Pendeteksi Banjir", R.drawable.aquaman1));
        projectList.add(new Project("2","Teknologi","Aldi Almain","18.000.000","30","2","5.200.000","4","Funding","Deskripsi Project Sistem Informasi Bencana","Comment Sistem Informasi Bencana","3.5","Portofolio Sistem Informasi Bencana","Sistem Informasi Bencana", R.drawable.john_wick));
        projectList.add(new Project("3","Pertanian","Bayu Satria","1.500.000","30","2","800.000","4","Funding","Deskripsi Project Pembasmi Tikus di Sawah","Comment Pembasmi Tikus di Sawah","5","Portofolio Pembasmi Tikus di Sawah","Pembasmi Tikus di Sawah", R.drawable.bumblebee));
        projectList.add(new Project("4","Pertanian","Bagas Kara Farhan","12.500.000","30","2","3.000.000","4","Funding","Deskripsi Project Pupuk Dari Kotoran Sapi","Comment Pupuk Dari Kotoran Sapi","4.2","Portofolio Pupuk Dari Kotoran Sapi","Pupuk Dari Kotoran Sapi", R.drawable.john_wick));
        projectList.add(new Project("5","Kesehatan","Dwi Pratiwi","3.000.000","30","2","1.100.000","4","Funding","Deskripsi Project Vaksinasi Daerah Terpencil","Comment Vaksinasi Daerah Terpencil","4.4","Portofolio Vaksinasi Daerah Terpencil","Vaksinasi Daerah Terpencil", R.drawable.aquaman));
        projectList.add(new Project("6","Kesehatan","Hilda Aryanitau","5.000.000","30","2","1.500.000","4","Funding","Deskripsi Project Puskesmas Sederhana","Comment Puskesmas Sederhana","5","Portofolio Puskesmas Sederhana","Puskesmas Sederhana", R.drawable.aquaman));
        projectList.add(new Project("7","Iot","Choirun nisa","2.000.000","30","2","400.000","4","Funding","Deskripsi Project Automatisasi Pelaporan Bencana","Comment Automatisasi Pelaporan Bencana","4.8","Portofolio Automatisasi Pelaporan Bencana","Automatisasi Pelaporan Bencana", R.drawable.aquaman));
        projectList.add(new Project("8","Iot","Oki Sahroni","4.500.000","30","2","2.400.000","4","Funding","Deskripsi Project Pelacak Jalan Tercepat","Comment Pelacak Jalan Tercepat","4.8","Portofolio Pelacak Jalan Tercepat","Pelacak Jalan Tercepat", R.drawable.aquaman));
        projectList.add(new Project("9","Perkebunan","Juliari Batu Apung","20.000.000","30","2","10.800.000","4","Funding","Deskripsi Project Desa Mandiri","Comment Desa Mandiri","4.8","Portofolio Desa Mandiri","Desa Mandiri", R.drawable.aquaman));
        projectList.add(new Project("10","Perkebunan","Eric Terakhir","18.000.000","30","2","2.500.000","4","Funding","Deskripsi Project Pengolahan Jagung","Comment Pengolahan Jagung","4.8","Portofolio Pengolahan Jagung","Automatisasi Pengolahan Jagung", R.drawable.aquaman));



        LinearLayoutManager manager1 = new LinearLayoutManager(this);
        manager1.setOrientation(LinearLayoutManager.HORIZONTAL);
        viewListRecommendProject.setLayoutManager(manager1);

        CustomAdaptor adaptorRecommendProject = new CustomAdaptor(this,projectList);
        viewListRecommendProject.setAdapter(adaptorRecommendProject);

    }

    private void initData(){

        trendingProjectList.add(new Project("1","Teknologi","Muhammad Arief","2.000.000","30","2","1.800.000","4","Funding","Deskripsi Project Alat Pendeteksi Banjir","Comment Alat Pendeteksi Banjir","4","Portofolio Alat Pendeteksi Banjir","Alat Pendeteksi Banjir", R.drawable.aquaman));
        trendingProjectList.add(new Project("2","Teknologi","Aldi Almain","18.000.000","30","2","5.200.000","4","Funding","Deskripsi Project Sistem Informasi Bencana","Comment Sistem Informasi Bencana","3.5","Portofolio Sistem Informasi Bencana","Sistem Informasi Bencana", R.drawable.aquaman));
        trendingProjectList.add(new Project("3","Pertanian","Bayu Satria","1.500.000","30","2","800.000","4","Funding","Deskripsi Project Pembasmi Tikus di Sawah","Comment Pembasmi Tikus di Sawah","5","Portofolio Pembasmi Tikus di Sawah","Pembasmi Tikus di Sawah", R.drawable.aquaman));
        trendingProjectList.add(new Project("4","Pertanian","Bagas Kara Farhan","12.500.000","30","2","3.000.000","4","Funding","Deskripsi Project Pupuk Dari Kotoran Sapi","Comment Pupuk Dari Kotoran Sapi","4.2","Portofolio Pupuk Dari Kotoran Sapi","Pupuk Dari Kotoran Sapi", R.drawable.aquaman));
        trendingProjectList.add(new Project("5","Kesehatan","Dwi Pratiwi","3.000.000","30","2","1.100.000","4","Funding","Deskripsi Project Vaksinasi Daerah Terpencil","Comment Vaksinasi Daerah Terpencil","4.4","Portofolio Vaksinasi Daerah Terpencil","Vaksinasi Daerah Terpencil", R.drawable.aquaman));
        trendingProjectList.add(new Project("6","Kesehatan","Hilda Aryanitau","5.000.000","30","2","1.500.000","4","Funding","Deskripsi Project Puskesmas Sederhana","Comment Puskesmas Sederhana","5","Portofolio Puskesmas Sederhana","Puskesmas Sederhana", R.drawable.aquaman));
        trendingProjectList.add(new Project("7","Iot","Choirun nisa","2.000.000","30","2","400.000","4","Funding","Deskripsi Project Automatisasi Pelaporan Bencana","Comment Automatisasi Pelaporan Bencana","4.8","Portofolio Automatisasi Pelaporan Bencana","Automatisasi Pelaporan Bencana", R.drawable.aquaman));
        trendingProjectList.add(new Project("8","Iot","Oki Sahroni","4.500.000","30","2","2.400.000","4","Funding","Deskripsi Project Pelacak Jalan Tercepat","Comment Pelacak Jalan Tercepat","4.8","Portofolio Pelacak Jalan Tercepat","Pelacak Jalan Tercepat", R.drawable.aquaman));
        trendingProjectList.add(new Project("9","Perkebunan","Juliari Batu Apung","20.000.000","30","2","10.800.000","4","Funding","Deskripsi Project Desa Mandiri","Comment Desa Mandiri","4.8","Portofolio Desa Mandiri","Desa Mandiri", R.drawable.aquaman));
        trendingProjectList.add(new Project("10","Perkebunan","Eric Terakhir","18.000.000","30","2","2.500.000","4","Funding","Deskripsi Project Pengolahan Jagung","Comment Pengolahan Jagung","4.8","Portofolio Pengolahan Jagung","Automatisasi Pengolahan Jagung", R.drawable.aquaman));

    }

    public void toLogin(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        startActivity(intent);
    }

}
