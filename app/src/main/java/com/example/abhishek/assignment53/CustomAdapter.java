package com.example.abhishek.assignment53;

/**
 * Created by Abhishek on 27-01-2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{
    String [] result;
    String [] result1;
    Context context;
    private static LayoutInflater inflater=null;
    public CustomAdapter(MainActivity mainActivity, String[] nameList, String[] contactList) {
        // TODO Auto-generated constructor stub
        result=nameList;
        context=mainActivity;
        result1=contactList;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView nameView;
        TextView contView;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.program_list, null);
        holder.nameView=(TextView) rowView.findViewById(R.id.textView1);
        holder.contView=(TextView) rowView.findViewById(R.id.textView2);
        holder.nameView.setText(result[position]);
        holder.contView.setText(result1[position]);
        return rowView;
    }

}