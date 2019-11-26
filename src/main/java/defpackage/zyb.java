package defpackage;

/* renamed from: zyb */
public final class zyb implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private zyb(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static zyb a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new zyb(bcaa, bcaa2, bcaa3);
    }

    public static xhf a(zxp zxp, bcaa bcaa, bcaa bcaa2) {
        Object obj;
        if (zxp.f) {
            obj = (xhf) bcaa2.get();
        } else {
            obj = (xhf) bcaa.get();
        }
        return (xhf) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return zyb.a((zxp) this.a.get(), this.b, this.c);
    }
}
