package com.conghuy.example;

import javax.inject.Inject;

public class NetworkApi {
    public String name;
    public int age;
    @Inject
    public NetworkApi() {
        name = "Huy";
        age = 10;
    }

//    @Provides
//    static NetworkApi provideNetworkApi() {
//        return new NetworkApi();
//    }

    public boolean validateUser(String username, String password) {
        // imagine an actual network call here
        // for demo purpose return false in "real" life
        if (username == null || username.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}
