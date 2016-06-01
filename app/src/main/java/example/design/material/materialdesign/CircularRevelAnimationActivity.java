package example.design.material.materialdesign;

import android.animation.Animator;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewAnimationUtils;
import android.widget.TextView;

public class CircularRevelAnimationActivity extends AppCompatActivity implements OnClickListener {

    @Override
    public void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_revel);

//        TextView  textView= (TextView) findViewById(R.id.linear_layout_circular);
//        textView.setVisibility(View.VISIBLE);
//        textView.setOnClickListener(this);
    }

    public void circularClicked(View view) {

        final TextView textView = (TextView) view;
        boolean isColored = (view.getBackground() != null) &&
                ((ColorDrawable) view.getBackground()).getColor() == Color.MAGENTA;
        float finalRadius = (float) Math.hypot(textView.getWidth()/2, textView.getHeight()/2);
        Animator animation = ViewAnimationUtils.createCircularReveal(textView, textView.getWidth() / 2,
                textView.getHeight() / 2, 0, finalRadius);
        if(isColored){
            textView.setText("White");
            textView.setBackgroundColor(Color.WHITE);
            animation.start();
        } else {
            textView.setText("Magenta");
            textView.setBackgroundColor(Color.MAGENTA);
            animation.start();
        }
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(final View v) {
        circularClicked(v);
    }
}
