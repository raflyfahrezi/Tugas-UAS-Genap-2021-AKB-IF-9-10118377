/*

9 Agustus 2021

10118377
Farhan Rafly Fahrezi Saepulloh
IF - 9

*/

package com.example.tugas_uas_genap_2021_akb_if_9_10118377.ui.info;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugas_uas_genap_2021_akb_if_9_10118377.R;
import com.example.tugas_uas_genap_2021_akb_if_9_10118377.ui.info.view_pager.*;

import java.util.ArrayList;
import java.util.List;

public class InfoFragment extends Fragment {

    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_info, container, false);

        viewPager = root.findViewById(R.id.pager);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        List<Fragment> list = new ArrayList<>();
        list.add(new ViewPagerFragment1());
        list.add(new ViewPagerFragment2());
        list.add(new ViewPagerFragment3());

        pagerAdapter = new SlidePagerAdapter(requireActivity().getSupportFragmentManager(), list);

        viewPager.setAdapter(pagerAdapter);
    }
}