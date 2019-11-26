package defpackage;

import android.util.Log;

/* renamed from: bcnr */
final class bcnr implements Runnable {
    private final /* synthetic */ bclb a;
    private final /* synthetic */ bcno b;

    bcnr(bcno bcno, bclb bclb) {
        this.b = bcno;
        this.a = bclb;
    }

    public final void run() {
        try {
            bcno bcno = this.b;
            bcno.a.c(bcno.d, this.a);
        } catch (Exception e) {
            Log.e(bcmw.a, "Exception in onCanceled method", e);
        }
    }
}
