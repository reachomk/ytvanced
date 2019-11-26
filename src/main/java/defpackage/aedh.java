package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aedh */
public final class aedh implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aedh(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aedh a(bcaa bcaa, bcaa bcaa2) {
        return new aedh(bcaa, bcaa2);
    }

    public static Executor a(Executor executor, aajk aajk) {
        aajj aajj = (aajj) aajk.get();
        int i = 1;
        if (aajj != null && aajj.i()) {
            aoth aoth = aajj.c.j;
            if (aoth == null) {
                aoth = aoth.k;
            }
            if ((aoth.a & 8) != 0) {
                aoth aoth2 = aajj.c.j;
                if (aoth2 == null) {
                    aoth2 = aoth.k;
                }
                aosx aosx = aoth2.d;
                if (aosx == null) {
                    aosx = aosx.c;
                }
                int a = aota.a(aosx.b);
                if (a != 0) {
                    i = a;
                }
            }
        }
        return (Executor) baqd.a(aekx.a(i, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aedh.a((Executor) this.a.get(), (aajk) this.b.get());
    }
}
