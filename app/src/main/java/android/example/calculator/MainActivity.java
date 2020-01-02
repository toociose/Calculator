package android.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * This Code was created by Clayton A. Seals II and is not to be used for anything other than educational purposes, and is meant to be a stepping stone
 * to learning more efficient code practices involving android apps.
 */
public class MainActivity extends AppCompatActivity {

    protected int runs;
    protected int total;
    protected int toBeTotaled;
    protected int sTBT;
    protected TextView textView;
    protected String operationWindow;
    protected String operationWindowTwo;
    protected String addChar;
    protected String subChar;
    protected String multiChar;
    protected String divChar;

    public MainActivity() {

        runs = 0;
        total = 0;
        sTBT = 0;
        toBeTotaled = 0;
        operationWindow = "";
        operationWindowTwo = "";
        addChar = "+";
        subChar = "-";
        multiChar = "*";
        divChar = "/";
    }

    public void clear() {


        toBeTotaled = 0;
        operationWindow = "";
        operationWindowTwo = "";
        sTBT = 0;
        runs = 0;

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
                clear();
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


        /*
        * Lines 104 - 168 are for doing the 4 operations with the number 1.
        *
        * */
        Button one = findViewById(R.id.button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);

                if (runs > 0) {
                    if (operationWindow.contains("+")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("+", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with plus sign");
                        operationWindowTwo += "1";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("-")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("-", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with minus sign");
                        operationWindowTwo += "1";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("*")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("*", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with multiplication sign");
                        operationWindowTwo += "1";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("/")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("/", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with division sign");
                        operationWindowTwo += "1";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    }
                    if ((toBeTotaled > total)) {
                        textView.setText(textView.getText() + Integer.toString(total));

                    } else {
                        textView.setText(Integer.toString(total));
                    }
                } else { // multiple run logic... I hope

                    operationWindow += "1";

                    if ((!operationWindow.contains("+")) && (!operationWindow.contains("-")) &&
                            (!operationWindow.contains("*"))&&(!operationWindow.contains("/"))) {
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("1st 1");
                    } else {
                        operationWindowTwo += "1";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        System.out.println("2nd 1");
                    }
                    if ((toBeTotaled > 1) && (!operationWindow.contains("+")) && (!operationWindow.contains("-"))
                            && (!operationWindow.contains("*")) && (!operationWindow.contains("/"))) {
                        textView.setText(textView.getText() + "1");

                    } else {
                        textView.setText("1");
                    }

                } //multiple run logic

            }// Button One
        });




        // two
        Button two = findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                if (runs > 0) {
                    if (operationWindow.contains("+")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("+", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with plus sign");
                        operationWindowTwo += "2";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("-")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("-", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with minus sign");
                        operationWindowTwo += "2";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("*")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("*", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with multiplication sign");
                        operationWindowTwo += "2";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("/")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("/", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with division sign");
                        operationWindowTwo += "2";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    }
                    if ((toBeTotaled > total)) {
                        textView.setText(textView.getText() + Integer.toString(total));

                    } else {
                        textView.setText(Integer.toString(total));
                    }
                } else { // multiple run logic... I hope

                    operationWindow += "2";

                    if ((!operationWindow.contains("+")) && (!operationWindow.contains("-")) &&
                            (!operationWindow.contains("*"))&&(!operationWindow.contains("/"))) {
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("1st 2");
                    } else {
                        operationWindowTwo += "2";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        System.out.println("2nd 2");
                    }
                    if ((toBeTotaled > 2) && (!operationWindow.contains("+")) && (!operationWindow.contains("-"))
                            && (!operationWindow.contains("*")) && (!operationWindow.contains("/"))) {
                        textView.setText(textView.getText() + "2");

                    } else {
                        textView.setText("2");
                    }

                } //multiple run logic


            }
        });


        // three
        Button three = findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                if (runs > 0) {
                    if (operationWindow.contains("+")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("+", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with plus sign");
                        operationWindowTwo += "3";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("-")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("-", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with minus sign");
                        operationWindowTwo += "3";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("*")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("*", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with multiplication sign");
                        operationWindowTwo += "3";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("/")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("/", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with division sign");
                        operationWindowTwo += "3";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    }
                    if ((toBeTotaled > total)) {
                        textView.setText(textView.getText() + Integer.toString(total));

                    } else {
                        textView.setText(Integer.toString(total));
                    }
                } else { // multiple run logic... I hope

                    operationWindow += "3";

                    if ((!operationWindow.contains("+")) && (!operationWindow.contains("-")) &&
                            (!operationWindow.contains("*"))&&(!operationWindow.contains("/"))) {
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("1st 3");
                    } else {
                        operationWindowTwo += "3";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        System.out.println("2nd 3");
                    }
                    if ((toBeTotaled > 3) && (!operationWindow.contains("+")) && (!operationWindow.contains("-"))
                            && (!operationWindow.contains("*")) && (!operationWindow.contains("/"))) {
                        textView.setText(textView.getText() + "3");

                    } else {
                        textView.setText("3");
                    }

                } //multiple run logic


            }



        });


        // four
        Button four = findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                if (runs > 0) {
                    if (operationWindow.contains("+")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("+", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with plus sign");
                        operationWindowTwo += "4";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("-")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("-", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with minus sign");
                        operationWindowTwo += "4";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("*")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("*", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with multiplication sign");
                        operationWindowTwo += "4";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("/")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("/", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with division sign");
                        operationWindowTwo += "4";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    }
                    if ((toBeTotaled > total)) {
                        textView.setText(textView.getText() + Integer.toString(total));

                    } else {
                        textView.setText(Integer.toString(total));
                    }
                } else { // multiple run logic... I hope

                    operationWindow += "4";

                    if ((!operationWindow.contains("+")) && (!operationWindow.contains("-")) &&
                            (!operationWindow.contains("*"))&&(!operationWindow.contains("/"))) {
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("1st 4");
                    } else {
                        operationWindowTwo += "4";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        System.out.println("2nd 4");
                    }
                    if ((toBeTotaled > 4) && (!operationWindow.contains("+")) && (!operationWindow.contains("-"))
                            && (!operationWindow.contains("*")) && (!operationWindow.contains("/"))) {
                        textView.setText(textView.getText() + "4");

                    } else {
                        textView.setText("4");
                    }

                } //multiple run logic


            }
        });


        // five
        Button five = findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                if (runs > 0) {
                    if (operationWindow.contains("+")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("+", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with plus sign");
                        operationWindowTwo += "5";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("-")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("-", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with minus sign");
                        operationWindowTwo += "5";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("*")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("*", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with multiplication sign");
                        operationWindowTwo += "5";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("/")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("/", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with division sign");
                        operationWindowTwo += "5";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    }
                    if ((toBeTotaled > total)) {
                        textView.setText(textView.getText() + Integer.toString(total));

                    } else {
                        textView.setText(Integer.toString(total));
                    }
                } else { // multiple run logic... I hope

                    operationWindow += "5";

                    if ((!operationWindow.contains("+")) && (!operationWindow.contains("-")) &&
                            (!operationWindow.contains("*"))&&(!operationWindow.contains("/"))) {
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("1st 5");
                    } else {
                        operationWindowTwo += "5";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        System.out.println("2nd 5");
                    }
                    if ((toBeTotaled > 5) && (!operationWindow.contains("+")) && (!operationWindow.contains("-"))
                            && (!operationWindow.contains("*")) && (!operationWindow.contains("/"))) {
                        textView.setText(textView.getText() + "5");

                    } else {
                        textView.setText("5");
                    }

                } //multiple run logic


            }
        });


        // six
        Button six = findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                if (runs > 0) {
                    if (operationWindow.contains("+")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("+", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with plus sign");
                        operationWindowTwo += "6";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("-")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("-", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with minus sign");
                        operationWindowTwo += "6";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("*")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("*", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with multiplication sign");
                        operationWindowTwo += "6";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("/")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("/", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with division sign");
                        operationWindowTwo += "6";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    }
                    if ((toBeTotaled > total)) {
                        textView.setText(textView.getText() + Integer.toString(total));

                    } else {
                        textView.setText(Integer.toString(total));
                    }
                } else { // multiple run logic... I hope

                    operationWindow += "6";

                    if ((!operationWindow.contains("+")) && (!operationWindow.contains("-")) &&
                            (!operationWindow.contains("*"))&&(!operationWindow.contains("/"))) {
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("1st 6");
                    } else {
                        operationWindowTwo += "6";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        System.out.println("2nd 6");
                    }
                    if ((toBeTotaled > 6) && (!operationWindow.contains("+")) && (!operationWindow.contains("-"))
                            && (!operationWindow.contains("*")) && (!operationWindow.contains("/"))) {
                        textView.setText(textView.getText() + "6");

                    } else {
                        textView.setText("6");
                    }

                } //multiple run logic


            }
        });


        // seven
        Button seven = findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                if (runs > 0) {
                    if (operationWindow.contains("+")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("+", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with plus sign");
                        operationWindowTwo += "7";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("-")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("-", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with minus sign");
                        operationWindowTwo += "7";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("*")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("*", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with multiplication sign");
                        operationWindowTwo += "7";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("/")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("/", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with division sign");
                        operationWindowTwo += "7";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    }
                    if ((toBeTotaled > total)) {
                        textView.setText(textView.getText() + Integer.toString(total));

                    } else {
                        textView.setText(Integer.toString(total));
                    }
                } else { // multiple run logic... I hope

                    operationWindow += "7";

                    if ((!operationWindow.contains("+")) && (!operationWindow.contains("-")) &&
                            (!operationWindow.contains("*"))&&(!operationWindow.contains("/"))) {
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("1st 7");
                    } else {
                        operationWindowTwo += "7";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        System.out.println("2nd 7");
                    }
                    if ((toBeTotaled > 7) && (!operationWindow.contains("+")) && (!operationWindow.contains("-"))
                            && (!operationWindow.contains("*")) && (!operationWindow.contains("/"))) {
                        textView.setText(textView.getText() + "7");

                    } else {
                        textView.setText("7");
                    }

                } //multiple run logic


            }
        });


        // Eight
        Button eight = findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                if (runs > 0) {
                    if (operationWindow.contains("+")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("+", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with plus sign");
                        operationWindowTwo += "8";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("-")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("-", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with minus sign");
                        operationWindowTwo += "8";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("*")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("*", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with multiplication sign");
                        operationWindowTwo += "8";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("/")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("/", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with division sign");
                        operationWindowTwo += "8";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    }
                    if ((toBeTotaled > total)) {
                        textView.setText(textView.getText() + Integer.toString(total));

                    } else {
                        textView.setText(Integer.toString(total));
                    }
                } else { // multiple run logic... I hope

                    operationWindow += "8";

                    if ((!operationWindow.contains("+")) && (!operationWindow.contains("-")) &&
                            (!operationWindow.contains("*"))&&(!operationWindow.contains("/"))) {
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("1st 8");
                    } else {
                        operationWindowTwo += "8";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        System.out.println("2nd 8");
                    }
                    if ((toBeTotaled > 8) && (!operationWindow.contains("+")) && (!operationWindow.contains("-"))
                            && (!operationWindow.contains("*")) && (!operationWindow.contains("/"))) {
                        textView.setText(textView.getText() + "8");

                    } else {
                        textView.setText("8");
                    }

                } //multiple run logic


            }
        });

        // Nine
        Button nine = findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView = (TextView) findViewById(R.id.textView);
                if (runs > 0) {
                    if (operationWindow.contains("+")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("+", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with plus sign");
                        operationWindowTwo += "9";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("-")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("-", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with minus sign");
                        operationWindowTwo += "9";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("*")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("*", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with multiplication sign");
                        operationWindowTwo += "9";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    } else if (operationWindow.contains("/")) {
                        String save = operationWindow;
                        operationWindow = operationWindow.replace("/", "");
                        System.out.println(operationWindow);
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("Total with division sign");
                        operationWindowTwo += "9";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        operationWindow = save;
                    }
                    if ((toBeTotaled > total)) {
                        textView.setText(textView.getText() + Integer.toString(total));

                    } else {
                        textView.setText(Integer.toString(total));
                    }
                } else { // multiple run logic... I hope

                    operationWindow += "9";

                    if ((!operationWindow.contains("+")) && (!operationWindow.contains("-")) &&
                            (!operationWindow.contains("*"))&&(!operationWindow.contains("/"))) {
                        toBeTotaled = Integer.parseInt(operationWindow);
                        System.out.println("1st 9");
                    } else {
                        operationWindowTwo += "9";
                        sTBT = Integer.parseInt(operationWindowTwo);
                        System.out.println("2nd 9");
                    }
                    if ((toBeTotaled > 9) && (!operationWindow.contains("+")) && (!operationWindow.contains("-"))
                            && (!operationWindow.contains("*")) && (!operationWindow.contains("/"))) {
                        textView.setText(textView.getText() + "9");

                    } else {
                        textView.setText("9");
                    }

                } //multiple run logic


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

        // Subtract
        Button subtract = findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operationWindow.contains(subChar) == false) {
                    operationWindow += subChar;
                } // if
            }
        });

        // Multiplication
        Button multiply = findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operationWindow.contains(multiChar) == false) {
                    operationWindow += multiChar;
                } // if
            }
        });

        // divide
        Button divide = findViewById(R.id.dd);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operationWindow.contains(divChar) == false) {
                    operationWindow += divChar;
                } // if
            }
        });

        // Equate

        Button equate =  findViewById(R.id.equate);
        equate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (operationWindow.contains(addChar)) {
                    System.out.println(toBeTotaled + " this is tbt");
                    System.out.println(sTBT + " this is stbt");
                    total = toBeTotaled + sTBT;
                    textView.setText(Integer.toString(total));
                    operationWindow = Integer.toString(total);
                    operationWindowTwo = "";

                } else if (operationWindow.contains(subChar)) {
                    total = toBeTotaled - sTBT;
                    textView.setText(Integer.toString(total));
                    operationWindow = Integer.toString(total);
                    operationWindowTwo = "";
                } else if (operationWindow.contains(multiChar)) {
                    total = toBeTotaled * sTBT;
                    textView.setText(Integer.toString(total));
                    operationWindow = Integer.toString(total);
                    operationWindowTwo = "";
                } else if (operationWindow.contains(divChar)) {
                    total = toBeTotaled / sTBT;
                    textView.setText(Integer.toString(total));
                    operationWindow = Integer.toString(total);
                    operationWindowTwo = "";
                } // divide equate
            runs ++;
            }
        });

    }
}
