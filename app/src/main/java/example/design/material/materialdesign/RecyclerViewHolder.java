package example.design.material.materialdesign;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Gulzar on 3/1/16.
 */
public class RecyclerViewHolder extends ViewHolder {
    public ImageView imageView;

    public RecyclerViewHolder(final View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.image);

    }
}
