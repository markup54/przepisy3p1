package pl.zabrze.zs10.myapplicationlisty3p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PrzepisyListaActivity extends AppCompatActivity {
    private TextView textViewKategoria;
    private ListView listView;
    private String kategoria;
    private ArrayList<Przepis> listaZprzepisami;
    private ArrayAdapter<Przepis> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepisy_lista);
        kategoria = getIntent().getExtras().getString(KategorieActivity.KATEGORIA);
        textViewKategoria = findViewById(R.id.textViewKategoria);
        textViewKategoria.setText(kategoria);
        listaZprzepisami = Repozytorium.wszystkiePrzepisyZKategorii(kategoria);
        arrayAdapter = new ArrayAdapter<>(
                PrzepisyListaActivity.this,
                android.R.layout.simple_list_item_1,
                listaZprzepisami
        );
        listView = findViewById(R.id.listViewPrzepisy);
        listView.setAdapter(arrayAdapter);
    }
}