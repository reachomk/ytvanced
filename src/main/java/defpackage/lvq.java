package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: lvq */
public final class lvq {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public lvq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) lvq.a(bcaa, 1);
        this.b = (bcaa) lvq.a(bcaa2, 2);
        this.c = (bcaa) lvq.a(bcaa3, 3);
    }

    public final lvl a(eif eif, bcaa bcaa, View view, ViewGroup viewGroup, ezm ezm, aux aux, lij lij, lkd lkd) {
        eif eif2 = eif;
        return new lvl((luf) lvq.a((luf) this.a.get(), 1), (lud) lvq.a((lud) this.b.get(), 2), (SharedPreferences) lvq.a((SharedPreferences) this.c.get(), 3), (eif) lvq.a(eif, 4), (bcaa) lvq.a(bcaa, 5), (View) lvq.a(view, 6), (ViewGroup) lvq.a(viewGroup, 7), ezm, aux, lij, lkd);
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
