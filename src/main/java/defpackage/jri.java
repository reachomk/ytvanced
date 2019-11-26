package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: jri */
public final class jri implements aps {
    public boolean a = false;
    private final View b;
    private final int c;
    private final jrh d;
    private boolean e;
    private int f;
    private float g;
    private float h;
    private boolean i = false;

    public jri(View view, int i, jrh jrh) {
        this.b = view;
        this.c = i;
        this.d = jrh;
    }

    public final void a(MotionEvent motionEvent) {
    }

    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!(this.a || this.i)) {
            int actionMasked = motionEvent.getActionMasked();
            int pointerId;
            float y;
            if (actionMasked == 0) {
                this.e = recyclerView.canScrollVertically(-1) ^ 1;
                pointerId = motionEvent.getPointerId(0);
                this.f = pointerId;
                pointerId = motionEvent.findPointerIndex(pointerId);
                if (pointerId >= 0) {
                    this.g = motionEvent.getY(pointerId);
                }
            } else if (actionMasked == 1) {
                actionMasked = motionEvent.findPointerIndex(this.f);
                if (actionMasked >= 0) {
                    y = this.g - motionEvent.getY(actionMasked);
                    this.h = y;
                    if (this.e && y < 0.0f) {
                        if (a() < ((float) this.c)) {
                            a(0);
                        } else {
                            this.i = true;
                            this.d.a();
                        }
                    }
                }
                return false;
            } else if (actionMasked != 2) {
                return false;
            } else {
                actionMasked = motionEvent.findPointerIndex(this.f);
                if (actionMasked >= 0) {
                    y = this.g - motionEvent.getY(actionMasked);
                    this.h = y;
                    if (this.e && y < 0.0f) {
                        pointerId = (int) Math.min(a(), (float) this.c);
                        a(pointerId);
                        this.g -= (float) pointerId;
                    }
                }
                return false;
            }
        }
        return false;
    }

    private final float a() {
        return Math.abs(this.h);
    }

    private final void a(int i) {
        LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams.height != i) {
            layoutParams.height = i;
            this.b.setLayoutParams(layoutParams);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.d.b();
        }
    }
}
