package com.example.aula40;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lista);

        List<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno("Daniela Costa", 1, "Ativo", "1234567"));
        listaAlunos.add(new Aluno("Fulano de Tal", 2, "Inativo", "9876543"));
        listaAlunos.add(new Aluno("Beltrano da Silva", 3, "Ativo", "5678901"));
        listaAlunos.add(new Aluno("Ciclano Pereira", 4, "Inativo", "3456789"));
        listaAlunos.add(new Aluno("João da Silva", 5, "Ativo", "8765432"));

        ListaCustomizada adapter = new ListaCustomizada(this, R.layout.layout_lista, listaAlunos);
        listView.setAdapter(adapter);
    }
}
