package com.google.android.apps.youtube.app.ui.actionbar;

import android.content.Context;
import android.support.design.appbar.AppBarLayout;
import android.support.design.appbar.AppBarLayout.ScrollingViewBehavior;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class MainScrollingViewBehavior extends ScrollingViewBehavior {
    public boolean d;
    public boolean e;

    public MainScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a_(View view) {
        return (this.d || this.e) ? false : view instanceof AppBarLayout;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return !this.d ? super.a(coordinatorLayout, view, view2) : false;
    }
}
