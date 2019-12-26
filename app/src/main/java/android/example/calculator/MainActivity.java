package android.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = findViewById(R.id.button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(textView.getText() + "1");
            }
        });

        ImageButton add =  findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
