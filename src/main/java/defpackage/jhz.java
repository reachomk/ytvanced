package defpackage;

import android.content.Context;

/* renamed from: jhz */
public final class jhz {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public jhz(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) jhz.a(bcaa, 1);
        this.b = (bcaa) jhz.a(bcaa2, 2);
        this.c = (bcaa) jhz.a(bcaa3, 3);
    }

    public final jhv a(akao akao, ajvy ajvy, jhy jhy, akyd akyd) {
        return new jhv((Context) jhz.a((Context) this.a.get(), 1), (akvz) jhz.a((akvz) this.b.get(), 2), (xci) jhz.a((xci) this.c.get(), 3), (akao) jhz.a(akao, 4), (ajvy) jhz.a(ajvy, 5), (jhy) jhz.a(jhy, 6), akyd);
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
