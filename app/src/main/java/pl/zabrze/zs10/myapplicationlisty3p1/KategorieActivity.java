package pl.zabrze.zs10.myapplicationlisty3p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class KategorieActivity extends AppCompatActivity {
    ListView listView;
    public static final String KATEGORIA = "kategoria";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie);

        listView = findViewById(R.id.listViewKategorie);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String kategoria = listView.getItemAtPosition(i).toString();
                        Toast.makeText(KategorieActivity.this,
                                "kategoria: "+kategoria, Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(KategorieActivity.this,
                                PrzepisyListaActivity.class);
                        intent.putExtra(KATEGORIA,kategoria);
                        startActivity(intent);
                    }
                }
        );

    }
}