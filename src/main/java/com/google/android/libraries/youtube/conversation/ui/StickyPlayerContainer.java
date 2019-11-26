package com.google.android.libraries.youtube.conversation.ui;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import defpackage.xss;
import defpackage.xwn;
import defpackage.zcf;
import defpackage.zcg;
import defpackage.zcm;

public class StickyPlayerContainer extends FrameLayout {
    private static final float f = ((float) Math.cos(Math.toRadians(45.0d)));
    public final PointF a;
    public final zcf b;
    public zcg c;
    public zcm d;
    public boolean e;
    private final int g;
    private final int h;
    private final PointF i;
    private final PointF j;

    public StickyPlayerContainer(Context context) {
        this(context, null);
    }

    public static float a(float f, float f2, float f3) {
        return ((1.0f - f) * f2) + (f * f3);
    }

    public StickyPlayerContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = context.obtainStyledAttributes(attributeSet, xwn.h).getDimensionPixelSize(xwn.i, xss.a(context.getResources().getDisplayMetrics(), 88));
        this.i = new PointF();
        this.a = new PointF();
        this.j = new PointF();
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.b = new zcf(this);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() > 0) {
            if (motionEvent.getAction() == 0) {
                this.i.x = motionEvent.getRawX();
                this.i.y = motionEvent.getRawY();
            } else if (motionEvent.getAction() == 2) {
                this.a.x = motionEvent.getRawX();
                this.a.y = motionEvent.getRawY();
                PointF pointF = this.i;
                PointF pointF2 = this.a;
                float f = pointF.x - pointF2.x;
                float f2 = pointF.y - pointF2.y;
                if (((float) Math.sqrt((double) ((f * f) + (f2 * f2)))) > ((float) this.g)) {
                    this.j.x = this.a.x - this.i.x;
                    this.j.y = this.a.y - this.i.y;
                    float length = this.j.length();
                    if (((double) length) != 0.0d) {
                        pointF = this.j;
                        pointF.x /= length;
                        pointF = this.j;
                        pointF.y /= length;
                    }
                    return this.j.y > f;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() == 0) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            this.a.x = motionEvent.getRawX();
            this.a.y = motionEvent.getRawY();
            a();
        } else if (motionEvent.getAction() == 1) {
            if (this.a.y - this.i.y > ((float) this.h)) {
                zcm zcm = this.d;
                if (zcm != null) {
                    zcm.b(true);
                }
            }
            this.b.a(this.a, this.i);
        } else if (motionEvent.getAction() == 3) {
            this.b.a(this.a, this.i);
        }
        return true;
    }

    public final void a() {
        setTranslationX(this.a.x - this.i.x);
        setTranslationY(this.a.y - this.i.y);
    }
}
