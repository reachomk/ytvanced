package com.google.android.libraries.youtube.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;

public class TouchImageView extends ImageView {
    private boolean a = false;

    public TouchImageView(Context context) {
        super(context);
    }

    public TouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.a = true;
            setPressed(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setPressed(boolean z) {
        if (!z || this.a) {
            this.a = false;
            super.setPressed(z);
        }
    }
}
