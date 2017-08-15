package unochapeco.edu.br.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtTeste = (EditText) findViewById(R.id.edtTeste);
                edtTeste.setText("VÁ A MERDA");
            }
        });
        Log.d("Create", "Criado");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Start", "Iniciado");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Stop", "Pausado");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Resume", "Em foco");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Pause", "Pausado");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("Restart", "Reiniciado");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Destroy", "Reiniciado");
    }



    
}