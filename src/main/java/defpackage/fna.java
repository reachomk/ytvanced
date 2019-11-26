package defpackage;

import android.widget.TextView;

/* renamed from: fna */
public final class fna {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public fna(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) fna.a(bcaa, 1);
        this.b = (bcaa) fna.a(bcaa2, 2);
        this.c = (bcaa) fna.a(bcaa3, 3);
        this.d = (bcaa) fna.a(bcaa4, 4);
    }

    public final fnb a(TextView textView) {
        return new fnb((aaas) fna.a((aaas) this.a.get(), 1), (fmx) fna.a((fmx) this.b.get(), 2), (akvp) fna.a((akvp) this.c.get(), 3), (akpi) fna.a((akpi) this.d.get(), 4), (TextView) fna.a(textView, 5));
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
