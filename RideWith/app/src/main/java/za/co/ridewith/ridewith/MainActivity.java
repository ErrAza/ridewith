package za.co.ridewith.ridewith;

import android.app.LauncherActivity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewMain = (TextView) findViewById(R.id.textViewMain);
        TextView textViewSub = (TextView) findViewById(R.id.textViewSub);
        Typeface logoFontBold = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Bold.ttf");
        Typeface logoFontRegular = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Regular.ttf");
        textViewMain.setTypeface(logoFontBold);
        textViewSub.setTypeface(logoFontRegular);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(MainActivity.this, Hub.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, 3000);
    }
}
