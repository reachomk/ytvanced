package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: kxg */
public final class kxg {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public kxg(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) kxg.a(bcaa, 1);
        this.b = (bcaa) kxg.a(bcaa2, 2);
        this.c = (bcaa) kxg.a(bcaa3, 3);
    }

    public final kxe a(View view) {
        akzb akzb = (akzb) kxg.a((akzb) this.a.get(), 1);
        kxg.a((fau) this.b.get(), 2);
        return new kxe(akzb, (Context) kxg.a((Context) this.c.get(), 3), (View) kxg.a(view, 4));
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
