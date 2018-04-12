package com.qs.tm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.qs.tm.R;
import com.qs.tm.adapter.TargetAdapter;
import com.qs.tm.model.Target;

import java.util.ArrayList;
import java.util.List;


public class FragmentIndex extends Fragment {

    private List<Target> targetList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_index, container, false);
        ListView listView = view.findViewById(R.id.target_view);
        initTargets();
        TargetAdapter targetAdapter = new TargetAdapter(getActivity(), R.layout.target_item, targetList);
        listView.setAdapter(targetAdapter);

        return view;
    }

    private void initTargets(){
        for(int i=0; i<20; i++){
            Target target = new Target();
            target.setTargetTip("车");
            target.setTargetStartDate("2018-01-01");
            target.setTargetEndDate("2018-12-31");
            target.setTargetContent("我要拿下世界500强");
            target.setTargetCreator("小米");
            target.setTargetCreateTime("2017-12-31");
            target.setTargetProgress("25%");
            target.setTargetCountDown("265天");
            targetList.add(target);
        }
    }
}
