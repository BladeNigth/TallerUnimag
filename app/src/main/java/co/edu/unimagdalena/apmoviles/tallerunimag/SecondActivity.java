package co.edu.unimagdalena.apmoviles.tallerunimag;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1,n2;
    Button suma,resta,multi,div, mayor,mcm,mcd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        n1 = findViewById(R.id.edtn1);
        n2 = findViewById(R.id.edtn2);
        suma = findViewById(R.id.btnsumar);
        resta = findViewById(R.id.btnrestar);
        multi = findViewById(R.id.btnmultiplicar);
        div  = findViewById(R.id.btnDividir);
        mayor = findViewById(R.id.btnmayor);
        mcm = findViewById(R.id.btnmcm);
        mcd = findViewById(R.id.btnmcd);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multi.setOnClickListener(this);
        div.setOnClickListener(this);
        mayor.setOnClickListener(this);
        mcm.setOnClickListener(this);
        mcd.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.m1:
                Toast.makeText(this,"Menu 1", Toast.LENGTH_LONG).show();
                break;

            case R.id.m2:
                Toast.makeText(this,"Menu 2", Toast.LENGTH_LONG).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        if(TextUtils.isEmpty(n1.getText().toString()) ||
                TextUtils.isEmpty(n2.getText().toString())){
            Toast.makeText(getApplicationContext(), "Datos invalidos", Toast.LENGTH_LONG).show();
        }else {


            int num1 = Integer.parseInt(n1.getText().toString());
            int num2 = Integer.parseInt(n2.getText().toString());
            float num3 = Integer.parseInt(n1.getText().toString());
            float num4 = Integer.parseInt(n2.getText().toString());
            switch (view.getId()) {
                case R.id.btnsumar:

                    Toast.makeText(this, "Suma: " + (num1 + num2), Toast.LENGTH_LONG).show();
                    break;

                case R.id.btnrestar:
                    Toast.makeText(this, "Resta: " + (num1 - num2), Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnmultiplicar:
                    Toast.makeText(this, "Multiplicacion: " + (num1 * num2), Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnDividir:
                    if (num4 == 0) {
                        Toast.makeText(getApplicationContext(), "Datos invalidos", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(this, "Division: " + (num3 / num4), Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.btnmayor:
                    if (num1 > num2) {
                        Toast.makeText(this, "el Mayor es: " + num1, Toast.LENGTH_LONG).show();
                    } else if (num2 > num1) {
                        Toast.makeText(this, "el Mayor es: " + num2, Toast.LENGTH_LONG).show();
                    } else if (num1 == num2) {
                        Toast.makeText(this, "son Iguales ", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.btnmcm:
                    int mcm = 1;
                    int i = 2;
                    while (i <= num1 || i <= num2) {
                        if (num1 % i == 0 || num2 % i == 0) {
                            mcm = mcm * i;
                            if (num1 % i == 0) num1 = num1 / i;
                            if (num2 % i == 0) num2 = num2 / i;
                        } else
                            i = i + 1;
                    }
                    Toast.makeText(this, " MCM es:  " + mcm, Toast.LENGTH_LONG).show();
                    break;
                case R.id.btnmcd:
                    int mcd = 0;
                    int a = Math.max(num1, num2);
                    int b = Math.min(num1, num2);
                    do {
                        mcd = b;
                        b = a % b;
                        a = mcd;
                    } while (b != 0);
                    Toast.makeText(this, "MCD es: " + mcd, Toast.LENGTH_LONG).show();
                    break;

            }
        }
    }
}