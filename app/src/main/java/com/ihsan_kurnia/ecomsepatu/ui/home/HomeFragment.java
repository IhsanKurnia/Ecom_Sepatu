package com.ihsan_kurnia.ecomsepatu.ui.home;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ihsan_kurnia.ecomsepatu.R;
import com.ihsan_kurnia.ecomsepatu.adapter.HomeAdapter;
import com.ihsan_kurnia.ecomsepatu.model.HomeModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements HomeAdapter.ItemAdapterCallback {

    private RecyclerView rvSport;
    private List<HomeModel> listData;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvSport = view.findViewById(R.id.rv_sport);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listData = new ArrayList<>();
        listData.add(new HomeModel(1, "Ariel", "New", "30%", "url"));
        listData.add(new HomeModel(2, "Ariel", "New", "30%", "url"));
        listData.add(new HomeModel(3, "Ariel", "New", "30%", "url"));
        listData.add(new HomeModel(4, "Ariel", "New", "30%", "url"));
        listData.add(new HomeModel(5, "Ariel", "New", "30%", "url"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        HomeAdapter homeAdapter = new HomeAdapter(listData, this);
        rvSport.setLayoutManager(linearLayoutManager);
        rvSport.setAdapter(homeAdapter);
    }

    @Override
    public void onClick(View view) {

    }
}