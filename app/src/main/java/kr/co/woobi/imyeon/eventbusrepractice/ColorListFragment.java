package kr.co.woobi.imyeon.eventbusrepractice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ColorListFragment extends Fragment {
    private List<String> mList=new ArrayList<>();
    private RecyclerView mRecyclerView;
    private RecyclerAdapter mAdapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecyclerView=view.findViewById(R.id.recycler);
        mAdapter=new RecyclerAdapter(mList);
        mRecyclerView.setAdapter(mAdapter);
    }

    public ColorListFragment() {
        mList.add("Red");
        mList.add("Blue");
        mList.add("Green");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.color_list_fragment,container, false);
        return view;
    }
}
