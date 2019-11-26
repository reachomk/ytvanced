package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: xqr */
public final class xqr extends xqu {
    public MotionEvent a;
    public xqt b;
    private final Handler e = new Handler(Looper.getMainLooper());
    private Runnable f;

    public xqr(ViewConfiguration viewConfiguration) {
        super(viewConfiguration);
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        xqt xqt = this.b;
        if (xqt == null || !xqt.c(motionEvent)) {
            return super.a(view, motionEvent);
        }
        if (!a(motionEvent)) {
            return false;
        }
        if (this.f == null) {
            this.f = new xqq(this);
        }
        if (this.a == null) {
            this.a = motionEvent;
            this.e.postDelayed(this.f, (long) ViewConfiguration.getDoubleTapTimeout());
        } else {
            a();
            this.b.b(motionEvent);
        }
        return true;
    }

    public final void a() {
        super.a();
        this.e.removeCallbacks(this.f);
        this.a = null;
    }
}
