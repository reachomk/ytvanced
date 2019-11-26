package com.google.android.libraries.youtube.share.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.xor;

public class ConnectionSectionRecyclerView extends RecyclerView {
    private xor T = new xor(this);

    public ConnectionSectionRecyclerView(Context context) {
        super(context);
    }

    public ConnectionSectionRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (canScrollHorizontally(1) || canScrollHorizontally(-1)) {
            this.T.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
