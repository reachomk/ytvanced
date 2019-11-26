package com.google.android.apps.youtube.app.conversation.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;

public class SharedRecyclerView extends SnappyRecyclerView {
    public SharedRecyclerView(Context context) {
        super(context);
    }

    public SharedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SharedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.m.a() <= 1) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
