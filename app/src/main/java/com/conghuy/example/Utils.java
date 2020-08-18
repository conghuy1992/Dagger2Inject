package com.conghuy.example;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Utils {
    public static void addFragment(FragmentManager fragmentManager, String addToBackStack,
                                   int resId, Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (addToBackStack != null && addToBackStack.trim().length() > 0)
            transaction.addToBackStack(addToBackStack);
        transaction.replace(resId, fragment);
        transaction.commit();
    }
}
