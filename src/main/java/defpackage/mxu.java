package defpackage;

import android.view.KeyEvent;

/* renamed from: mxu */
final /* synthetic */ class mxu implements Runnable {
    private final mxn a;
    private final int b;
    private final KeyEvent c;

    mxu(mxn mxn, int i, KeyEvent keyEvent) {
        this.a = mxn;
        this.b = i;
        this.c = keyEvent;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.onKeyDown(this.b, this.c);
    }
}
