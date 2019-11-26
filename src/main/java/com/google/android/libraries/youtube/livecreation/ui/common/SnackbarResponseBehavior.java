package com.google.android.libraries.youtube.livecreation.ui.common;

import android.content.Context;
import android.support.design.behavior.SwipeDismissBehavior;
import android.support.design.snackbar.Snackbar.SnackbarLayout;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SnackbarResponseBehavior extends SwipeDismissBehavior {
    public SnackbarResponseBehavior(Context context, AttributeSet attributeSet) {
    }

    public final boolean b(View view) {
        return false;
    }

    public final boolean a_(View view) {
        return view instanceof SnackbarLayout;
    }

    public final boolean a(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (!(view2 instanceof SnackbarLayout) || view.getVisibility() != 0) {
            return false;
        }
        view.setTranslationY(Math.min(0.0f, view2.getTranslationY() - ((float) view2.getHeight())));
        return true;
    }
}
