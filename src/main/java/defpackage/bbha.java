package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbha */
final class bbha implements basb {
    public static final bary f = bary.a("internal-retry-policy");
    public static final bary g = bary.a("internal-hedging-policy");
    public final AtomicReference a = new AtomicReference();
    public final boolean b = false;
    public final int c;
    public final int d;
    public volatile boolean e;

    bbha(boolean z, int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public final barz a(bauw bauw, barv barv, barx barx) {
        if (this.b) {
            if (this.e) {
                bbgr a = a(bauw);
                bbcf b = b(bauw);
                boolean z = true;
                if (!(a.equals(bbgr.f) || b.equals(bbcf.d))) {
                    z = false;
                }
                amrw.a(z, "Can not apply both retry and hedging policy for the method '%s'", (Object) bauw);
                barv = barv.a(f, new bbhe(a)).a(g, new bbhb(b));
            } else {
                barv = barv.a(f, new bbhc(this, bauw)).a(g, new bbgz(this, bauw));
            }
        }
        bbeh c = c(bauw);
        if (c == null) {
            return barx.a(bauw, barv);
        }
        barv barv2;
        Integer num;
        Long l = c.a;
        if (l != null) {
            long longValue = l.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            basx basx = basy.a;
            if (timeUnit != null) {
                basy basy = new basy(basx, timeUnit.toNanos(longValue));
                basy basy2 = barv.b;
                if (basy2 == null || basy.compareTo(basy2) < 0) {
                    barv2 = new barv(barv);
                    barv2.b = basy;
                    barv = barv2;
                }
            } else {
                throw new NullPointerException("units");
            }
        }
        Boolean bool = c.b;
        if (bool == null) {
            barv2 = barv;
        } else if (bool.booleanValue()) {
            barv2 = new barv(barv);
            barv2.h = Boolean.TRUE;
        } else {
            barv2 = new barv(barv);
            barv2.h = Boolean.FALSE;
        }
        Integer num2 = c.c;
        if (num2 != null) {
            num = barv2.i;
            if (num == null) {
                barv2 = barv2.a(num2.intValue());
            } else {
                barv2 = barv2.a(Math.min(num.intValue(), c.c.intValue()));
            }
        }
        num2 = c.d;
        if (num2 != null) {
            num = barv2.j;
            if (num == null) {
                barv2 = barv2.b(num2.intValue());
            } else {
                barv2 = barv2.b(Math.min(num.intValue(), c.d.intValue()));
            }
        }
        return barx.a(bauw, barv2);
    }

    private final bbeh c(bauw bauw) {
        bbeh bbeh;
        bbei bbei = (bbei) this.a.get();
        if (bbei == null) {
            bbeh = null;
        } else {
            bbeh = (bbeh) bbei.a.get(bauw.b);
        }
        if (bbeh != null || bbei == null) {
            return bbeh;
        }
        return (bbeh) bbei.b.get(bauw.c);
    }

    /* Access modifiers changed, original: final */
    public final bbgr a(bauw bauw) {
        bbeh c = c(bauw);
        return c != null ? c.e : bbgr.f;
    }

    /* Access modifiers changed, original: final */
    public final bbcf b(bauw bauw) {
        bbeh c = c(bauw);
        return c != null ? c.f : bbcf.d;
    }
}
