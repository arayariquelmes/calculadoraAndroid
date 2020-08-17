package cl.inacap.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1Txt;
    private EditText n2Txt;
    private TextView resultadoTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.n1Txt = this.findViewById(R.id.n1Txt);
        this.n2Txt = this.findViewById(R.id.n2Txt);
        this.resultadoTxt = this.findViewById(R.id.resultadoTxt);
    }

    public void sumar(View view) {
        try {
            int n1 = Integer.parseInt(this.n1Txt.getText().toString());
            int n2 = Integer.parseInt(this.n2Txt.getText().toString());

            this.resultadoTxt.setText(String.valueOf(n1 + n2));
        }catch(NumberFormatException ex) {
            Toast.makeText(this, "Debe Ingresar Numeros", Toast.LENGTH_SHORT).show();
        }
    }
    public void multiplicar(View view) {
        try {
            int n1 = Integer.parseInt(this.n1Txt.getText().toString());
            int n2 = Integer.parseInt(this.n2Txt.getText().toString());

            this.resultadoTxt.setText(String.valueOf(n1 * n2));
        }catch(NumberFormatException ex) {
            Toast.makeText(this, "Debe Ingresar Numeros", Toast.LENGTH_SHORT).show();
        }
    }
    public void dividir(View view) {
        try {
            int n1 = Integer.parseInt(this.n1Txt.getText().toString());
            int n2 = Integer.parseInt(this.n2Txt.getText().toString());

            this.resultadoTxt.setText(String.valueOf(n1 / n2));
        }catch(NumberFormatException ex) {
            Toast.makeText(this, "Debe Ingresar Numeros", Toast.LENGTH_SHORT).show();
        }
    }
    public void restar(View view) {
        try {
            int n1 = Integer.parseInt(this.n1Txt.getText().toString());
            int n2 = Integer.parseInt(this.n2Txt.getText().toString());

            this.resultadoTxt.setText(String.valueOf(n1 - n2));
        }catch(NumberFormatException ex) {
            Toast.makeText(this, "Debe Ingresar Numeros", Toast.LENGTH_SHORT).show();
        }
    }
}