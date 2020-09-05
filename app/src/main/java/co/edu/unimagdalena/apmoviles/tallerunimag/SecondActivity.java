package co.edu.unimagdalena.apmoviles.tallerunimag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1,n2;
    Button suma,resta,multi,div, mayor;
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
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multi.setOnClickListener(this);
        div.setOnClickListener(this);
        mayor.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int num1 = Integer.parseInt( n1.getText().toString());
        int num2 = Integer.parseInt( n2.getText().toString());
        float num3 = Integer.parseInt(n1.getText().toString());
        float num4 = Integer.parseInt(n2.getText().toString());
        switch (view.getId()){
            case R.id.btnsumar:

                Toast.makeText(this, "Suma = " + (num1 + num2),Toast.LENGTH_LONG).show();
                break;

            case R.id.btnrestar:
                Toast.makeText(this, "Resta = " + (num1 - num2),Toast.LENGTH_LONG).show();
                break;
            case R.id.btnmultiplicar:
                Toast.makeText(this,"Multiplicacion = " + (num1 * num2),Toast.LENGTH_LONG).show();
                break;
            case R.id.btnDividir:
                if(num4 == 0){
                    Toast.makeText(getApplicationContext(), "Datos invalidos", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"Divicion = " + (num3 / num4),Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btnmayor:
                if(num1 > num2){
                    Toast.makeText(this,"el Mayor es = "+ num1,Toast.LENGTH_LONG).show();
                }else if(num2 > num1){
                    Toast.makeText(this,"el Mayor es = "+ num2,Toast.LENGTH_LONG).show();
                }else if(num1 == num2 ){
                    Toast.makeText(this,"son Iguales ",Toast.LENGTH_LONG).show();
                }

        }
    }
}