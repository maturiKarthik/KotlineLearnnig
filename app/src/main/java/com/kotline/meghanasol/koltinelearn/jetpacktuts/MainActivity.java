package com.kotline.meghanasol.koltinelearn.jetpacktuts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.kotline.meghanasol.koltinelearn.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jetpackmain_activity);
        TextView textView = (TextView) findViewById(R.id.tv);
        textView.setText("Hello JetPack");
    }


}
