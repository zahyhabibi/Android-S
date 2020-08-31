package com.example.latihan_fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup containter,@Nullable Bundle saveInstanceState) {
        return inflater.inflate(R.layout.fragment_profile,null);
    }
}
