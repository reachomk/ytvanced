package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: zgp */
public final class zgp extends GestureDetector {
    public MotionEvent a;
    private final zir b;
    private final Handler c = new Handler();
    private final Runnable d;
    private final int e;
    private float f;
    private float g;

    public zgp(Context context, zir zir) {
        super(context, zir);
        setIsLongpressEnabled(false);
        this.b = zir;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        scaledTouchSlop += scaledTouchSlop;
        this.e = scaledTouchSlop * scaledTouchSlop;
        this.d = new zgo(this, zir);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            MotionEvent motionEvent2 = this.a;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.a = MotionEvent.obtain(motionEvent);
            this.f = this.a.getX();
            this.g = this.a.getY();
            this.c.removeCallbacks(this.d);
            this.b.a = false;
            this.c.postDelayed(this.d, (long) ViewConfiguration.getLongPressTimeout());
        } else if (action == 1) {
            this.c.removeCallbacks(this.d);
            this.b.a = false;
        } else if (action == 2) {
            int i = (int) (x - this.f);
            int i2 = (int) (y - this.g);
            if ((i * i) + (i2 * i2) > this.e) {
                this.c.removeCallbacks(this.d);
            }
        }
        return onTouchEvent;
    }
}
