package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;

/* renamed from: geq */
public final class geq implements OnTouchListener {
    public final ges a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final GestureDetector e;
    private final View f;
    private final Handler g = new Handler();
    private final Runnable h;
    private final Rect i = new Rect();

    public geq(Context context, ges ges, View view) {
        this.a = ges;
        this.e = new GestureDetector(context, new gev(this));
        this.e.setIsLongpressEnabled(true);
        this.f = view;
        this.h = new get(this, ges);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.e.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            if (this.b) {
                this.b = false;
                this.a.ae();
            } else {
                this.a.ac();
            }
            view.performClick();
            this.g.removeCallbacks(this.h);
        } else if ((this.b || this.c) && motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 1) {
            this.f.getGlobalVisibleRect(this.i);
            Rect rect = this.i;
            float max = Math.max(0.0f, (rect.exactCenterY() - motionEvent.getRawY()) - ((float) (rect.height() / 2)));
            if (max > 0.0f) {
                float top = (float) (this.f.getTop() - this.i.height());
                if (top >= 1.0f) {
                    this.a.a(max / top);
                }
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            this.a.ab();
            this.g.postDelayed(this.h, (long) ViewConfiguration.getLongPressTimeout());
        }
        return true;
    }
}
