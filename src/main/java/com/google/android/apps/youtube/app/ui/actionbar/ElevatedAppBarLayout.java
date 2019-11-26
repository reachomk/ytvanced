package com.google.android.apps.youtube.app.ui.actionbar;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.design.appbar.AppBarLayout;
import android.util.AttributeSet;
import com.google.android.youtube.R;

public class ElevatedAppBarLayout extends AppBarLayout {
    private float e;

    public ElevatedAppBarLayout(Context context) {
        super(context);
    }

    public ElevatedAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = (float) getResources().getDimensionPixelSize(R.dimen.appbar_layout_elevation);
    }

    public final void setElevation(float f) {
        super.setElevation(this.e);
    }

    public final void b(boolean z) {
        if (VERSION.SDK_INT >= 21) {
            super.setElevation(!z ? this.e : 0.0f);
        }
    }
}
