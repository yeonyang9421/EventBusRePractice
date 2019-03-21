package kr.co.woobi.imyeon.eventbusrepractice;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    List<String> mItem=new ArrayList<>();

    public RecyclerAdapter(List<String> mItem) {
        this.mItem = mItem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);

        final ViewHolder viewHolder=new ViewHolder(view);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=mItem.get(viewHolder.getAdapterPosition());
                int color= Color.RED;
                switch (str){
                    case  "Red":
                        color=Color.RED;
                        break;
                    case  "Blue":
                        color=Color.BLUE;
                        break;
                    case  "Green":
                        color=Color.GREEN;
                        break;
                }
                EventBus.getDefault().post(new EventItem(color));
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String str = mItem.get(i);
        viewHolder.textItem.setText(str);

    }

    @Override
    public int getItemCount() {
        return mItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textItem = itemView.findViewById(R.id.text_item);
        }
    }
}
