package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: bvx */
final class bvx {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new bwa());

    bvx() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(bvw bvw) {
        if (this.a) {
            this.b.obtainMessage(1, bvw).sendToTarget();
            return;
        }
        this.a = true;
        bvw.d();
        this.a = false;
    }
}
