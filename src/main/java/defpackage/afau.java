package defpackage;

import java.util.Collections;

/* renamed from: afau */
public final class afau {
    public final oqg a;
    public final orc b;
    public final oqu c;
    public final long d;
    public final long e;

    afau(long j, int i, orc orc) {
        String str = orc.c.h;
        oqg oqg = null;
        if (!(str == null || oyu.c(str) || "application/ttml+xml".equals(str))) {
            ofm oiv;
            if ("application/x-rawcc".equals(str)) {
                oiv = new oiv(orc.c);
            } else if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm")) {
                oiv = new ogn(1);
            } else {
                oiv = new afbc(Collections.emptyList());
            }
            oqg = new oqg(oiv, i, orc.c);
        }
        this(j, orc, oqg, 0, orc.b());
    }

    public afau(long j, orc orc, oqg oqg, long j2, oqu oqu) {
        this.d = j;
        this.b = orc;
        this.e = j2;
        this.a = oqg;
        this.c = oqu;
    }

    public final long a() {
        return this.c.a() + this.e;
    }

    public final int b() {
        return this.c.b();
    }

    /* Access modifiers changed, original: final */
    public final long a(long j) {
        return this.c.b(j - this.e);
    }

    /* Access modifiers changed, original: final */
    public final long b(long j) {
        return a(j) + this.c.a(j - this.e, this.d);
    }

    public final long c(long j) {
        return this.c.a(j) + this.e;
    }

    public final oqz d(long j) {
        return this.c.c(j - this.e);
    }

    /* Access modifiers changed, original: final */
    public final long a(oqx oqx, long j) {
        if (b() != -1 || oqx.c == -9223372036854775807L) {
            return a();
        }
        long b = nyr.b(oqx.a);
        oqx.a();
        long b2 = nyr.b(0);
        return Math.max(a(), c(((j - b) - b2) - nyr.b(oqx.c)));
    }

    /* Access modifiers changed, original: final */
    public final long b(oqx oqx, long j) {
        long c;
        int b = b();
        if (b == -1) {
            long b2 = nyr.b(oqx.a);
            oqx.a();
            c = c((j - b2) - nyr.b(0));
        } else {
            c = a() + ((long) b);
        }
        return c - 1;
    }
}
