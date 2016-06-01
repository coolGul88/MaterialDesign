package example.design.material.materialdesign.behavior;

import android.content.Context;
import android.support.design.widget.AppBarLayout.ScrollingViewBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Gulzar on 6/1/16.
 */

public class ParallaxBehavior extends ScrollingViewBehavior {

    public ParallaxBehavior(Context context, AttributeSet attributeSet){
        super();
    }

    @Override
    public boolean onNestedPreFling(final CoordinatorLayout coordinatorLayout, final View child, final View target, final float velocityX, final float velocityY) {
        return true;
    }

    @Override
    public boolean onNestedFling(final CoordinatorLayout coordinatorLayout, final View child, final View target, final float velocityX, final float velocityY, final boolean consumed) {
        return true;
    }

    @Override
    public void onNestedPreScroll(final CoordinatorLayout coordinatorLayout, final View child, final View target, final int dx, final int dy, final int[] consumed) {
        super.onNestedPreScroll(coordinatorLayout, child, target, dx, dy, consumed);
    }

    @Override
    public void onNestedScrollAccepted(final CoordinatorLayout coordinatorLayout, final View child, final View directTargetChild, final View target, final int nestedScrollAxes) {
        super.onNestedScrollAccepted(coordinatorLayout, child, directTargetChild, target, nestedScrollAxes);
    }

    @Override
    public boolean onDependentViewChanged(final CoordinatorLayout parent, final View child, final View dependency) {
        return super.onDependentViewChanged(parent, child, dependency);
    }

    @Override
    public boolean onInterceptTouchEvent(final CoordinatorLayout parent, final View child, final MotionEvent ev) {
        return super.onInterceptTouchEvent(parent, child, ev);
    }

    @Override
    public boolean onLayoutChild(final CoordinatorLayout parent, final View child, final int layoutDirection) {
        return super.onLayoutChild(parent, child, layoutDirection);
    }

    @Override
    public boolean onStartNestedScroll(final CoordinatorLayout coordinatorLayout, final View child, final View directTargetChild, final View target, final int nestedScrollAxes) {
        return super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, nestedScrollAxes);
    }

}
