package defpackage;

/* renamed from: weo */
public final class weo {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public weo(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) weo.a((Object) bcaa, 1);
        this.b = (bcaa) weo.a((Object) bcaa2, 2);
        this.c = (bcaa) weo.a((Object) bcaa3, 3);
        this.d = (bcaa) weo.a((Object) bcaa4, 4);
        this.e = (bcaa) weo.a((Object) bcaa5, 5);
    }

    public final wel a(aana aana, acvx acvx) {
        return new wel((akvz) weo.a((akvz) this.a.get(), 1), (xci) weo.a((xci) this.b.get(), 2), (xoi) weo.a((xoi) this.c.get(), 3), (wdn) weo.a((wdn) this.d.get(), 4), (akdk) this.e.get(), (aana) weo.a((Object) aana, 6), (acvx) weo.a((Object) acvx, 7));
    }

    private static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
