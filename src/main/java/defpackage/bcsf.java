package defpackage;

import java.util.Locale;

/* renamed from: bcsf */
public final class bcsf {
    public final bcsz a;
    public final bcsv b;
    public final Locale c;
    public final boolean d;
    public final bcpl e;
    public final bcpt f;
    public final Integer g;
    public final int h;

    public bcsf(bcsz bcsz, bcsv bcsv) {
        this.a = bcsz;
        this.b = bcsv;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 2000;
    }

    public bcsf(bcsz bcsz, bcsv bcsv, Locale locale, boolean z, bcpl bcpl, bcpt bcpt, Integer num, int i) {
        this.a = bcsz;
        this.b = bcsv;
        this.c = locale;
        this.d = z;
        this.e = bcpl;
        this.f = bcpt;
        this.g = num;
        this.h = i;
    }

    public final bcsf a() {
        bcpt bcpt = bcpt.a;
        return this.f != bcpt ? new bcsf(this.a, this.b, this.c, false, this.e, bcpt, this.g, this.h) : this;
    }

    public final String a(bcqe bcqe) {
        StringBuffer stringBuffer = new StringBuffer(b().a());
        long a = bcpo.a(bcqe);
        bcpl b = bcpo.b(bcqe);
        bcsz b2 = b();
        b = a(b);
        bcpt a2 = b.a();
        int b3 = a2.b(a);
        long j = (long) b3;
        long j2 = a + j;
        if ((a ^ j2) < 0 && (j ^ a) >= 0) {
            a2 = bcpt.a;
            b3 = 0;
            j2 = a;
        }
        b2.a(stringBuffer, j2, b.b(), b3, a2, this.c);
        return stringBuffer.toString();
    }

    private final bcsz b() {
        bcsz bcsz = this.a;
        if (bcsz != null) {
            return bcsz;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    public final bcpl a(bcpl bcpl) {
        bcpl = bcpo.a(bcpl);
        bcpl bcpl2 = this.e;
        if (bcpl2 != null) {
            bcpl = bcpl2;
        }
        bcpt bcpt = this.f;
        return bcpt != null ? bcpl.a(bcpt) : bcpl;
    }
}
