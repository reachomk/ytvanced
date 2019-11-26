package defpackage;

/* renamed from: aeen */
public final class aeen implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aeen(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aeen a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aeen(bcaa, bcaa2, bcaa3);
    }

    public static aajx a(aajk aajk, afjj afjj, afhg afhg) {
        return (aajx) baqd.a(new aajx(new aekd(afhg, aajk, afjj), new aajz[0]), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aeen.a((aajk) this.a.get(), (afjj) this.b.get(), (afhg) this.c.get());
    }
}
