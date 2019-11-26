package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aedj */
public final class aedj implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aedj(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aedj a(bcaa bcaa, bcaa bcaa2) {
        return new aedj(bcaa, bcaa2);
    }

    public static Executor a(Executor executor, avtc avtc) {
        int i = 1;
        if (!(avtc == null || (avtc.a & 67108864) == 0)) {
            aosx aosx = avtc.u;
            if (aosx == null) {
                aosx = aosx.c;
            }
            int a = aota.a(aosx.b);
            if (a != 0) {
                i = a;
            }
        }
        return (Executor) baqd.a(aekx.a(i, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aedj.a((Executor) this.a.get(), (avtc) this.b.get());
    }
}
