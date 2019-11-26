package defpackage;

/* renamed from: vcm */
public final class vcm implements baqa {
    private final bcaa a;
    private final bcaa b;

    private vcm(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static vcm a(bcaa bcaa, bcaa bcaa2) {
        return new vcm(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        Object vdn;
        zyw zyw = (zyw) this.a.get();
        if (((vdj) this.b.get()).g()) {
            vdn = new vdn(zyw);
        } else {
            vdn = new vdm(zyw);
        }
        return (vdg) baqd.a(vdn, "Cannot return null from a non-@Nullable @Provides method");
    }
}
