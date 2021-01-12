package space.aidynuly.secondapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment=null;
                    switch (item.getItemId())
                    {
                        case R.id.nav_home:
                            selectedFragment=new HomeFragment();
                            break;
                        case R.id.nav_favorites:
                            selectedFragment=new FavoriteFragment();
                            break;
                        case R.id.nav_search:
                            selectedFragment=new SearchFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                    return true;
                }
            };

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