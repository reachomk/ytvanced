package com.google.android.apps.youtube.app.common.rendering;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.apn;
import defpackage.env;
import defpackage.xpg;

public class SnappyRecyclerView extends RecyclerView {
    public xpg T;

    public SnappyRecyclerView(Context context) {
        super(context);
    }

    public SnappyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SnappyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        if (VERSION.SDK_INT >= 26 && (getContext() instanceof Activity)) {
            Activity activity = (Activity) getContext();
            if (!(activity.getWindow() == null || activity.getWindow().getDecorView() == null)) {
                activity.getWindow().getDecorView().requestLayout();
            }
        }
        super.onAttachedToWindow();
    }

    public final boolean b(int i, int i2) {
        apn apn = this.n;
        if (!(apn instanceof env)) {
            return super.b(i, i2);
        }
        e(((env) apn).a(i, i2));
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xpg xpg = this.T;
        if (xpg != null) {
            xpg.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        apn apn = this.n;
        if ((apn instanceof env) && ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.E == 0)) {
            e(((env) apn).a());
        }
        return onTouchEvent;
    }
}
