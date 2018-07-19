package io.github.burningdzire.understandingrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class GreenAdapter extends RecyclerView.Adapter<GreenAdapter.NumberViewHolder> {


    private int mNumberItems;

    public GreenAdapter(int numberOfItems) {
        mNumberItems = numberOfItems;
    }


    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.number_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }


    class NumberViewHolder extends RecyclerView.ViewHolder {

        TextView listItemNumberView;


        public NumberViewHolder(View itemView) {
            super(itemView);

            listItemNumberView = (TextView) itemView.findViewById(R.id.tv_item_number);
        }


        void bind(int listIndex) {
            listItemNumberView.setText(String.valueOf(listIndex));
        }
    }
}