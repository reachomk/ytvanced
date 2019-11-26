package defpackage;

import android.util.Log;

/* renamed from: bcnu */
final class bcnu implements Runnable {
    private final /* synthetic */ bclb a;
    private final /* synthetic */ bcno b;

    bcnu(bcno bcno, bclb bclb) {
        this.b = bcno;
        this.a = bclb;
    }

    public final void run() {
        try {
            bcno bcno = this.b;
            bcno.a.b(bcno.d, this.a);
        } catch (Exception e) {
            Log.e(bcmw.a, "Exception in onSucceeded method", e);
        }
    }
}
