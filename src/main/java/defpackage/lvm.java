package defpackage;

import android.app.Activity;

/* renamed from: lvm */
public final class lvm extends ekk implements ejc {
    private final Activity a;
    private final eif b;
    private boolean c;

    public lvm(Activity activity, elm elm, eif eif) {
        super(elm);
        this.a = activity;
        this.b = eif;
    }

    public final void a(ejd ejd, ejd ejd2) {
        boolean a = ejd2.a();
        boolean z = false;
        Object obj = (this.c && ejd == ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED && ejd2 == ejd.WATCH_WHILE_MINIMIZED) ? 1 : null;
        if (a || obj != null) {
            xpr.a(this.a);
        }
        if (ejd == ejd.WATCH_WHILE_MAXIMIZED && ejd2 == ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED) {
            z = true;
        }
        this.c = z;
    }

    public final void A_() {
        this.b.a(this);
    }

    public final void ar_() {
        this.b.b(this);
    }
}
