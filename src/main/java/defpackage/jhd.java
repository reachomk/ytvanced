package defpackage;

import android.content.Context;

/* renamed from: jhd */
public final class jhd {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public jhd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) jhd.a(bcaa, 1);
        this.b = (bcaa) jhd.a(bcaa2, 2);
        this.c = (bcaa) jhd.a(bcaa3, 3);
    }

    public final jhe a(akao akao, ajvy ajvy, jhy jhy, akyd akyd) {
        return new jhe((Context) jhd.a((Context) this.a.get(), 1), (akvz) jhd.a((akvz) this.b.get(), 2), (xci) jhd.a((xci) this.c.get(), 3), (akao) jhd.a(akao, 4), (ajvy) jhd.a(ajvy, 5), (jhy) jhd.a(jhy, 6), akyd);
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
