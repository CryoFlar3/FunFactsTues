package org.computermentors.funfactstues;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    // Declare Variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);

        final Random random = new Random();
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factTextView.setText(random.nextInt(3) +  "");

            }
        };
        showFactButton.setOnClickListener(listener);
    }
}














