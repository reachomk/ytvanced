package defpackage;

import android.util.Log;

/* renamed from: bcnt */
final class bcnt implements Runnable {
    private final /* synthetic */ bclb a;
    private final /* synthetic */ bcjd b;
    private final /* synthetic */ bcno c;

    bcnt(bcno bcno, bclb bclb, bcjd bcjd) {
        this.c = bcno;
        this.a = bclb;
        this.b = bcjd;
    }

    public final void run() {
        try {
            bcno bcno = this.c;
            bcno.a.a(bcno.d, this.a, this.b);
        } catch (Exception e) {
            Log.e(bcmw.a, "Exception in onFailed method", e);
        }
    }
}
