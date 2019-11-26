package defpackage;

import java.util.HashSet;

/* renamed from: myu */
final /* synthetic */ class myu implements Runnable {
    private final myv a;

    myu(myv myv) {
        this.a = myv;
    }

    public final void run() {
        myv myv = this.a;
        for (ngm b : new HashSet(myv.a.keySet())) {
            myv.b(b, null);
        }
    }
}
