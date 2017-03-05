package org.vbm.coloreffect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView desctriptionText;
    Spinner spinner;
    String[] colors;
    String[] value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControls();
    }

    public void initControls(){

        spinner = (Spinner)findViewById(R.id.spinner);
        desctriptionText = (TextView)findViewById(R.id.descriptionText);
        colors = getResources().getStringArray(R.array.colors);
        MAdapter mAdapter = new MAdapter(colors);
        spinner.setAdapter((SpinnerAdapter)mAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                desctriptionText.setText(Description.getEffect(colors[i]));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
