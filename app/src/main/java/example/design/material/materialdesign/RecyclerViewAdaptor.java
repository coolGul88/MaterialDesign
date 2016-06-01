package example.design.material.materialdesign;

import java.util.List;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import example.design.material.materialdesign.models.ModelItem;


public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerViewHolder> {
    private final List<ModelItem> modelItems;
    private final Context context;

    public RecyclerViewAdaptor(List<ModelItem> items, Context context) {
        modelItems = items;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(final ViewGroup viewGroup, final int i) {
        final View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view_recyler_view, viewGroup, false);
      //  view.setAlpha(0.6f);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {
        ModelItem item = modelItems.get(position);
     /*   holder.itemView.animate()
                .translationYBy(5)
                .translationZBy(5)
                .setDuration(1000)
                .alpha(1)
                .scaleX(1)
                .start();*/
        if (item != null) {
            Glide.with(context)
                    .load(R.drawable.homer)
                    .fitCenter()
                    .error(R.drawable.abc_dialog_material_background_dark)
                    .into(holder.imageView);

        }


    }

    @Override
    public int getItemCount() {
        return modelItems.size();
    }

}


