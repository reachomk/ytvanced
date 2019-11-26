package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* renamed from: czr */
public final class czr extends RecyclerView implements czc {
    public czu T;
    private czx U;

    public czr(Context context) {
        super(context, null, 0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        czu czu = this.T;
        if (czu == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int a = czu.a();
        int i = a - 1;
        if (a == 0) {
            throw null;
        } else if (i == 0) {
            return true;
        } else {
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            String str = a != 1 ? a != 2 ? a != 3 ? "null" : "CALL_SUPER" : "IGNORE_TOUCH_EVENT" : "INTERCEPT_TOUCH_EVENT";
            StringBuilder stringBuilder = new StringBuilder(str.length() + 33);
            stringBuilder.append("Unknown TouchInterceptor.Result: ");
            stringBuilder.append(str);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        czx czx = this.U;
        if (czx != null) {
            czx.a();
        }
    }

    public final void a(czx czx) {
        this.U = czx;
    }
}
