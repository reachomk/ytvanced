package defpackage;

import android.os.Looper;

/* renamed from: ptb */
public final class ptb {
    public Looper a;
    private pun b;

    public final ptb a(pun pun) {
        pzr.a((Object) pun, (Object) "StatusExceptionMapper must not be null.");
        this.b = pun;
        return this;
    }

    public final ptc a() {
        if (this.b == null) {
            this.b = new ptr();
        }
        if (this.a == null) {
            this.a = Looper.getMainLooper();
        }
        return new ptc(this.b, this.a);
    }
}
