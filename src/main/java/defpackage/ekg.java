package defpackage;

/* renamed from: ekg */
public final class ekg {
    private final bcaa a;
    private final bcaa b;

    public ekg(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) ekg.a(bcaa, 1);
        this.b = (bcaa) ekg.a(bcaa2, 2);
    }

    public final ekd a(String str, avsj avsj, bcaa bcaa, bcaa bcaa2, acvx acvx) {
        return new ekd((eki) ekg.a((eki) this.a.get(), 1), (ahcd) ekg.a((ahcd) this.b.get(), 2), (String) ekg.a(str, 3), avsj, (bcaa) ekg.a(bcaa, 5), (bcaa) ekg.a(bcaa2, 6), (acvx) ekg.a(acvx, 7));
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
