/*

9 Agustus 2021

10118377
Farhan Rafly Fahrezi Saepulloh
IF - 9

*/

package com.holiyay.tugas_uas_genap_2021_akb_if_9_10118377.ui.place;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.holiyay.tugas_uas_genap_2021_akb_if_9_10118377.R;
import com.holiyay.tugas_uas_genap_2021_akb_if_9_10118377.model.PlaceModel;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class PlaceFragment extends Fragment {

    RecyclerView recyclerView;
    PlaceAdapter placeAdapter;

    @Override
    public void onStart() {
        super.onStart();
        placeAdapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        placeAdapter.stopListening();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_place, container, false);

        recyclerView = (RecyclerView) root.findViewById(R.id.place_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        FirebaseRecyclerOptions<PlaceModel> options =
                new FirebaseRecyclerOptions.Builder<PlaceModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("places"), PlaceModel.class)
                        .build();

        placeAdapter = new PlaceAdapter(options);
        recyclerView.setAdapter(placeAdapter);

        return root;
    }
}