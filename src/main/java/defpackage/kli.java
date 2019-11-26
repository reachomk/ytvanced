package defpackage;

import android.os.Handler;
import android.view.View;

/* renamed from: kli */
public final class kli {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public kli(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) kli.a(bcaa, 1);
        this.b = (bcaa) kli.a(bcaa2, 2);
        this.c = (bcaa) kli.a(bcaa3, 3);
        this.d = (bcaa) kli.a(bcaa4, 4);
        this.e = (bcaa) kli.a(bcaa5, 5);
        this.f = (bcaa) kli.a(bcaa6, 6);
    }

    public final klh a(View view) {
        return new klh((Handler) kli.a((Handler) this.a.get(), 1), (akkq) kli.a((akkq) this.b.get(), 2), (aaas) kli.a((aaas) this.c.get(), 3), (eur) kli.a((eur) this.d.get(), 4), (est) kli.a((est) this.e.get(), 5), (jnz) kli.a((jnz) this.f.get(), 6), (View) kli.a(view, 7));
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
