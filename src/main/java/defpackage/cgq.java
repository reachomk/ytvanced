package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: cgq */
public final class cgq extends cgs {
    private static final Handler b = new Handler(Looper.getMainLooper(), new cgp());
    public final brl a;

    public cgq(brl brl, int i, int i2) {
        super(i, i2);
        this.a = brl;
    }

    public final void a(Object obj, chb chb) {
        b.obtainMessage(1, this).sendToTarget();
    }
}
