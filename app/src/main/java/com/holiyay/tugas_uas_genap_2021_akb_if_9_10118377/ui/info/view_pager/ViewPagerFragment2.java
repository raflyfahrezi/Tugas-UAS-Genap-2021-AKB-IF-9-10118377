/*

9 Agustus 2021

10118377
Farhan Rafly Fahrezi Saepulloh
IF - 9

*/

package com.holiyay.tugas_uas_genap_2021_akb_if_9_10118377.ui.info.view_pager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.holiyay.tugas_uas_genap_2021_akb_if_9_10118377.R;

public class ViewPagerFragment2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_view_pager2, container, false);

        return root;
    }
}