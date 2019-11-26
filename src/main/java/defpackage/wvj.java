package defpackage;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

/* renamed from: wvj */
final class wvj implements OnFocusChangeListener, OnTouchListener, OnEditorActionListener {
    private final /* synthetic */ wvh a;

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.b();
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        wvh wvh = this.a;
        Object obj = (view == wvh.e || view == wvh.g) ? 1 : null;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 && obj != null) {
                view.performClick();
                return true;
            }
        } else if (obj == null) {
            this.a.c();
        } else {
            this.a.b();
            return true;
        }
        return false;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6 || i == 5) {
            this.a.c();
        }
        return false;
    }

    /* synthetic */ wvj(wvh wvh) {
        this.a = wvh;
    }
}
