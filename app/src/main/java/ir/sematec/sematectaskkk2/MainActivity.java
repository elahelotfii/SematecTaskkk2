package ir.sematec.sematectaskkk2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Task2","OnCreate call");
    }

    @Override
    protected void onStart( ) {
        super.onStart( );
        Log.d("Task2","OnStart call");
    }

    @Override
    protected void onResume( ) {
        super.onResume( );
        Log.d("Task2","OnResume call");
    }

    @Override
    protected void onPause( ) {
        super.onPause();
        Log.d("Task2","OnStop call");
    }

    @Override
    protected void onStop( ) {
        super.onStop( );
        Log.d("Task2","OnStop call");
    }

    @Override
    protected void  onDestroy( ) {
        super.onDestroy();
        Log.d("Task2","OnDestroy call");
    }

    @Override
    protected void onRestart( ) {
        super.onRestart();
        Log.d("Task2","OnRestart call");
    }

}


