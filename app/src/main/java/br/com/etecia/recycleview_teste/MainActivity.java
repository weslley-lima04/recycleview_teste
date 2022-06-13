
package br.com.etecia.recycleview_teste;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView listaLivros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaLivros = findViewById(R.id.recycler_view);

        //implementando o layout a ser usado
        listaLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));

        //otimiza a lista quando for chamada
        listaLivros.hasFixedSize();

        //carregar o adaptador para o recyclerview
       // listaLivros.setAdapter();

    }
}