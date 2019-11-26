package defpackage;

import java.util.concurrent.Callable;

/* renamed from: zyy */
final class zyy implements Callable {
    private final /* synthetic */ zyz a;

    zyy(zyz zyz) {
        this.a = zyz;
    }

    public final /* synthetic */ Object call() {
        zyz zyz = this.a;
        zyz.d = zyz.f.a();
        try {
            boolean z = false;
            if (zyz.d != 0) {
                int a = zyz.b.a("failsafe_maxnumber_uncaught_exception", -1);
                if (a <= 0) {
                    zyz.d = 0;
                    zyz.f.b();
                } else if (zyz.d >= a) {
                    z = true;
                }
            }
            zyz.c.open();
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            zyz.c.open();
        }
    }
}
