package co.edu.unimagdalena.apmoviles.tallerunimag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1,n2;
    Button suma,resta,multi,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        n1 = findViewById(R.id.edtn1);
        n2 = findViewById(R.id.edtn2);
        suma = findViewById(R.id.btnsumar);
        resta = findViewById(R.id.btnrestar);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int num1 = Integer.parseInt( n1.getText().toString());
        int num2 = Integer.parseInt( n2.getText().toString());
        switch (view.getId()){
            case R.id.btnsumar:

                Toast.makeText(this, "Suma = " + (num1 + num2),Toast.LENGTH_LONG).show();
                break;

            case R.id.btnrestar:
                Toast.makeText(this, "Resta = " + (num1 - num2),Toast.LENGTH_LONG).show();
                break;
        }
    }
}