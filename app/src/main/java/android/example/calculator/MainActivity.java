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
    private TextView textView;
    private String operationWindow;
    private String addChar;
    public MainActivity() {
        total = 0;
        toBeTotaled = 0;
        operationWindow = "";
        addChar = "+";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView empty = (TextView) findViewById(R.id.textView);
        empty.setText("0");
/*
         Buttons of Calculator
         Clear
        */
        Button ce = findViewById(R.id.clear);
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                textView.setText("0");
                total = 0;
                toBeTotaled = 0;
                operationWindow = "";
            }
        });


        // Zero
        Button zero = findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);

                if(toBeTotaled > 0) {
                    textView.setText(textView.getText()+"0");
                } else {
                    textView.setText("0");
                }



            }
        });

        // One
        Button one = findViewById(R.id.button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                operationWindow += "1";
                toBeTotaled += 1;
                if(toBeTotaled > 1) {
                    textView.setText(textView.getText()+"1");
                } else {
                    textView.setText("1");
                }
                System.out.println(toBeTotaled);


            }
        });




        // two
        Button two = findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                toBeTotaled += 2;
                if(toBeTotaled > 2) {
                    textView.setText(textView.getText()+"2");
                } else {
                    textView.setText("2");
                }
                System.out.println(toBeTotaled);


            }
        });


        // three
        Button three = findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                toBeTotaled += 3;
                if(toBeTotaled > 3) {
                    textView.setText(textView.getText()+"3");
                } else {
                    textView.setText("3");
                }
                System.out.println(toBeTotaled);


            }
        });


        // four
        Button four = findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                toBeTotaled += 4;
                if(toBeTotaled > 4) {
                    textView.setText(textView.getText()+"4");
                } else {
                    textView.setText("4");
                }
                System.out.println(toBeTotaled);


            }
        });


        // five
        Button five = findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                toBeTotaled += 5;
                if(toBeTotaled > 5) {
                    textView.setText(textView.getText()+"5");
                } else {
                    textView.setText("5");
                }
                System.out.println(toBeTotaled);


            }
        });


        // six
        Button six = findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                toBeTotaled += 6;
                if(toBeTotaled > 6) {
                    textView.setText(textView.getText()+"6");
                } else {
                    textView.setText("6");
                }
                System.out.println(toBeTotaled);


            }
        });


        // seven
        Button seven = findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                toBeTotaled += 7;
                if(toBeTotaled > 7) {
                    textView.setText(textView.getText()+"7");
                } else {
                    textView.setText("7");
                }
                System.out.println(toBeTotaled);


            }
        });


        // Eight
        Button eight = findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                toBeTotaled += 8;
                if(toBeTotaled > 8) {
                    textView.setText(textView.getText()+"8");
                } else {
                    textView.setText("8");
                }
                System.out.println(toBeTotaled);


            }
        });

        // Nine
        Button nine = findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                toBeTotaled += 9;
                if(toBeTotaled > 9) {
                    textView.setText(textView.getText()+"9");
                } else {
                    textView.setText("9");
                }
                System.out.println(toBeTotaled);


            }
        });

        // Add
        final ImageButton add =  findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operationWindow.contains(addChar) == false) {
                    operationWindow += addChar;
                } // if
            }
        });

        // Equate

        Button equate =  findViewById(R.id.equate);
        equate.setOnClickListener(new View.OnClickListener() {
            String num = "";
            String num2 = "";
            @Override
            public void onClick(View v) {
                for (int i = 0; i < operationWindow.length(); i++) {

                    if (operationWindow.substring(i,i+1).equals(addChar) == false) {
                            num += operationWindow.substring(i,i+1);
                    } else {
                        num2 += operationWindow.substring(i);
                    }


                }


            }
        });

    }
}
