package defpackage;

import android.view.KeyEvent;

/* renamed from: mxx */
final /* synthetic */ class mxx implements Runnable {
    private final mxn a;
    private final int b;
    private final KeyEvent c;

    mxx(mxn mxn, int i, KeyEvent keyEvent) {
        this.a = mxn;
        this.b = i;
        this.c = keyEvent;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.onKeyUp(this.b, this.c);
    }
}
