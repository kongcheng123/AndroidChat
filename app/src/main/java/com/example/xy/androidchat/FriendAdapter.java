package com.example.xy.androidchat;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by xy on 2017/4/6.
 */

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder> {
    private List<Friend> mfriendList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View friendView;
        ImageView friendImage;
        TextView friendName;

        public ViewHolder(View view){
            super(view);
            friendView=view;
            friendImage=(ImageView)view.findViewById(R.id.friend_image);
            friendName=(TextView) view.findViewById(R.id.friend_name);
        }
    }

    public FriendAdapter(List<Friend> friendList){
        mfriendList=friendList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.friend_item,parent,false);

        final ViewHolder viewHolder=new ViewHolder(view);
        viewHolder.friendView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position=viewHolder.getAdapterPosition();
                Friend friend=mfriendList.get(position);
                //Toast.makeText(v.getContext(),"view"+friend.getName(),Toast.LENGTH_SHORT).show();
                Activity activity=(Activity) v.getContext();
                Intent intent=new Intent(activity,ChatActivity.class);
                activity.startActivity(intent);
            }
        });
        /*viewHolder.friendImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position=viewHolder.getAdapterPosition();
                Friend friend=mfriendList.get(position);
                Toast.makeText(v.getContext(),"view"+friend.getName(),Toast.LENGTH_SHORT).show();
            }
        });*/
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
       Friend friend= mfriendList.get(position);
        holder.friendImage.setImageResource(friend.getImageId());
        holder.friendName.setText(friend.getName());
    }

    @Override
    public int getItemCount() {
        return mfriendList.size();
    }
}
