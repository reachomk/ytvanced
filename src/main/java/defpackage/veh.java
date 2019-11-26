package defpackage;

/* renamed from: veh */
public final class veh implements baqa {
    private final bcaa a;
    private final bcaa b;

    private veh(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static veh a(bcaa bcaa, bcaa bcaa2) {
        return new veh(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new vef(this.a, this.b);
    }
}
