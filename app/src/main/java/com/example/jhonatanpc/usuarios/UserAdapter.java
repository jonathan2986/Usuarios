package com.example.jhonatanpc.usuarios;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context context, List<User> items){
        super(context, 0,items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        User user = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_item, parent, false);

        }
        TextView textName= convertView.findViewById(R.id.textName);
        TextView textAdress= convertView.findViewById(R.id.textAdress);

        textName.setText(user.getName());
        textAdress.setText(user.getAddress());
        return convertView;
    }
}
