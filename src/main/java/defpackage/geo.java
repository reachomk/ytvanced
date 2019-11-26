package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: geo */
public final class geo implements OnTouchListener {
    public final ger a;
    public boolean b;
    public boolean c;
    private final View d;
    private final Rect e = new Rect();

    geo(ger ger, View view) {
        this.a = ger;
        this.d = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.b && !this.c) {
                this.a.ag();
            }
            this.b = false;
            view.performClick();
        } else if ((this.b || this.c) && motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 1) {
            this.d.getGlobalVisibleRect(this.e);
            Rect rect = this.e;
            float max = Math.max(0.0f, (rect.exactCenterY() - motionEvent.getRawY()) - ((float) (rect.height() / 2)));
            if (max > 0.0f) {
                float top = (float) (this.d.getTop() - this.e.height());
                if (top >= 1.0f) {
                    this.a.b(max / top);
                }
            }
            return true;
        } else if (motionEvent.getAction() == 0 && !this.c) {
            this.b = true;
            this.a.af();
        }
        return true;
    }
}
