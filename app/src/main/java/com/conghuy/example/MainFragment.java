package com.conghuy.example;

import android.content.Context;
import android.support.v4.app.Fragment;

import dagger.android.support.AndroidSupportInjection;

public class MainFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }
}
