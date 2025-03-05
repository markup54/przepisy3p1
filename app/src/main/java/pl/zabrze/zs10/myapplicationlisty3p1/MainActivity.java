package pl.zabrze.zs10.myapplicationlisty3p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<String> produkty;
    private ArrayAdapter<String> arrayAdapter;
    private Button buttonDodaj;
    private EditText editTextProdukt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        produkty = new ArrayList<>();
        produkty.add("mleko");
        produkty.add("banany");
        produkty.add("śledzie");
        listView = findViewById(R.id.listView);
        buttonDodaj = findViewById(R.id.button);
        editTextProdukt = findViewById(R.id.editTextProdukty);
        arrayAdapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                produkty
        );
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Toast.makeText(MainActivity.this,
                                "Kliknieto "+produkty.get(i),
                                Toast.LENGTH_SHORT).show();
                        produkty.remove(i);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );

        buttonDodaj.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String produkt = editTextProdukt.getText().toString();
                        produkty.add(produkt);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );
    }
}