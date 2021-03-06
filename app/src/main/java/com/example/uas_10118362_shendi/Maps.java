package com.example.uas_10118362_shendi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
/* Tanggal pengerjaan : Sabtu 14 Agustus 2021
        NIM : 10118362
        NAMA : Shendi Rakhma Diansyah
        Kelas : IF-9*/



public class Maps extends Fragment implements OnMapReadyCallback {
GoogleMap maps;
    public Maps() {
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_maps, container, false);

    }
    public void onMapReady(GoogleMap googleMap) {
       maps = googleMap;

        LatLng latlng = new LatLng(-6.9150363753016535, 107.65551661463958);
        maps.addMarker(new MarkerOptions().position(latlng).title("Griya"));
        maps.moveCamera(CameraUpdateFactory.newLatLng(latlng));
    }
}