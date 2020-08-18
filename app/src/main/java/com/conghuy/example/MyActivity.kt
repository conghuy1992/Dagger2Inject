package com.conghuy.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.conghuy.example.di.MyApplication

class MyActivity : AppCompatActivity() {
    //    @Inject
    //    NetworkApi networkApi;
    override fun onCreate(savedInstanceState: Bundle?) {
//        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)
        //        boolean injected = networkApi == null ? false : true;
//        TextView userAvailable = (TextView) findViewById(R.id.target);
//        userAvailable.setText("Dependency injection worked: " + String.valueOf(injected));
        Utils.addFragment(
            supportFragmentManager,
            "",
            R.id.container,
            MainFragment()
        )
    }
}