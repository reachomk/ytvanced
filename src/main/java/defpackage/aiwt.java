package defpackage;

/* renamed from: aiwt */
public final class aiwt implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aiwt(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aiwt a(bcaa bcaa, bcaa bcaa2) {
        return new aiwt(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return (aiwl) baqd.a(new aiwo((aiwh) this.b.get(), (amqv) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
