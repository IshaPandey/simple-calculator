package com.darsantech.layout;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    TextView result;
    Button add, subtract, multiply, divide,alert_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_demo);
        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);

        result = (TextView) findViewById(R.id.result);

        add = (Button) findViewById(R.id.buttonadd);
        subtract = (Button) findViewById(R.id.buttonsubtract);
        multiply = (Button) findViewById(R.id.buttonmultiply);
        divide = (Button) findViewById(R.id.buttondivide);
        alert_btn=(Button)findViewById(R.id.onebtnalert);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double N1 = Double.parseDouble(n1.getText().toString());
                double N2 = Double.parseDouble(n2.getText().toString());

                double res = N1 + N2;
                result.setText(String.valueOf(res));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double N1 = Double.parseDouble(n1.getText().toString());
                double N2 = Double.parseDouble(n2.getText().toString());

                double res = N1 - N2;
                result.setText(String.valueOf(res));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double N1 = Double.parseDouble(n1.getText().toString());
                double N2 = Double.parseDouble(n2.getText().toString());

                double res = N1 * N2;
                result.setText(String.valueOf(res));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double N1 = Double.parseDouble(n1.getText().toString());
                double N2 = Double.parseDouble(n2.getText().toString());

                double res = N1 / N2;
                result.setText(String.valueOf(res));
            }

        });
        alert_btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        final AlertDialog alert=new AlertDialog.Builder(MainActivity.this).create();
        //Setting title
        alert.setTitle("Alert");
        //Setting Message
        alert.setMessage("Welcome");
        // Setting icon
        alert.setIcon(R.drawable.tick);
        //Setting OK
          Toast.makeText(getApplicationContext(),"You Clicked OK button",Toast.LENGTH_LONG).show();
                alert.show();
            }

            });
    }
    @Override
    public void onBackPressed(){
        backButtonHandler();
        return;
    }

    private void backButtonHandler() {
        AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Alert");
        alert.setMessage("Do You want to close?");
        alert.setIcon(R.drawable.tick);
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                            }
        });
        alert.show();
    }
}
