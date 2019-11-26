package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NonInterceptingRecyclerView extends RecyclerView {
    public NonInterceptingRecyclerView(Context context) {
        super(context);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public NonInterceptingRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
