package com.google.android.libraries.youtube.conversation.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View.OnLongClickListener;
import android.widget.LinearLayout;
import defpackage.zbz;

public class LongClickLinearLayout extends LinearLayout {
    public OnLongClickListener a;
    public boolean b;
    public boolean c;
    private boolean d;

    public LongClickLinearLayout(Context context) {
        super(context);
    }

    public LongClickLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.b = false;
            this.c = false;
        } else if (motionEvent.getActionMasked() == 2) {
            this.c = true;
        }
        if (this.c) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (this.d) {
            onTouchEvent(motionEvent);
        }
        return this.b || onInterceptTouchEvent;
    }

    public final void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.a = onLongClickListener;
        if (onLongClickListener != null) {
            a(true);
        } else {
            a(false);
        }
    }

    private final void a(boolean z) {
        this.d = z;
        if (z) {
            super.setOnLongClickListener(new zbz(this));
        } else {
            super.setOnLongClickListener(null);
        }
    }
}
