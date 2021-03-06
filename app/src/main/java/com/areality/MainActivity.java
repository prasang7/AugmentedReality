package com.areality;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout arViewPane = (FrameLayout) findViewById(R.id.ar_view_pane);

        ArDisplayView arDisplay = new ArDisplayView(getApplicationContext(),this);
        arViewPane.addView(arDisplay);

        OverlayView arContent = new OverlayView(getApplicationContext());
        arViewPane.addView(arContent);

    }
}
