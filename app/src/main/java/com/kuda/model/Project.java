package com.kuda.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Project implements Parcelable {
    private String id,category,username,targetDana,tenggatWaktu,jumlahPendana,jumlahDanaTerkumpul,jumlahLike,progress,description,comment,ratingProject,portofolio,namaProject;
    private int image;


    public static Comparator<Project> idAscending = new Comparator<Project>()
    {
        @Override
        public int compare(Project project1, Project project2)
        {
            int id1 = Integer.valueOf(project1.getId());
            int id2 = Integer.valueOf(project2.getId());

            return Integer.compare(id1, id2);
        }
    };

    public static Comparator<Project> nameAscending = new Comparator<Project>()
    {
        @Override
        public int compare(Project project1, Project project2)
        {
            String name1 = project1.getNamaProject();
            String name2 = project2.getNamaProject();
            name1 = name1.toLowerCase();
            name2 = name2.toLowerCase();

            return name1.compareTo(name2);
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.category);
        dest.writeString(this.username);
        dest.writeString(this.targetDana);
        dest.writeString(this.tenggatWaktu);
        dest.writeString(this.jumlahPendana);
        dest.writeString(this.jumlahDanaTerkumpul);
        dest.writeString(this.jumlahLike);
        dest.writeString(this.progress);
        dest.writeString(this.description);
        dest.writeString(this.comment);
        dest.writeString(this.ratingProject);
        dest.writeString(this.portofolio);
        dest.writeString(this.namaProject);
        dest.writeInt(this.image);
    }

    public void readFromParcel(Parcel source) {
        this.id = source.readString();
        this.category = source.readString();
        this.username = source.readString();
        this.targetDana = source.readString();
        this.tenggatWaktu = source.readString();
        this.jumlahPendana = source.readString();
        this.jumlahDanaTerkumpul = source.readString();
        this.jumlahLike = source.readString();
        this.progress = source.readString();
        this.description = source.readString();
        this.comment = source.readString();
        this.ratingProject = source.readString();
        this.portofolio = source.readString();
        this.namaProject = source.readString();
        this.image = source.readInt();
    }

    protected Project(Parcel in) {
        this.id = in.readString();
        this.category = in.readString();
        this.username = in.readString();
        this.targetDana = in.readString();
        this.tenggatWaktu = in.readString();
        this.jumlahPendana = in.readString();
        this.jumlahDanaTerkumpul = in.readString();
        this.jumlahLike = in.readString();
        this.progress = in.readString();
        this.description = in.readString();
        this.comment = in.readString();
        this.ratingProject = in.readString();
        this.portofolio = in.readString();
        this.namaProject = in.readString();
        this.image = in.readInt();
    }

    public static final Creator<Project> CREATOR = new Creator<Project>() {
        @Override
        public Project createFromParcel(Parcel source) {
            return new Project(source);
        }

        @Override
        public Project[] newArray(int size) {
            return new Project[size];
        }
    };
}
