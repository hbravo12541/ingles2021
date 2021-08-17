package com.simulador.ingles;
//ESTE ARCHIVO HACE FUNCIONAR LA ACTIVIDAD DE ORDENAR PALABRAS

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class order_words extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    List<String> wordsToOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_words);
        
        //LAS PALABRAS VAN DENTRO DEL ARREGLO wordsToOrder
        wordsToOrder = new ArrayList<>();
        wordsToOrder.add("First");
        wordsToOrder.add("Second");
        wordsToOrder.add("third");
        wordsToOrder.add("fourth");
        wordsToOrder.add("fifth ");
        wordsToOrder.add("sixth");
        wordsToOrder.add("seventh");
        wordsToOrder.add("eighth");
        wordsToOrder.add("ninth");
        wordsToOrder.add("tenth");
        Collections.shuffle(wordsToOrder);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerAdapter = new RecyclerAdapter(wordsToOrder);
        recyclerView.setAdapter(recyclerAdapter);

        DividerItemDecoration divederItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(divederItemDecoration);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }

    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(ItemTouchHelper.UP |
            ItemTouchHelper.DOWN | ItemTouchHelper.START | ItemTouchHelper.END, 0) {
        @Override
        //AQUI SE HACE POSIBLE QUE SE MUEVAN DE LUGAR LAS PALABRAS
        //DE ARRIB A A ABAJO O VICEVERSA
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            int fromPosition = viewHolder.getAdapterPosition();
            int toPosition = target.getAdapterPosition();
            Collections.swap(wordsToOrder, fromPosition, toPosition);
            recyclerView.getAdapter().notifyItemMoved(fromPosition, toPosition);
            return false;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {}
    };
}