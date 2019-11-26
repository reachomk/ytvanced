package defpackage;

/* renamed from: vci */
public final class vci implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private vci(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static vci a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new vci(bcaa, bcaa2, bcaa3);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        this.a.get();
        this.b.get();
        return null;
    }
}
