package br.edu.ifsc.listasimples;
import java.math.BigDecimal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] frutas = new String[] { "MACA", "MORANGO","LARANJA","ABACATE","MELANCIA","CEREJA","UVA","BANANA","ACAI","AMEIXA","CACAU",
            "CAJU","COCO","CRANBERRY","FIGO","FRAMBOESA","JACA","KIWI","MARACUJA","JAMBO","MEXIRICA","MELAO","TORANJA","VERGAMOTA",
            "TAMARA","ROMA" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                frutas);
        listView.setAdapter(adapter);
    }
}
