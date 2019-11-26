package defpackage;

/* renamed from: aecn */
public final class aecn implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aecn(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aecn a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aecn(bcaa, bcaa2, bcaa3);
    }

    public static aeqy a(aajk aajk, zzl zzl, aeqz aeqz) {
        return (aeqy) baqd.a(new aeqy(aajk, zzl, aeqz), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aecn.a((aajk) this.a.get(), (zzl) this.b.get(), (aeqz) this.c.get());
    }
}
