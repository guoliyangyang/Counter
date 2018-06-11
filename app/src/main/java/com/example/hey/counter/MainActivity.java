package com.example.hey.counter;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    double num = 0;
    double result = 0;
    int operator = -1;
    boolean first_num = true;
    boolean operator_turn = false;

    private View.OnClickListener mylistener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button_0:
                    click_num(0);
                    break;
                case R.id.button_1:
                    click_num(1);
                    break;
                case R.id.button_2:
                    click_num(2);
                    break;
                case R.id.button_3:
                    click_num(3);
                    break;
                case R.id.button_4:
                    click_num(4);
                    break;
                case R.id.button_5:
                    click_num(5);
                    break;
                case R.id.button_6:
                    click_num(6);
                    break;
                case R.id.button_7:
                    click_num(7);
                    break;
                case R.id.button_8:
                    click_num(8);
                    break;
                case R.id.button_9:
                    click_num(9);
                    break;
                case R.id.button_AC:
                    text1.setText("0");
                    num = 0;
                    result = 0;
                    first_num = true;
                    operator_turn = false;
                    operator = -1;
                    break;
                case R.id.button_ADD:
                    click_oprator(5);
                    break;
                case R.id.button_BACK:
                    System.exit(0);
                    break;
                case R.id.button_DECIMAL:
                    double mark = 0;

                    if(text1.getText() != null && text1.getText().length() > 0) {
                        if(text1.getText().toString().contains(".")) break;
                        mark = Double.parseDouble(text1.getText().toString() + "");
                    }

                    if(mark == 0) {
                        text1.setText("0.");
                    }
                    else {
                        text1.append(".");
                    }
                    break;
                case R.id.button_DIVIDE:
                    click_oprator(2);
                    break;
                case R.id.button_EQU:
                    click_oprator(6);
                    break;
                case R.id.button_MUL:
                    click_oprator(3);
                    break;
                case R.id.button_SQUARE:
                    click_oprator(1);
                    break;
                case R.id.button_SUBTRACTION:
                    click_oprator(4);
                    break;
                default:
                    Toast.makeText(MainActivity.this, "SOMETHING WRONG!", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };

    TextView text1; // (TextView) findViewById(R.id.text1);
    Button button0; // (Button) findViewById(R.id.button_0);
    Button button1; // (Button) findViewById(R.id.button_1);
    Button button2; // (Button) findViewById(R.id.button_2);
    Button button3; // (Button) findViewById(R.id.button_3);
    Button button4; // (Button) findViewById(R.id.button_4);
    Button button5; // (Button) findViewById(R.id.button_5);
    Button button6; // (Button) findViewById(R.id.button_6);
    Button button7; // (Button) findViewById(R.id.button_7);
    Button button8; // (Button) findViewById(R.id.button_8);
    Button button9; // (Button) findViewById(R.id.button_9);
    Button buttonac; // (Button) findViewById(R.id.button_AC);
    Button buttonadd; // (Button) findViewById(R.id.button_ADD);
    Button buttonbc; // (Button) findViewById(R.id.button_BACK);
    Button buttondecimal; // (Button) findViewById(R.id.button_DECIMAL);
    Button buttonmul; // (Button) findViewById(R.id.button_MUL);
    Button buttonequ; // (Button) findViewById(R.id.button_EQU);
    Button buttondiv; // (Button) findViewById(R.id.button_DIVIDE);
    Button buttonsqu; // (Button) findViewById(R.id.button_SQUARE);
    Button buttonsub; // (Button) findViewById(R.id.button_SUBTRACTION);
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.text);
        button0 = (Button) findViewById(R.id.button_0);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
        button3 = (Button) findViewById(R.id.button_3);
        button4 = (Button) findViewById(R.id.button_4);
        button5 = (Button) findViewById(R.id.button_5);
        button6 = (Button) findViewById(R.id.button_6);
        button7 = (Button) findViewById(R.id.button_7);
        button8 = (Button) findViewById(R.id.button_8);
        button9 = (Button) findViewById(R.id.button_9);
        buttonac = (Button) findViewById(R.id.button_AC);
        buttonadd = (Button) findViewById(R.id.button_ADD);
        buttonbc = (Button) findViewById(R.id.button_BACK);
        buttondecimal = (Button) findViewById(R.id.button_DECIMAL);
        buttonmul = (Button) findViewById(R.id.button_MUL);
        buttonequ = (Button) findViewById(R.id.button_EQU);
        buttondiv = (Button) findViewById(R.id.button_DIVIDE);
        buttonsqu = (Button) findViewById(R.id.button_SQUARE);
        buttonsub = (Button) findViewById(R.id.button_SUBTRACTION);

        button0.setOnClickListener(mylistener);
        button1.setOnClickListener(mylistener);
        button2.setOnClickListener(mylistener);
        button3.setOnClickListener(mylistener);
        button4.setOnClickListener(mylistener);
        button5.setOnClickListener(mylistener);
        button6.setOnClickListener(mylistener);
        button7.setOnClickListener(mylistener);
        button8.setOnClickListener(mylistener);
        button9.setOnClickListener(mylistener);
        buttonac.setOnClickListener(mylistener);
        buttonadd.setOnClickListener(mylistener);
        buttonbc.setOnClickListener(mylistener);
        buttondecimal.setOnClickListener(mylistener);
        buttonmul.setOnClickListener(mylistener);
        buttonequ.setOnClickListener(mylistener);
        buttondiv.setOnClickListener(mylistener);
        buttonsqu.setOnClickListener(mylistener);
        buttonsub.setOnClickListener(mylistener);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void click_num(int n) {
        double mark = 0;

        if(text1.getText() != null && text1.getText().length() > 0 && !text1.getText().toString().equals("-")) {
            mark = Double.parseDouble(text1.getText().toString());

        }

        if(operator_turn) {
            text1.setText("");
            operator_turn = false;
        }

        switch (n) {

            case 0:
                if (mark == 0 && text1.length() == 1 && !text1.getText().toString().equals("-")) {
                } else {
                    text1.append("0");
                }
                break;
            case 1:
                if (mark == 0 && text1.length() == 1 && !text1.getText().toString().equals("-")) {
                    text1.setText("1");
                } else {
                    text1.append("1");
                }
                break;
            case 2:
                if (mark == 0 && text1.length() == 1 && !text1.getText().toString().equals("-")) {
                    text1.setText("2");
                } else {
                    text1.append("2");
                }
                break;
            case 3:
                if (mark == 0 && text1.length() == 1 && !text1.getText().toString().equals("-")) {
                    text1.setText("3");
                } else {
                    text1.append("3");
                }
                break;
            case 4:
                if (mark == 0 && text1.length() == 1 && !text1.getText().toString().equals("-")) {
                    text1.setText("4");
                } else {
                    text1.append("4");
                }
                break;
            case 5:
                if (mark == 0 && text1.length() == 1 && !text1.getText().toString().equals("-")) {
                    text1.setText("5");
                } else {
                    text1.append("5");
                }
                break;
            case 6:
                if (mark == 0 && text1.length() == 1 && !text1.getText().toString().equals("-")) {
                    text1.setText("6");
                } else {
                    text1.append("6");
                }
                break;
            case 7:
                if (mark == 0 && text1.length() == 1 && !text1.getText().toString().equals("-")) {
                    text1.setText("7");
                } else {
                    text1.append("7");
                }
                break;
            case 8:
                if (mark == 0 && text1.length() == 1 && !text1.getText().toString().equals("-")) {
                    text1.setText("8");
                } else {
                    text1.append("8");
                }
                break;
            case 9:
                if (mark == 0 && text1.length() == 1 && !text1.getText().toString().equals("-")) {
                    text1.setText("9");
                } else {
                    text1.append("9");
                }
                break;
            default:
                Toast.makeText(MainActivity.this, "SOMETHING WRONG!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void click_oprator(int n) {
        double mark = 0;
        if(text1.getText() != null && text1.getText().length() > 0 && !text1.getText().toString().equals("-")) {
            mark = Double.parseDouble(text1.getText().toString());
        }
//        if(!sign1) {
//            mark = -mark;
//            sign1 = true;
//        }
        switch (n) {
            case 1:
                operator_turn = true;
                operator = 1;
                if (mark >= 0) {
                    result = Math.sqrt(mark);
                    text1.setText("" + result);
                } else {
                    text1.setText("0");
                    Toast.makeText(MainActivity.this, "NUMBER INVALID!", Toast.LENGTH_SHORT).show();
                }
                break;
            case 2:
                operator_turn = true;

                if (first_num) {
                    result = mark;
                    first_num = false;
                } else {
                    if(operator == -1 || operator == 6 || operator == 1) {
                        result = mark;
                    }
                    else {
                        switch (operator) {
                            case 2: result /= mark; break;
                            case 3: result *= mark; break;
                            case 4: result -= mark; break;
                            case 5: result += mark; break;
                        }
                        text1.setText("" + result);
                    }
                }
                operator = 2;
                break;
            case 3:
                operator_turn = true;
                if (first_num) {
                    result = mark;
                    first_num = false;
                } else {
                    if(operator == -1 || operator == 6 || operator == 1) {
                        result = mark;
                    }
                    else {
                        switch (operator) {
                            case 2: result /= mark; break;
                            case 3: result *= mark; break;
                            case 4: result -= mark; break;
                            case 5: result += mark; break;
                        }
                        text1.setText("" + result);
                    }
                }
                operator = 3;
                break;
            case 4:
                if (first_num) {
                    result = mark;
                    if(mark == 0) {
                        text1.setText("-");
                    }
                    else {
                        first_num = false;
                        operator_turn = true;
                    }
                } else {
                    if(operator == -1 || operator == 6 || operator == 1) {
                        result = mark;
                    }
                    else {
                        switch (operator) {
                            case 2: result /= mark; break;
                            case 3: result *= mark; break;
                            case 4: result -= mark; break;
                            case 5: result += mark; break;
                        }
                        text1.setText("" + result);
                    }
                    operator_turn = true;
                }
                operator = 4;
                break;
            case 5:
                operator_turn = true;
                if (first_num) {
                    result = mark;
                    first_num = false;
                } else {
                    if(operator == -1 || operator == 6 || operator == 1) {
                        result = mark;
                    }
                    else {
                        switch (operator) {
                            case 2: result /= mark; break;
                            case 3: result *= mark; break;
                            case 4: result -= mark; break;
                            case 5: result += mark; break;
                        }
                        text1.setText("" + result);
                    }
                }
                operator = 5;
                break;
            case 6:
                operator_turn = true;
                switch(operator) {
                    case 1: break;
                    case 2: result /= mark; break;
                    case 3: result *= mark; break;
                    case 4: result -= mark; break;
                    case 5: result += mark; break;
                    case 6: break;
                    case -1: break;
                    default: Toast.makeText(MainActivity.this, "WRONG!", Toast.LENGTH_SHORT).show();
                }
                text1.setText("" + result);
                operator = 6;
                break;
            default:
                Toast.makeText(MainActivity.this, "SOMETHING WRONG!", Toast.LENGTH_SHORT);
                break;
        }
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
