package defpackage;

/* renamed from: spi */
public class spi {
    private final sns a;
    private final swz b;
    private final sxd c;
    private final boolean d;
    private final boolean e = false;

    public spi(sns sns, swz swz, sxd sxd, boolean z) {
        this.a = sns;
        this.b = swz;
        this.c = sxd;
        this.d = z;
    }

    public final cma a(cmg cmg, swk swk, swo swo, swp swp, bbmz bbmz, boolean z) {
        if (this.d || z) {
            return this.b.a(cmg, swk, swo.c(), swp, bbmz);
        }
        return this.a.a(cmg, swk, swo.b(), swp, bbmz);
    }

    public final cma a(cmg cmg, swk swk, byte[] bArr, bbmz bbmz) {
        if (this.d) {
            return this.b.a(cmg, swk, bArr, null, bbmz);
        }
        try {
            cmg = this.a.a(cmg, swk, bdhc.a(bArr), null, bbmz);
            return cmg;
        } catch (aocg e) {
            this.c.a(3, "Failed to parse Element", e);
            return (cza) cza.a(cmg).c();
        }
    }
}
