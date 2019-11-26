package defpackage;

/* renamed from: zqs */
public final class zqs {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public zqs(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) zqs.a((Object) bcaa, 1);
        this.b = (bcaa) zqs.a((Object) bcaa2, 2);
        this.c = (bcaa) zqs.a((Object) bcaa3, 3);
    }

    public final zqm a(zqq zqq, zqo zqo) {
        return new zqm((acvx) zqs.a((acvx) this.a.get(), 1), (zqz) zqs.a((zqz) this.b.get(), 2), (aaxt) zqs.a((aaxt) this.c.get(), 3), (zqq) zqs.a((Object) zqq, 4), (zqo) zqs.a((Object) zqo, 5));
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
