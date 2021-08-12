package com.holiyay.tugas_uas_genap_2021_akb_if_9_10118377.ui.maps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.holiyay.tugas_uas_genap_2021_akb_if_9_10118377.R;

public class MapsFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng lerengAnteng = new LatLng(-6.841630003633277, 107.62278376592819);
            LatLng lembangWonderland = new LatLng(-6.816775923335994, 107.61280173894394);
            LatLng greatAsiaAfrica = new LatLng(-6.832963205609953, 107.60415949661605);
            LatLng farmHouse = new LatLng(-6.832713331836135, 107.60563975428805);

            googleMap.addMarker(new MarkerOptions().position(lerengAnteng).title("Marker in Lereng Anteng"));
            googleMap.addMarker(new MarkerOptions().position(lembangWonderland).title("Marker in Lembang Wonderland"));
            googleMap.addMarker(new MarkerOptions().position(greatAsiaAfrica).title("Marker in Great Asia Africa"));
            googleMap.addMarker(new MarkerOptions().position(farmHouse).title("Marker in Farm House"));

            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(farmHouse, 14));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}