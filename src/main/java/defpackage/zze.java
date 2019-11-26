package defpackage;

/* renamed from: zze */
final class zze implements afmy {
    private final /* synthetic */ zzf a;

    zze(zzf zzf) {
        this.a = zzf;
    }

    public final afmr a() {
        return this.a.u();
    }

    public final afmx b() {
        return this.a.v();
    }

    public final aydc c() {
        aydc aydc;
        auya x = this.a.x();
        if ((x.b & 8192) != 0) {
            aydm aydm = x.B;
            if (aydm == null) {
                aydm = aydm.i;
            }
            aydc = aydm.f;
            if (aydc == null) {
                return aydc.d;
            }
        }
        aydc = null;
        return aydc;
    }

    public final afmj d() {
        aoqt aoqt = this.a.x().A;
        if (aoqt == null) {
            aoqt = aoqt.e;
        }
        return new zzk(aoqt);
    }

    public final afmz e() {
        apxn a = this.a.b.a();
        if (a != null) {
            aukm aukm = a.o;
            if (aukm == null) {
                aukm = aukm.c;
            }
            if ((aukm.a & 4) != 0) {
                aukm aukm2 = a.o;
                if (aukm2 == null) {
                    aukm2 = aukm.c;
                }
                argr argr = aukm2.b;
                if (argr == null) {
                    argr = argr.c;
                }
                return new afmz(argr);
            }
        }
        return new afmz(null);
    }
}
