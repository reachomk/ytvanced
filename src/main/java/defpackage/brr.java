package defpackage;

import java.util.concurrent.Callable;

/* renamed from: brr */
final class brr implements Callable {
    private final /* synthetic */ brs a;

    brr(brs brs) {
        this.a = brs;
    }

    public final /* synthetic */ Object call() {
        synchronized (this.a) {
            brs brs = this.a;
            if (brs.f != null) {
                brs.d();
                if (this.a.c()) {
                    this.a.b();
                    this.a.h = 0;
                }
            }
        }
        return null;
    }
}
