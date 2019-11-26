package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: agqw */
public final class agqw {
    private static final long f = TimeUnit.HOURS.toMillis(12);
    private static final long g = TimeUnit.DAYS.toMillis(30);
    public final String a;
    public final avqc b;
    public final long c;
    public final long d;
    public final xsc e;

    public agqw(String str, avqc avqc, long j, long j2, xsc xsc) {
        this.a = (String) amqw.a((Object) str);
        this.b = (avqc) amqw.a((Object) avqc);
        this.c = j;
        this.d = j2;
        this.e = xsc;
    }

    public final Object a() {
        avqc avqc = this.b;
        if ((avqc.a & 32) == 0) {
            return null;
        }
        avqa avqa = avqc.g;
        if (avqa == null) {
            avqa = avqa.c;
        }
        Object obj;
        if (avqa.a != 53345347) {
            avqa = this.b.g;
            if (avqa == null) {
                avqa = avqa.c;
            }
            if (avqa.a != 64099105) {
                return null;
            }
            avqa = this.b.g;
            if (avqa == null) {
                avqa = avqa.c;
            }
            if (avqa.a == 64099105) {
                obj = (aqhy) avqa.b;
            } else {
                obj = aqhy.q;
            }
            return obj;
        }
        avqa = this.b.g;
        if (avqa == null) {
            avqa = avqa.c;
        }
        if (avqa.a == 53345347) {
            obj = (aqwx) avqa.b;
        } else {
            obj = aqwx.g;
        }
        return obj;
    }

    public final boolean b() {
        int a = avqe.a(this.b.e);
        if (a == 0 || a != 3) {
            a = avqe.a(this.b.e);
            if (a == 0 || a != 4) {
                a = avqe.a(this.b.e);
                if (!(a == 0 || a == 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        long a = this.e.a();
        long j = this.d - f;
        if (f() <= this.e.a() || a < j) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (!c() || f() + g > this.e.a()) {
            return false;
        }
        return true;
    }

    public final String e() {
        avqc avqc = this.b;
        if ((avqc.a & 1) == 0) {
            return null;
        }
        return avqc.b;
    }

    public final long f() {
        return this.d + (((long) this.b.d) * 1000);
    }

    public final long g() {
        return (long) this.b.d;
    }

    public final agqv h() {
        agqv agqv = new agqv();
        agqv.a = this.a;
        agqv.b = this.b;
        agqv.c = this.c;
        agqv.d = this.d;
        agqv.e = this.e;
        return agqv;
    }
}
