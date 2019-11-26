package defpackage;

/* renamed from: alvj */
public final class alvj {
    public final xsc a;
    public final alvg b;
    public final acum c;
    public final int d;
    public final boolean e;
    public aowa f;
    private final alvh g;

    public alvj(xsc xsc, alvg alvg, acum acum, alvh alvh, alxx alxx) {
        this.a = xsc;
        this.b = alvg;
        this.c = acum;
        this.g = alvh;
        aycw aycw = ((aydm) alxx.get()).h;
        if (aycw == null) {
            aycw = aycw.e;
        }
        this.d = aycw.c;
        this.e = aycw.d;
    }

    public final void a(aowd aowd, long j) {
        int i = ((aowa) aowd.instance).c;
        aowd.copyOnWrite();
        aowa aowa = (aowa) aowd.instance;
        aowa.a |= 2;
        aowa.c = (int) (((long) i) + j);
        alvh alvh = this.g;
        if (alvh.c || alvh.d) {
            alvf.a();
            i = ((aowa) aowd.instance).f;
            aowd.copyOnWrite();
            aowa = (aowa) aowd.instance;
            aowa.a |= 16;
            aowa.f = (int) (((long) i) + j);
        }
        alvh = this.g;
        if (alvh.a || alvh.b) {
            alvf.a();
            i = ((aowa) aowd.instance).g;
            aowd.copyOnWrite();
            aowa aowa2 = (aowa) aowd.instance;
            aowa2.a |= 32;
            aowa2.g = (int) (((long) i) + j);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.f = null;
        if (!this.b.a.delete()) {
            afpc.a(2, afpf.system_health, "Unable to delete journal file");
        }
    }
}
