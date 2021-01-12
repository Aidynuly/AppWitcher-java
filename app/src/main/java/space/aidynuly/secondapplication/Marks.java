package space.aidynuly.secondapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Marks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);


    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d("lifecycle", "onStart: invoked");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("lifecycle", "onResume: invoked");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("lifecycle", "onPause: invoked");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("lifecycle", "onStop: invoked");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("lifecycle", "onRestart: invoked");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy: invoked");
    }
}