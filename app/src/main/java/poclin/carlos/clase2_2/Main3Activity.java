package poclin.carlos.clase2_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private TextView mTvTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mTvTexto = (TextView) findViewById(R.id.tv_texto);

        String textoRecibido = getIntent().getStringExtra("param1");

        mTvTexto.setText(textoRecibido);

    }

    public void onBack(View view){

        finish();

    }
}
