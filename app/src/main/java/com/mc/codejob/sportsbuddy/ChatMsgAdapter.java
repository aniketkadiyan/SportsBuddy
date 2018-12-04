package com.mc.codejob.sportsbuddy;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


import java.util.ArrayList;
import java.util.List;


public class ChatMsgAdapter extends RecyclerView.Adapter<ChatMsgViewHolder> {

    private List<ChatMsg> msgDtoList = null;

    public ChatMsgAdapter(List<ChatMsg> msgDtoList) {
        this.msgDtoList = msgDtoList;
    }

    @Override
    public void onBindViewHolder(ChatMsgViewHolder holder, int position) {
        ChatMsg msgDto = this.msgDtoList.get(position);
        if(msgDto.MSG_TYPE_RECEIVED.equals(msgDto.getMsgType()))
        {
            holder.leftMsgLayout.setVisibility(LinearLayout.VISIBLE);
            holder.leftMsgTextView.setText(msgDto.getMsgContent());

            holder.rightMsgLayout.setVisibility(LinearLayout.GONE);
        }
        else if(msgDto.MSG_TYPE_SENT.equals(msgDto.getMsgType()))
        {
            holder.rightMsgLayout.setVisibility(LinearLayout.VISIBLE);
            holder.rightMsgTextView.setText(msgDto.getMsgContent());
            holder.leftMsgLayout.setVisibility(LinearLayout.GONE);
        }
    }

    @Override
    public ChatMsgViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.chat_item_view_activity, parent, false);
        return new ChatMsgViewHolder(view);
    }

    @Override
    public int getItemCount() {
        if(msgDtoList==null)
        {
            msgDtoList = new ArrayList<ChatMsg>();
        }
        return msgDtoList.size();
    }
}