package defpackage;

/* renamed from: aeel */
public final class aeel implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aeel(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aeel a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aeel(bcaa, bcaa2, bcaa3);
    }

    public static xsc a(zzl zzl, xvf xvf, afjb afjb) {
        awtm awtm;
        Object xvf2;
        if (zzl == null || zzl.b() == null) {
            awtm = awtm.x;
        } else {
            auuo auuo = zzl.b().k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            awtm = auuo.e;
            if (awtm == null) {
                awtm = awtm.x;
            }
        }
        int a = apxg.a(awtm.e);
        if (a == 0) {
            a = 1;
        }
        a--;
        if (!(a == 0 || a == 1)) {
            xvf2 = afjb;
        }
        return (xsc) baqd.a(xvf2, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aeel.a((zzl) this.a.get(), (xvf) this.b.get(), (afjb) this.c.get());
    }
}
