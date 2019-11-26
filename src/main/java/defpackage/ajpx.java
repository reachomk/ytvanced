package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ajpx */
public final class ajpx implements ajni {
    public aakj a;
    public float b = 1.0f;
    public long c;
    public long d = -1;
    public long e = 0;
    public long f;
    public long g;
    public int h = 4;
    public ahjc i;
    private final xsc j;

    public ajpx(xsc xsc) {
        this.j = xsc;
    }

    public final void a(aakj aakj) {
        this.a = aakj;
        if (aakj != null) {
            this.f = TimeUnit.SECONDS.toMillis((long) aakj.h());
        }
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.d;
    }

    public final long c() {
        return this.e;
    }

    public final long d() {
        return this.f;
    }

    public final long e() {
        return this.g;
    }

    public final long f() {
        return this.j.b();
    }
}
