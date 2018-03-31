package com.example.tyler.criminalintent;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by tyler on 3/31/2018.
 */

public class ListRow extends RecyclerView.ViewHolder {
    public ImageView mThumbnail;
    public ListRow(View view) {
        super(view);
        //TODO what?
        //mThumbnail = (ImageView) view.findViewById(R.id.thumbnail);
        mThumbnail=new ImageView(view.getContext());
    }
}
