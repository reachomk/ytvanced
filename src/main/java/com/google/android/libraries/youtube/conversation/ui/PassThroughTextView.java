package com.google.android.libraries.youtube.conversation.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

public class PassThroughTextView extends YouTubeTextView {
    public boolean a;

    public PassThroughTextView(Context context) {
        this(context, null, 0);
    }

    public PassThroughTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PassThroughTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PassThroughTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.a ? super.onTouchEvent(motionEvent) : false;
    }
}
