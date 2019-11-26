package com.google.android.libraries.youtube.conversation.technodrome.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import defpackage.xss;
import defpackage.ywz;
import defpackage.yxa;
import defpackage.yxc;

public class ChatInlineFixedVideoView extends FrameLayout {
    private static final float f = ((float) Math.cos(Math.toRadians(45.0d)));
    public final PointF a = new PointF();
    public final View b;
    public final LayoutParams c;
    public yxa d;
    public boolean e;
    private final int g;
    private final int h;
    private final PointF i = new PointF();
    private final PointF j = new PointF();
    private final ywz k;
    private final LayoutParams l;

    public ChatInlineFixedVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = xss.a(context.getResources().getDisplayMetrics(), 88);
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        this.k = new ywz(this);
        this.l = new LayoutParams(-1, -2);
        this.c = new LayoutParams(-1, -1);
        this.b = new View(context);
        addView(this.b);
        setVisibility(8);
    }

    public static float a(float f, float f2, float f3) {
        return ((1.0f - f) * f2) + (f * f3);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.e && getVisibility() == 0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.i.x = motionEvent.getRawX();
                this.i.y = motionEvent.getRawY();
            } else if (actionMasked == 2) {
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
        if (getVisibility() != 0) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                this.a.x = motionEvent.getRawX();
                this.a.y = motionEvent.getRawY();
                b();
            } else if (actionMasked == 3) {
                this.k.a(this.a, this.i);
            }
        } else if (this.a.y - this.i.y > ((float) this.h)) {
            this.d.a();
            this.k.reverse();
        } else {
            this.k.a(this.a, this.i);
        }
        return true;
    }

    public final void a(yxc yxc) {
        setTranslationX(0.0f);
        setTranslationY(0.0f);
        this.l.width = yxc.c;
        this.l.height = yxc.e;
        this.b.setLayoutParams(this.l);
    }

    public final void a() {
        setVisibility(0);
    }

    public final void b() {
        setTranslationX(this.a.x - this.i.x);
        setTranslationY(this.a.y - this.i.y);
    }
}
