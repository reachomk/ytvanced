package defpackage;

/* renamed from: aklj */
public final class aklj implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private aklj(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static aklj a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new aklj(bcaa, bcaa2, bcaa3);
    }

    public final /* synthetic */ Object get() {
        Object obj;
        aort aort = (aort) this.a.get();
        bcaa bcaa = this.b;
        bcaa bcaa2 = this.c;
        if (aort.b) {
            obj = (akkq) bcaa.get();
        } else {
            obj = (akkq) bcaa2.get();
        }
        return (akkq) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
