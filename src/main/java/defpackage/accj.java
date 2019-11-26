package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* renamed from: accj */
public final class accj implements acaj {
    private static final long c = TimeUnit.SECONDS.toNanos(1);
    public final achi a;
    public final Handler b = new Handler(Looper.getMainLooper());
    private final achm d;
    private final achr e;
    private final acib f = new acib(10);
    private final int g;
    private final int h;
    private final Handler i;
    private boolean j = true;

    accj(int i, int i2, int i3, achi achi, achm achm, achr achr, Handler handler) {
        this.g = i;
        this.h = i3;
        this.a = (achi) amqw.a((Object) achi);
        this.d = (achm) amqw.a((Object) achm);
        this.e = (achr) amqw.a((Object) achr);
        this.i = (Handler) amqw.a((Object) handler);
        boolean z = false;
        boolean z2 = i <= i2 && i2 <= i3;
        amqw.a(z2);
        if (i2 > 0) {
            z = true;
        }
        amqw.a(z);
        if (achi.h() != i2) {
            achi.a(i2);
        }
    }

    public final void a(int i) {
    }

    public final void a(acai acai) {
    }

    public final boolean a(boolean z) {
        this.j = z;
        return true;
    }

    public final void a(int i, acal acal) {
        this.i.post(new acci(this, i, acal));
    }

    public final long a() {
        return this.e.j();
    }
}
