package poclin.carlos.clase2_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText mEttexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mEttexto = (EditText) findViewById(R.id.et_texto);



    }

    public void onNext(View view){

        String texto = mEttexto.getText().toString();

        Intent intent = new Intent(this, Main3Activity.class);
        intent.putExtra("param1",texto);

        startActivity(intent);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mEttexto.setText("");
    }
}
