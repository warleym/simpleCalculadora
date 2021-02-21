package br.com.progiv.simplecalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i = 0; //índice de números para operação
    int count = 0; //Qte de caracteres de números. Máximo 7
    int[] Result; //Array nos números digitados
    int Total = 0; //Resultado
    static int INVALID = 9999999; //variável estática para controle de qte de dígitos
    String operacao; //Operação a ser executada

    TextView RESULTSCREEN;
    Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btn00;
    Button btnSoma, btnSub, btnMult, btnDiv, btnIgual, btnLimp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}