package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: jun */
public final class jun extends ffv {
    private final Handler c = new jum(this, Looper.getMainLooper());
    private final zzl d;

    public jun(zzl zzl) {
        this.d = zzl;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(fob fob, int i) {
        if (i == 2 && foh.e(this.d) > 0 && fob.g()) {
            a();
            this.c.sendEmptyMessageDelayed(23998, (long) foh.e(this.d));
            return false;
        }
        a();
        return true;
    }

    public final void a(fob fob) {
        a();
    }

    private final void a() {
        this.c.removeMessages(23998);
    }
}
