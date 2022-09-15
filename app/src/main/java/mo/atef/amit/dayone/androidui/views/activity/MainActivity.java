package mo.atef.amit.dayone.androidui.views.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("LifeCycle", "OnCreate is called!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("LifeCycle", "OnStart is called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("LifeCycle", "OnResume is called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("LifeCycle", "OnPause is called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("LifeCycle", "OnStop is called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("LifeCycle", "OnDestroy is called!");
    }
}