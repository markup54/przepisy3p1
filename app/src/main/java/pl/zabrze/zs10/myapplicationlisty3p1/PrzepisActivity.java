package pl.zabrze.zs10.myapplicationlisty3p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PrzepisActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        textView = findViewById(R.id.textView2);
        String nazwaPrzepisu = getIntent().getExtras().getString(PrzepisyListaActivity.PRZEPIS);
        textView.setText(nazwaPrzepisu);
    }
}