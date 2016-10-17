package za.co.ridewith.ridewith;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

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
                final Intent mainIntent = new Intent(MainActivity.this, RideWith.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, 3000);
    }

    public boolean Connect()
    {
        boolean connected = false;

        HttpURLConnection connection = null;
        BufferedReader reader = null;
        try
        {
            URL url = new URL("www.ridewith.co.za");
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream stream = connection.getInputStream();

            reader = new BufferedReader(new InputStreamReader(stream));
            StringBuilder buffer = new StringBuilder();
            String line;

            while((line = reader.readLine()) != null)
            {
                buffer.append(line);
            }
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null)
            {
                connection.disconnect();
            }
            try{
                if (reader != null)
                {
                    reader.close();
                }
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }


        return connected;
    }
}


































