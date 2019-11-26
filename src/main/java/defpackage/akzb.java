package defpackage;

import android.widget.TextView;

/* renamed from: akzb */
public final class akzb {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public akzb(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) akzb.a(bcaa, 1);
        this.b = (bcaa) akzb.a(bcaa2, 2);
        this.c = (bcaa) akzb.a(bcaa3, 3);
    }

    public final akyy a(TextView textView) {
        return new akyy((aaas) akzb.a((aaas) this.a.get(), 1), (akvp) akzb.a((akvp) this.b.get(), 2), (akpi) this.c.get(), (TextView) akzb.a(textView, 4));
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
