package com.google.android.libraries.youtube.conversation.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;

public class InviteUrlView extends YouTubeTextView {
    public InviteUrlView(Context context) {
        super(context);
    }

    public InviteUrlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InviteUrlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InviteUrlView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            return actionMasked == 1;
        } else {
            performClick();
            return true;
        }
    }
}
