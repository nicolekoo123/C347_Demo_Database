package sg.edu.rp.c346.id19047433.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class TasksAdapter extends ArrayAdapter<Task>{

    private Context context;
    private ArrayList<Task> tasks;
    private TextView tvID, tvDesc, tvDate;

    public TasksAdapter(Context context, int resource, ArrayList<Task> objects) {
        super(context, resource, objects);
        tasks = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvID = (TextView) rowView.findViewById(R.id.tvID);
        tvDesc = (TextView) rowView.findViewById(R.id.tvDesc);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        Task currentTask = tasks.get(position);
        int itemNum = position + 1;
        tvID.setText("Item: " + currentTask.getId());
        tvDesc.setText("Desc: " + currentTask.getDescription());
        tvDate.setText("Date: " + currentTask.getDate());
        return rowView;
    }

}
