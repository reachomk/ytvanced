package defpackage;

import android.view.View;

/* renamed from: eur */
public final class eur {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public eur(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) eur.a(bcaa, 1);
        this.b = (bcaa) eur.a(bcaa2, 2);
        this.c = (bcaa) eur.a(bcaa3, 3);
        this.d = (bcaa) eur.a(bcaa4, 4);
    }

    public final eus a(View view) {
        return new eus((ejo) eur.a((ejo) this.a.get(), 1), (etd) eur.a((etd) this.b.get(), 2), (eut) eur.a((eut) this.c.get(), 3), (evc) eur.a((evc) this.d.get(), 4), (View) eur.a(view, 5));
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
