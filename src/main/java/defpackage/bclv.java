package defpackage;

import java.util.Date;

/* renamed from: bclv */
public final class bclv extends bckq {
    private final long a;
    private final long b;
    private final boolean c;
    private final Long d;
    private final Long e;
    private final Long f;
    private final Long g;

    private static Date a(long j) {
        return j != -1 ? new Date(j) : null;
    }

    public bclv(long j, long j2, long j3, long j4, boolean z, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.f = Long.valueOf(j5);
        this.g = Long.valueOf(j6);
        if (j == -1 || j3 == -1) {
            this.d = null;
        } else {
            this.d = Long.valueOf(j3 - j);
        }
        if (j == -1 || j4 == -1) {
            this.e = null;
        } else {
            this.e = Long.valueOf(j4 - j);
        }
    }

    public final Date a() {
        return bclv.a(this.a);
    }

    public final Date b() {
        return bclv.a(this.b);
    }

    public final boolean c() {
        return this.c;
    }

    public final Long d() {
        return this.d;
    }

    public final Long e() {
        return this.e;
    }

    public final Long f() {
        return this.f;
    }

    public final Long g() {
        return this.g;
    }
}
