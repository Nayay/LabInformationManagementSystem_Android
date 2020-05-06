

package com.example.lims_app;

        import androidx.appcompat.app.AppCompatActivity;

        import android.app.ActionBar;
        import android.content.Intent;
        import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Thread thread = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(5000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent mainIntent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(mainIntent);
                }
            }

        };
        thread.start();
    }


    protected  void onPause()
    {
        super.onPause();
        finish();
    }
}