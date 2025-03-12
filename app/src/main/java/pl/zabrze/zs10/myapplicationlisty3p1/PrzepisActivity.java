package pl.zabrze.zs10.myapplicationlisty3p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class PrzepisActivity extends AppCompatActivity {
    private TextView textView;
    private  TextView textViewSkladniki;
    private TextView textViewCzas;
    private TextView textViewOsoby;
    private RatingBar ratingBar;
    private Button button;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        textView = findViewById(R.id.textView2);
        textViewSkladniki = findViewById(R.id.textView3);
        textViewCzas = findViewById(R.id.textView4);
        textViewOsoby = findViewById(R.id.textView5);
        button = findViewById(R.id.button2);
        ratingBar = findViewById(R.id.ratingBar);


        String nazwaPrzepisu = getIntent().getExtras().getString(PrzepisyListaActivity.PRZEPIS);
        textView.setText(nazwaPrzepisu);
    }
}