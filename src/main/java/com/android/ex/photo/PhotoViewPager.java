package com.android.ex.photo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import defpackage.biv;
import defpackage.bps;

public class PhotoViewPager extends ViewPager {
    private int j;

    public PhotoViewPager(Context context) {
        super(context);
        d();
    }

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private final void d() {
        bps bps = new bps();
        biv biv = this.g;
        this.g = bps;
        setChildrenDrawingOrderEnabled(true);
        this.i = 2;
        this.h = 2;
        if (biv == null) {
            c();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int i = 1;
        if (action == 3 || action == 1) {
            this.j = -1;
        }
        if (action == 0) {
            motionEvent.getX();
            motionEvent.getRawX();
            motionEvent.getRawY();
            this.j = motionEvent.getPointerId(0);
        } else if (action == 6) {
            action = motionEvent.getActionIndex();
            if (motionEvent.getPointerId(action) == this.j) {
                if (action != 0) {
                    i = 0;
                }
                motionEvent.getX(i);
                this.j = motionEvent.getPointerId(i);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
