package com.qs.tm.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.qs.tm.R;
import com.qs.tm.model.Task;

import java.util.List;

/**
 * 任务列表适配器
 *
 * Created by fbin on 2018/4/11.
 */
public class TaskAdapter extends ArrayAdapter {

    private int resourceId;

    public TaskAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        ViewHolder viewHolder;
        Task task = (Task) getItem(position);
        if(convertView != null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.taskCheckbox = view.findViewById(R.id.task_checkbox);
            viewHolder.taskName = view.findViewById(R.id.task_name);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.taskCheckbox.setTag(task.getTaskId());
        viewHolder.taskName.setText(task.getTaskName());
        return view;
    }

    class ViewHolder{
        CheckBox taskCheckbox;
        TextView taskName;
    }
}
