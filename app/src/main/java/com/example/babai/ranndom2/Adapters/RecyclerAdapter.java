package com.example.babai.ranndom2.Adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.example.babai.ranndom2.Models.Note;
import com.example.babai.ranndom2.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<MainViewHolder> {



    ArrayList<Note> notes;
    ColorGenerator generator = ColorGenerator.MATERIAL;

    public RecyclerAdapter(ArrayList<Note> notes) {
        this.notes = notes;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MainViewHolder mainViewHolder, int i) {
        mainViewHolder.title.setText(notes.get(i).gettitle());
        TextDrawable drawable = TextDrawable.builder().buildRound(String.valueOf(notes.get(i).gettitle().charAt(0)).toUpperCase(), generator.getRandomColor());
        mainViewHolder.imageView.setImageDrawable(drawable);
        mainViewHolder.dateview.setText(notes.get(i).getDate());

    }

    @Override
    public int getItemCount() {
        return notes.size();
    }


}