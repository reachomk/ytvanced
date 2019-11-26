package defpackage;

import android.os.Handler;

/* renamed from: ahnz */
final /* synthetic */ class ahnz implements Runnable {
    private final ahnq a;
    private final ahsj b;

    ahnz(ahnq ahnq, ahsj ahsj) {
        this.a = ahnq;
        this.b = ahsj;
    }

    public final void run() {
        ahnq ahnq = this.a;
        ahsj ahsj = this.b;
        Handler handler = ahnq.q;
        if (handler != null) {
            handler.obtainMessage(3).sendToTarget();
        }
        ahsp ahsp = ahnq.r;
        if (ahsp != null) {
            ahsp.a(ahsj);
        }
    }
}
