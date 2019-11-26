package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: xoj */
public class xoj {
    private final int a;
    private final int b;
    public final int c;
    public float d;
    public float e;
    public float f;
    public int g;
    private VelocityTracker h;
    private float i;

    public xoj(Context context) {
        this(context, 200);
    }

    public xoj(Context context, int i) {
        this.g = -1;
        amqw.a(true, (Object) "snapVelocity cannot be less than 200");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.c = viewConfiguration.getScaledPagingTouchSlop();
        this.a = viewConfiguration.getScaledMaximumFlingVelocity();
        this.b = i;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.h == null) {
            this.h = VelocityTracker.obtain();
        }
        this.h.addMovement(motionEvent);
    }

    public final void b(MotionEvent motionEvent) {
        this.e = motionEvent.getX();
        float y = motionEvent.getY();
        this.f = y;
        this.d = this.e;
        this.i = y;
        this.g = motionEvent.getPointerId(0);
    }

    public final int c(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(this.g);
        if (findPointerIndex < 0) {
            return 0;
        }
        float x = motionEvent.getX(findPointerIndex);
        float f = this.e;
        this.e = x;
        return (int) (f - x);
    }

    public final int d(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(this.g);
        if (findPointerIndex < 0) {
            return 0;
        }
        float y = motionEvent.getY(findPointerIndex);
        float f = this.f;
        this.f = y;
        return (int) (f - y);
    }

    public final boolean a(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(this.g);
        if (!xty.a(findPointerIndex, 0, motionEvent.getPointerCount())) {
            a();
        } else if (b(motionEvent, i) != 0) {
            this.e = motionEvent.getX(findPointerIndex);
            this.f = motionEvent.getY(findPointerIndex);
            return true;
        }
        return false;
    }

    public final int b(MotionEvent motionEvent, int i) {
        int i2 = 3;
        Object obj = (i == 1 || i == 3) ? 1 : null;
        Object obj2 = (i == 2 || i == 3) ? 1 : null;
        int findPointerIndex = motionEvent.findPointerIndex(this.g);
        if (xty.a(findPointerIndex, 0, motionEvent.getPointerCount())) {
            float x = motionEvent.getX(findPointerIndex);
            float y = motionEvent.getY(findPointerIndex);
            int round = obj2 != null ? Math.round(x - this.e) : 0;
            int round2 = obj != null ? Math.round(y - this.f) : 0;
            findPointerIndex = Math.abs(round);
            int abs = Math.abs(round2);
            if (i == 2 || (i == 3 && findPointerIndex > abs)) {
                round2 = Math.abs(round);
                if (round < 0) {
                    i2 = 1;
                }
                i = round2;
                round2 = i2;
            } else if (obj != null) {
                i = Math.abs(round2);
                round2 = round2 < 0 ? 2 : 4;
            } else {
                round2 = 0;
                i = 0;
            }
            if (i > this.c) {
                return round2;
            }
        }
        return 0;
    }

    public final int c(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(this.g);
        if (findPointerIndex >= 0) {
            int x;
            float xVelocity;
            this.h.computeCurrentVelocity(1000, (float) this.a);
            if (i != 1) {
                x = (int) (this.d - motionEvent.getX(findPointerIndex));
                xVelocity = this.h.getXVelocity(this.g);
            } else {
                x = (int) (this.i - motionEvent.getY(findPointerIndex));
                xVelocity = this.h.getYVelocity(this.g);
            }
            i = (int) xVelocity;
            VelocityTracker velocityTracker = this.h;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.h = null;
            }
            if (Math.abs(x) > 20 && Math.abs(i) > this.b) {
                if (i <= 0) {
                    return 2;
                }
                return 1;
            }
        }
        return 0;
    }

    public final void e(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() >> 8) & 255;
        if (motionEvent.getPointerId(action) == this.g) {
            action = action == 0 ? 1 : 0;
            this.e = motionEvent.getX(action);
            float y = motionEvent.getY(action);
            this.f = y;
            this.d = this.e;
            this.i = y;
            this.g = motionEvent.getPointerId(action);
            VelocityTracker velocityTracker = this.h;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void a() {
        this.g = -1;
    }
}
