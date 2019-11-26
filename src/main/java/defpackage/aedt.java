package defpackage;

/* renamed from: aedt */
public final class aedt implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    private aedt(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
    }

    public static aedt a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        return new aedt(bcaa, bcaa2, bcaa3, bcaa4, bcaa5);
    }

    public static aefc a(amro amro, bcaa bcaa, afhh afhh, aenq aenq, aeez aeez) {
        return (aefc) baqd.a((Object) new aefc(amro, bcaa, afhh, aenq, aeez), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return aedt.a((amro) this.a.get(), this.b, (afhh) this.c.get(), (aenq) this.d.get(), (aeez) this.e.get());
    }
}
