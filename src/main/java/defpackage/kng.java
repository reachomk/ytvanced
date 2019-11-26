package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: kng */
final class kng implements OnTouchListener {
    public final View a;
    public final gak b;
    public boolean c;
    private final azem d;
    private final knj e;

    kng(azem azem, View view, gak gak) {
        this.d = azem;
        this.a = view;
        this.e = new knj(this, azem);
        this.b = gak;
    }

    private final void a() {
        this.a.removeCallbacks(this.e);
        this.c = false;
        this.a.setPressed(false);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                if (!this.c) {
                    view.performClick();
                }
                this.b.c();
                a();
                return true;
            } else if (action == 3) {
                this.b.c();
                a();
            }
        } else if (this.d != null) {
            view.postDelayed(this.e, 500);
        }
        return false;
    }
}
