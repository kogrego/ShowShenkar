package il.ac.shenkar.showshenkar.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import il.ac.shenkar.showshenkar.R;
import il.ac.shenkar.showshenkar.activities.ProjectActivity;
import il.ac.shenkar.showshenkar.model.DepProject;

public class DepProjectsRecyclerAdapter extends RecyclerView.Adapter<DepProjectsRecyclerAdapter.CustomViewHolder> {
    private List<DepProject> depProjectList;
    private Context mContext;

    public DepProjectsRecyclerAdapter(Context context, List<DepProject> depProjectList) {
        this.depProjectList = depProjectList;
        this.mContext = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dep_project_row, null);

        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        DepProject depProject = depProjectList.get(i);

        customViewHolder.txtProjectName.setText(depProject.getName());
        customViewHolder.txtProjectStudent.setText(depProject.getStudent());
    }

    @Override
    public int getItemCount() {
        return (null != depProjectList ? depProjectList.size() : 0);
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        protected TextView txtProjectName;
        protected TextView txtProjectStudent;

        public CustomViewHolder(View view) {
            super(view);
            this.txtProjectName = (TextView) view.findViewById(R.id.project_name);
            this.txtProjectStudent = (TextView) view.findViewById(R.id.project_student);
            txtProjectName.setOnClickListener(this);
            txtProjectStudent.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            //Create intent
            Intent intent = new Intent(mContext, ProjectActivity.class);
            intent.putExtra("project", txtProjectName.getText().toString());
            intent.putExtra("student", txtProjectStudent.getText().toString());

            //Start details activity
            mContext.startActivity(intent);
        }
    }
}