package com.foodnow;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {

    RecyclerView rvRestaurants;
    ArrayList<Restaurant> restaurants;
    RestaurantAdapter restaurantAdapter;

    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurant, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvRestaurants = view.findViewById(R.id.rvRestaurants);
        restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Circle K", R.drawable.ic_circlek,R.drawable.cover_menu_1,"40 Hung Vuong","8:00 AM - 10:00 PM"));
        restaurants.add(new Restaurant("Highland Coffee", R.drawable.ic_highland,R.drawable.cover_menu_1,"30 Nguyễn Văn Cừ","9:00 AM - 10:00 PM"));
        restaurants.add(new Restaurant("MiniStop", R.drawable.ic_ministop,R.drawable.cover_menu_1,"70 Lý Thái Tổ","7:00 AM - 11:00 PM"));
        restaurants.add(new Restaurant("Vinmart", R.drawable.ic_vinmart,R.drawable.cover_menu_1,"82 Nguyễn Tri Phương","8:00 AM - 8:00 PM"));
        restaurants.add(new Restaurant("7 Eleven", R.drawable.ic_seveneleven,R.drawable.cover_menu_1,"11 Hồng Bàng","8:00 AM - 6:00 PM"));

        restaurantAdapter = new RestaurantAdapter(getContext(),restaurants);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false);
        rvRestaurants.setAdapter(restaurantAdapter);
        rvRestaurants.setLayoutManager(layoutManager);

        restaurantAdapter.setListener(new RestaurantAdapter.OnItemClickListener() {
            @Override
            public void OnClick(View v, int position) {
                Intent intent = new Intent(getContext(),OrderActivity.class);
                ArrayList<Food> menu = new ArrayList<>();
                menu.add(new Food("Bánh mì",R.drawable.ic_banh_mi,12000));
                menu.add(new Food("Black Coffee",R.drawable.ic_black_coffee,35000));
                menu.add(new Food("Milk Tea",R.drawable.ic_milk_tea,30000));
                menu.add(new Food("Long Tea",R.drawable.ic_milk_tea,40000));
                menu.add(new Food("Hỏa Tea",R.drawable.ic_milk_tea,50000));
/*                Bundle extra = new Bundle();
                extra.putSerializable("menu",menu);
                extra.putString("restaurant",restaurants.get(position).getName());
                extra.putString("address",restaurants.get(position).getAddress());
                extra.putString("openhours",restaurants.get(position).getOpenHours());*/
                //intent.putExtras(extra);
                startActivity(intent);
            }
        });

    }
}
