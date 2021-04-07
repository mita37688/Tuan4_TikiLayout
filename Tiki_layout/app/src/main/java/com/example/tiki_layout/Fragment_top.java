package com.example.tiki_layout;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_top#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_top extends Fragment {
    SendingData sendingData;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private int quantity = 0;
    private int price;

    public Fragment_top() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        sendingData = (SendingData) context;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_top.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_top newInstance(String param1, String param2) {
        Fragment_top fragment = new Fragment_top();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        ImageButton imgBtnAdd = view.findViewById(R.id.imgBtnAdd);
        ImageButton imgBtnMinus = view.findViewById(R.id.imgBtnMinus);
        final TextView tvQuantity = view.findViewById(R.id.tvQuantity);
        
        quantity = Integer.parseInt(tvQuantity.getText().toString());
        price = Integer.parseInt(tvQuantity.getText().toString());
        
        imgBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity++;
                tvQuantity.setText(String.valueOf(quantity));
                sendingData.sendData(String.valueOf(quantity * 141800));
            }
        });

        imgBtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity--;
                tvQuantity.setText(String.valueOf(quantity));
                sendingData.sendData(String.valueOf(quantity * 141800));
            }
        });
        return view;
    }
}