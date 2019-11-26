package defpackage;

/* renamed from: oia */
final class oia implements ofu {
    private final /* synthetic */ oib a;

    public final ofx a(long j) {
        if (j == 0) {
            return new ofx(new ofz(0, this.a.a));
        }
        long b = this.a.c.b(j);
        oib oib = this.a;
        long j2 = oib.a;
        long j3 = oib.b;
        b = (((b * (j3 - j2)) / oib.d) - 30000) + j2;
        if (b < j2) {
            b = j2;
        }
        if (b >= j3) {
            b = -1 + j3;
        }
        return new ofx(new ofz(j, b));
    }

    public final boolean aS_() {
        return true;
    }

    public final long b() {
        oib oib = this.a;
        return oib.c.a(oib.d);
    }

    /* synthetic */ oia(oib oib) {
        this.a = oib;
    }
}
