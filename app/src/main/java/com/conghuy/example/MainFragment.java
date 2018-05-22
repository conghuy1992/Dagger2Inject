package com.conghuy.example;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class MainFragment extends Fragment {
    @Inject
    NetworkApi networkApi;
    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_main, container, false);
        initView(v);
        return v;

//        ((SettingFragment) getParentFragment()).setCommonInfo(Utils.getMsg(getActivity(), R.string.Smartphone_Link_Debug_screen), true);
//        binding = DataBindingUtil.inflate(
//                inflater, R.layout.activity_main, container, false);
//        View view = binding.getRoot();
//        //here data must be an instance of the class MarsDataProvider
//        binding.setLifecycleOwner(this);
//        binding.setViewModel(viewModel);
//
//        return view;

//        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        binding.setLifecycleOwner(this);
//        binding.setViewModel(viewModel);
    }

    private void initView(View v) {
        boolean injected = networkApi == null ? false : true;
        TextView userAvailable = (TextView) v.findViewById(R.id.target);
        userAvailable.setText("Dependency injection worked: " + String.valueOf(injected));
    }
}
