package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: wny */
public final class wny {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public wny(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) wny.a(bcaa, 1);
        this.b = (bcaa) wny.a(bcaa2, 2);
        this.c = (bcaa) wny.a(bcaa3, 3);
    }

    public final wnw a(View view) {
        return new wnw((Context) wny.a((Context) this.a.get(), 1), (akvp) wny.a((akvp) this.b.get(), 2), (akkq) wny.a((akkq) this.c.get(), 3), (View) wny.a(view, 4));
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
