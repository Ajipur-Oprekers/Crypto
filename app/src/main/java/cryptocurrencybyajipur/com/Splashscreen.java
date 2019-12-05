package cryptocurrencybyajipur.com;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;

public class Splashscreen extends AppCompatActivity {
    private int waktu_loading=4000;

    //4000=4 detik
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent MainActivity = new Intent(Splashscreen.this, MainActivity.class);
                startActivity(MainActivity);
                finish();

            }
        }, waktu_loading);


    }
}

