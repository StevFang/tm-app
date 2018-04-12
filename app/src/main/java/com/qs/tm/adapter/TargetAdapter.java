package com.qs.tm.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.qs.tm.R;
import com.qs.tm.model.Target;

import java.util.List;

/**
 * Created by fbin on 2018/4/13.
 */

public class TargetAdapter extends ArrayAdapter {

    private int resourceId;

    public TargetAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view;
        ViewHolder viewHolder;
        Target target = (Target) getItem(position);
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.targetTip = view.findViewById(R.id.target_tip);
            viewHolder.targetStartDate = view.findViewById(R.id.target_startDate);
            viewHolder.targetEndDate = view.findViewById(R.id.target_endDate);
            viewHolder.targetContent = view.findViewById(R.id.target_content);
            viewHolder.targetCreator = view.findViewById(R.id.target_creator);
            viewHolder.targetCreateTime = view.findViewById(R.id.target_createTime);
            viewHolder.targetProgress = view.findViewById(R.id.target_progress);
            viewHolder.targetCountDown = view.findViewById(R.id.target_countDown);
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.targetTip.setText(target.getTargetTip());
        viewHolder.targetStartDate.setText(target.getTargetStartDate());
        viewHolder.targetEndDate.setText(target.getTargetEndDate());
        viewHolder.targetContent.setText("\u3000\u3000"+target.getTargetContent());
        viewHolder.targetCreator.setText(target.getTargetCreator());
        viewHolder.targetCreateTime.setText(target.getTargetCreateTime());
        viewHolder.targetProgress.setText(target.getTargetProgress());
        viewHolder.targetCountDown.setText(target.getTargetCountDown());

        return view;
    }

    class ViewHolder{
        TextView targetTip;
        TextView targetStartDate;
        TextView targetEndDate;
        TextView targetContent;
        TextView targetCreator;
        TextView targetCreateTime;
        TextView targetProgress;
        TextView targetCountDown;
    }

}
