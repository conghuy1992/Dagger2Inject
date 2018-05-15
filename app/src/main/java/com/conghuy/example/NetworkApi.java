package com.conghuy.example;

import javax.inject.Inject;

import dagger.Provides;

public class NetworkApi {
    @Inject
    public NetworkApi() {
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
