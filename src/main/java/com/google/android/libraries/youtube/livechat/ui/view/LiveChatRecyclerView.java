package com.google.android.libraries.youtube.livechat.ui.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import defpackage.abxk;
import defpackage.ans;
import defpackage.apn;

public class LiveChatRecyclerView extends RecyclerView {
    private final abxk T = new abxk();
    private float U;
    private float V;

    public LiveChatRecyclerView(Context context) {
        super(context);
        a(this.T);
        a(null);
    }

    public LiveChatRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(this.T);
        a(null);
    }

    public LiveChatRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(this.T);
        a(null);
    }

    public final void a(apn apn) {
        super.a(apn);
        if (apn instanceof ans) {
            ((ans) apn).aB_();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.U = motionEvent.getX();
            this.V = motionEvent.getY();
        } else if (actionMasked == 1) {
            float x = motionEvent.getX();
            float f = this.U - x;
            x = this.V - motionEvent.getY();
            float scaledTouchSlop = (float) ViewConfiguration.get(getContext()).getScaledTouchSlop();
            if ((f * f) + (x * x) < scaledTouchSlop * scaledTouchSlop) {
                performClick();
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
