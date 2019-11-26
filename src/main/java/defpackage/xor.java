package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: xor */
public final class xor implements xpg {
    private final PointF a = new PointF();
    private final float b;
    private final View c;

    public xor(View view) {
        this.b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.c = (View) amqw.a((Object) view);
    }

    public final void a(MotionEvent motionEvent) {
        ViewParent parent = this.c.getParent();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.set(motionEvent.getX(), motionEvent.getY());
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (action != 2) {
            parent.requestDisallowInterceptTouchEvent(false);
        } else {
            float abs = Math.abs(motionEvent.getX() - this.a.x);
            float abs2 = Math.abs(motionEvent.getY() - this.a.y);
            if (((float) Math.sqrt((double) ((abs * abs) + (abs2 * abs2)))) >= this.b) {
                double atan2 = (double) ((float) Math.atan2((double) abs2, (double) abs));
                Double.isNaN(atan2);
                if (((float) (atan2 * 57.29577951308232d)) < 40.0f) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                } else {
                    parent.requestDisallowInterceptTouchEvent(false);
                    return;
                }
            }
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
