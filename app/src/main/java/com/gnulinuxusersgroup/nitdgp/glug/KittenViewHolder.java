package com.gnulinuxusersgroup.nitdgp.glug;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by gravitydestroyer on 23/09/17.
 */

public class KittenViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView preview_text;

    public KittenViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.image);
        preview_text=(TextView) itemView.findViewById(R.id.preview_text);
    }
}
