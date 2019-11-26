package defpackage;

import java.io.IOException;
import java.util.Map;

/* renamed from: aezc */
final class aezc implements afhi, owm {
    private final aajs a;
    private final Object b;
    private final aezw c;
    private final ovi d;
    private final ovm e;

    aezc(aajs aajs, Object obj, afhg afhg, String str, aezw aezw) {
        aajs aajs2 = aajs;
        this.a = aajs2;
        this.b = obj;
        this.c = aezw;
        this.d = afhg.a(this);
        aahr aahr = (aahr) aajs2.n.get(0);
        aahs a = aahr.a();
        a.a(str);
        long q = aahr.q();
        long r = aahr.r();
        if (!(q == -1 || r == -1)) {
            a.b(q);
        }
        this.e = new ovm(a.a(), 3, null, 0, 0, 1, null, 0);
    }

    public final void a() {
        try {
            this.d.a();
        } catch (IOException unused) {
        }
    }

    public final void b() {
        try {
            this.d.a(this.e);
        } finally {
            this.d.a();
        }
    }

    public final void a(Map map) {
        afja afja = new afja(map);
        Long a = afja.a();
        Long b = afja.b();
        if (b == null) {
            throw new afhy(this.e, "x-head-seqnum");
        } else if (a != null) {
            aahr aahr = (aahr) this.a.n.get(0);
            long q = aahr.q();
            long r = aahr.r();
            double s = aahr.s();
            long j = s > 0.0d ? (long) (s * 1000000.0d) : aezg.a;
            long p = aahr.p();
            try {
                aezk aezk = new aezk(a.longValue(), b.longValue(), q, r, -9223372036854775807L, j, p, ((long) this.a.f) * p, -9223372036854775807L, this.a.b(), this.a.g(), this.b);
                Object[] objArr = new Object[5];
                double longValue = (double) a.longValue();
                Double.isNaN(longValue);
                objArr[0] = Double.valueOf(longValue / 1000000.0d);
                objArr[1] = b;
                objArr[2] = Long.valueOf(q);
                objArr[3] = Long.valueOf(r);
                objArr[4] = aezk;
                this.c.a(aezk);
            } catch (aezn e) {
                this.c.a("tmln", new aetw(e.a));
                throw new afhy(this.e, null);
            }
        } else {
            throw new afhy(this.e, "x-head-time-millis");
        }
    }
}
