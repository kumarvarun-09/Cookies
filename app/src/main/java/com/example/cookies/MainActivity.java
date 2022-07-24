package com.example.cookies;

import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    boolean cookieStatus = true;
    public void handleCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView iV = (ImageView) findViewById(R.id.android_cookie_image_view);
        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView tV = (TextView) findViewById(R.id.status_text_view);
        // TODO: Find a reference to the ButtonView in the layout. Change the text.
        Button bV = (Button) findViewById(R.id.button_view);
        if(cookieStatus)
        {
            iV.setImageResource(R.drawable.after_cookie);
            tV.setText("I'm so full 😋");
            bV.setText("Bring New Cookie");
            cookieStatus = false;
        }
        else
        {
            iV.setImageResource(R.drawable.before_cookie);
            tV.setText("I'm so Hungry 😛");
            bV.setText("Eat Cookie");
            cookieStatus = true;
        }

    }

}