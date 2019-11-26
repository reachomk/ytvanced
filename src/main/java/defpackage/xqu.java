package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: xqu */
public class xqu extends xqo {
    private final ViewConfiguration a;
    private boolean b;
    public xqx d;
    private float e;
    private float f;

    public xqu(ViewConfiguration viewConfiguration) {
        this.a = (ViewConfiguration) amqw.a((Object) viewConfiguration);
    }

    public void a() {
        this.b = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 3) {
            a();
        } else if (this.b && motionEvent.getActionMasked() == 1) {
            this.b = false;
            return true;
        } else if (motionEvent.getActionMasked() == 0) {
            this.b = true;
            this.e = motionEvent.getRawX();
            this.f = motionEvent.getRawY();
        } else if (this.b && motionEvent.getActionMasked() == 2) {
            float scaledTouchSlop = (float) this.a.getScaledTouchSlop();
            if (Math.abs(motionEvent.getRawX() - this.e) > scaledTouchSlop || Math.abs(motionEvent.getRawY() - this.f) > scaledTouchSlop) {
                this.b = false;
            }
        }
        return false;
    }

    public boolean a(View view, MotionEvent motionEvent) {
        boolean a = a(motionEvent);
        if (!a) {
            return a;
        }
        xqx xqx = this.d;
        if (xqx == null) {
            return a;
        }
        xqx.a(motionEvent);
        return true;
    }
}
