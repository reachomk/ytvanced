package defpackage;

import android.view.View;

/* renamed from: etd */
public final class etd {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public etd(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) etd.a(bcaa, 1);
        this.b = (bcaa) etd.a(bcaa2, 2);
        this.c = (bcaa) etd.a(bcaa3, 3);
        this.d = (bcaa) etd.a(bcaa4, 4);
    }

    public final etb a(View view) {
        return new etb((aaas) etd.a((aaas) this.a.get(), 1), (akvp) etd.a((akvp) this.b.get(), 2), (xhv) etd.a((xhv) this.c.get(), 3), (akpi) etd.a((akpi) this.d.get(), 4), (View) etd.a(view, 5));
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
