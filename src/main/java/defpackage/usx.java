package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: usx */
final class usx implements Runnable {
    private final /* synthetic */ WeakReference a;
    private final /* synthetic */ uta b;

    usx(WeakReference weakReference, uta uta) {
        this.a = weakReference;
        this.b = uta;
    }

    public final void run() {
        bqj bqj = (bqj) this.a.get();
        if (bqj != null) {
            bqj.a(this.b);
        }
    }
}
