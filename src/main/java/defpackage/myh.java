package defpackage;

import java.util.Map;

/* renamed from: myh */
final /* synthetic */ class myh implements Runnable {
    private final mxn a;
    private final Map b;

    myh(mxn mxn, Map map) {
        this.a = mxn;
        this.b = map;
    }

    public final void run() {
        mxn mxn = this.a;
        mxn.a.a(this.b);
    }
}
