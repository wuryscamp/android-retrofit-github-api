package com.wuriyanto.githubapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.wuriyanto.githubapp.R;
import com.wuriyanto.githubapp.model.GithubUser;

import java.util.List;

/**
 * Created by wurianto on 5/27/18.
 */

public class GithubAdapter extends ArrayAdapter<GithubUser> {

    private Context context;
    private List<GithubUser> data;


    public GithubAdapter(@NonNull Context context, int resource, @NonNull List<GithubUser> data) {
        super(context, resource, data);

        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        GithubUser gu = data.get(position);

        LayoutInflater inflater = LayoutInflater.from(getContext());

        convertView = inflater.inflate(R.layout.github_user, parent, false);

        TextView textViewName = (TextView) convertView.findViewById(R.id.txt_name);
        TextView textViewBio = (TextView) convertView.findViewById(R.id.txt_bio);
        ImageView imageViewUser = (ImageView) convertView.findViewById(R.id.author_image);

        Picasso.get().load(gu.getAvatarUrl()).into(imageViewUser);
        textViewName.setText(gu.getLogin());
        textViewBio.setText(gu.getHtmlUrl());

        return convertView;
    }
}
