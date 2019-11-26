package defpackage;

import android.os.Handler;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

/* renamed from: ygd */
final class ygd extends LinkMovementMethod implements Runnable {
    private final int a = ViewConfiguration.getLongPressTimeout();
    private final Handler b = new Handler();
    private boolean c;

    private ygd() {
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = false;
            this.b.postDelayed(this, (long) this.a);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.b.removeCallbacks(this);
            if (this.c && motionEvent.getActionMasked() == 1) {
                return false;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }

    public final void run() {
        this.c = true;
    }

    /* synthetic */ ygd(byte b) {
    }
}
