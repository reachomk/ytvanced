package defpackage;

/* renamed from: aeeg */
public final class aeeg implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aeeg(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aeeg a(bcaa bcaa, bcaa bcaa2) {
        return new aeeg(bcaa, bcaa2);
    }

    public static aelx a(avtc avtc, xsc xsc) {
        boolean z = false;
        if (avtc != null && avtc.s) {
            z = true;
        }
        return (aelx) baqd.a(new aelx(xsc, z), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aeeg.a((avtc) this.a.get(), (xsc) this.b.get());
    }
}
