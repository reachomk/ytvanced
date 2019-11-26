package defpackage;

import java.util.List;

/* renamed from: myd */
final /* synthetic */ class myd implements Runnable {
    private final mxn a;
    private final List b;

    myd(mxn mxn, List list) {
        this.a = mxn;
        this.b = list;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.b.a(this.b);
    }
}
