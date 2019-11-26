package com.google.android.apps.youtube.app.playlist.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class OnAnimationEndRelativeLayout extends RelativeLayout {
    public Runnable a;

    public OnAnimationEndRelativeLayout(Context context) {
        super(context);
    }

    public OnAnimationEndRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnAnimationEndRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
