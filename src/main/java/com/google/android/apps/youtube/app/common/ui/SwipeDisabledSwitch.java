package com.google.android.apps.youtube.app.common.ui;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class SwipeDisabledSwitch extends SwitchCompat {
    public SwipeDisabledSwitch(Context context) {
        super(context);
    }

    public SwipeDisabledSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwipeDisabledSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 2) {
            return isClickable();
        }
        return super.onTouchEvent(motionEvent);
    }
}
