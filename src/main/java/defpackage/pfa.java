package defpackage;

import android.os.Looper;

/* renamed from: pfa */
final class pfa implements Runnable {
    private final /* synthetic */ pex a;

    pfa(pex pex) {
        this.a = pex;
    }

    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.a.b().a(this);
            return;
        }
        boolean b = this.a.b();
        pex pex = this.a;
        pex.c = 0;
        if (b) {
            pex.a();
        }
    }
}
