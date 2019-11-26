package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;

/* renamed from: kkq */
public final class kkq implements kkh {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;

    public kkq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10) {
        this.a = (bcaa) kkq.a(bcaa, 1);
        this.b = (bcaa) kkq.a(bcaa2, 2);
        this.c = (bcaa) kkq.a(bcaa3, 3);
        this.d = (bcaa) kkq.a(bcaa4, 4);
        this.e = (bcaa) kkq.a(bcaa5, 5);
        this.f = (bcaa) kkq.a(bcaa6, 6);
        this.g = (bcaa) kkq.a(bcaa7, 7);
        this.h = (bcaa) kkq.a(bcaa8, 8);
        this.i = (bcaa) kkq.a(bcaa9, 9);
        this.j = (bcaa) kkq.a(bcaa10, 10);
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

    public final /* synthetic */ kkg a(ViewGroup viewGroup) {
        ahcn ahcn = (ahcn) kkq.a((ahcn) this.a.get(), 1);
        aizy aizy = (aizy) kkq.a((aizy) this.b.get(), 2);
        bcaa bcaa = this.c;
        hih hih = (hih) kkq.a((hih) this.d.get(), 4);
        kkq.a((hml) this.e.get(), 5);
        return new kkp(ahcn, aizy, bcaa, hih, (Context) kkq.a((Context) this.f.get(), 6), (xci) kkq.a((xci) this.g.get(), 7), (aaas) kkq.a((aaas) this.h.get(), 8), (SharedPreferences) kkq.a((SharedPreferences) this.i.get(), 9), (akpi) kkq.a((akpi) this.j.get(), 10), (ViewGroup) kkq.a(viewGroup, 11));
    }
}
