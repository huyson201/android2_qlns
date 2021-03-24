package tdc.edu.vn.quanlynhansu.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

import tdc.edu.vn.quanlynhansu.data_models.Person;

public class RecyclerViewAdapter extends  RecyclerView.Adapter {
    private Activity context;
    private int layoutId;
    private ArrayList<Person> persons;

    public RecyclerViewAdapter(Activity context, int layoutId, ArrayList<Person> persons) {
        this.context = context;
        this.layoutId = layoutId;
        this.persons = persons;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}
