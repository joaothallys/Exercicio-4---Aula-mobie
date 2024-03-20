package com.example.aula40;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListaCustomizada extends ArrayAdapter<Aluno> {

    private Context context;
    private int resource;
    private List<Aluno> alunos;

    public ListaCustomizada(@NonNull Context context, int resource, @NonNull List<Aluno> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.alunos = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource, parent, false);
        }

        Aluno aluno = alunos.get(position);

        TextView textViewNome = convertView.findViewById(R.id.textViewNome);
        TextView textViewId = convertView.findViewById(R.id.textViewId);
        TextView textViewStatus = convertView.findViewById(R.id.textViewStatus);

        textViewNome.setText("Nome: " + aluno.getNome());
        textViewId.setText("Matrícula: " + aluno.getMatricula());
        textViewStatus.setText("Status: " + aluno.getStatus());


        return convertView;
    }
}
