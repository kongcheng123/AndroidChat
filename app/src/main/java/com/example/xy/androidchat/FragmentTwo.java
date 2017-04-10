package com.example.xy.androidchat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;



public class FragmentTwo extends Fragment {

    private List<Friend> friendList=new ArrayList<>();

    private void initFriend(){
        for(int i=0;i<8;i++){
            Friend xy=new Friend("xy",R.mipmap.ic_launcher);
            friendList.add(xy);

            Friend xy1=new Friend("xy1",R.mipmap.ic_launcher);
            friendList.add(xy1);
        }
    }

    public static FragmentTwo newInstance(String s){
        Bundle bundle = new Bundle();
        bundle.putString(Constants.KEY_ARGS,s);
        FragmentTwo fragment = new FragmentTwo();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.friend_layout,container,false);
        /*TextView mFragmentText = (TextView) view.findViewById(R.id.tv_fragment_text);
        Bundle bundle = getArguments();
        String args = bundle.getString(Constants.KEY_ARGS);
        mFragmentText.setText(args);*/

        RecyclerView recyclerView=(RecyclerView) view.findViewById(R.id.recycle_view);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        initFriend();
        recyclerView.setLayoutManager(linearLayoutManager);
        FriendAdapter adapter=new FriendAdapter(friendList);
        recyclerView.setAdapter(adapter);
        return view;
    }

}
