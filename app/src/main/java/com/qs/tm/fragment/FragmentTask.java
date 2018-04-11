package com.qs.tm.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.qs.tm.R;
import com.qs.tm.adapter.TaskAdapter;
import com.qs.tm.model.Task;

import java.util.ArrayList;
import java.util.List;

public class FragmentTask extends Fragment {

    private List<Task> taskList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_task, container, false);
        ListView listView = view.findViewById(R.id.task_view);
        initTasks();
        TaskAdapter taskAdapter = new TaskAdapter(getActivity(), R.layout.task_item, taskList);
        listView.setAdapter(taskAdapter);

        return view;
    }

    private void initTasks() {
        for(int i=0; i<10; i++){
            Task task = new Task();
            task.setTaskId(i);
            task.setTaskName("任务名称"+i);
            taskList.add(task);
        }
    }


}
