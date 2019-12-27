package android.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int total;
    private int toBeTotaled;

    public MainActivity() {
        total = 0;
        toBeTotaled = 0;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView empty = (TextView) findViewById(R.id.textView);
        empty.setText("0");

        // One
        Button one = findViewById(R.id.button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                toBeTotaled += 1;
                if(toBeTotaled > 1) {
                    textView.setText(textView.getText()+"1");
                } else {
                    textView.setText("1");
                }
                System.out.println(toBeTotaled);


            }
        });

        // Add
        ImageButton add =  findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
