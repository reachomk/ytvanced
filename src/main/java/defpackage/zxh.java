package defpackage;

import java.util.concurrent.Executor;

/* renamed from: zxh */
public final class zxh implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    private zxh(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
    }

    public static zxh a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        return new zxh(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6);
    }

    public static xhf a(zxp zxp, xhi xhi, bqa bqa, xhl xhl, Executor executor, zya zya) {
        return (xhf) baqd.a(xhi.a(bqa, xhl, zxp.c, executor, zya), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zxh.a((zxp) this.a.get(), (xhi) this.b.get(), (bqa) this.c.get(), (xhl) this.d.get(), (Executor) this.e.get(), (zya) this.f.get());
    }
}
