package com.example.myproject.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.myproject.CalenderFragment;
import com.example.myproject.FacilitiesFragment;
import com.example.myproject.LocationFragment;
import com.example.myproject.R;
import com.example.myproject.ReservationFragment;
import com.example.myproject.RoomFragment;
import com.example.myproject.ui.gallery.GalleryFragment;

public class HomeFragment extends Fragment {

    ImageView gallary;
    CardView cardView;


    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, final Bundle savedInstanceState) {

         View v = inflater.inflate(R.layout.fragment_home, container, false);
        CardView cardView = v.findViewById(R.id.card1);
        CardView cardView2 = v.findViewById(R.id.card2);
        CardView cardView3 = v.findViewById(R.id.card3);
        CardView cardView4 = v.findViewById(R.id.card4);
        CardView cardView5 = v.findViewById(R.id.card5);
        CardView cardView6 = v.findViewById(R.id.card6);




        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              HomeFragment homeFragment = new HomeFragment();
                FragmentManager manager =  getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment,new GalleryFragment()).commit();


            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeFragment homeFragment = new HomeFragment();
                FragmentManager manager =  getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment,new RoomFragment()).commit();


            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeFragment homeFragment = new HomeFragment();
                FragmentManager manager =  getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment,new CalenderFragment()).commit();
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeFragment homeFragment = new HomeFragment();
                FragmentManager manager =  getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment,new FacilitiesFragment()).commit();
            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeFragment homeFragment = new HomeFragment();
                FragmentManager manager =  getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment,new ReservationFragment()).commit();
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HomeFragment homeFragment = new HomeFragment();
                FragmentManager manager =  getFragmentManager();
                manager.beginTransaction().replace(R.id.nav_host_fragment,new LocationFragment()).commit();
            }
        });


        return v;

    }


}
