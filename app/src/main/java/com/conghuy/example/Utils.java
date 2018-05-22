package com.conghuy.example;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class Utils {
    public static void addFragment(FragmentManager fragmentManager, String addToBackStack,
                                   int resId, android.support.v4.app.Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (addToBackStack != null && addToBackStack.trim().length() > 0)
            transaction.addToBackStack(addToBackStack);
        transaction.replace(resId, fragment);
        transaction.commit();
    }
}
