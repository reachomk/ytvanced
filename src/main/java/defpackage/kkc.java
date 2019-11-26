package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;

/* renamed from: kkc */
public final class kkc implements kkh {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;

    public kkc(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = (bcaa) kkc.a(bcaa, 1);
        this.b = (bcaa) kkc.a(bcaa2, 2);
        this.c = (bcaa) kkc.a(bcaa3, 3);
        this.d = (bcaa) kkc.a(bcaa4, 4);
        this.e = (bcaa) kkc.a(bcaa5, 5);
        this.f = (bcaa) kkc.a(bcaa6, 6);
        this.g = (bcaa) kkc.a(bcaa7, 7);
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    public final /* synthetic */ kkg a(ViewGroup viewGroup) {
        return new kka((aaas) kkc.a((aaas) this.a.get(), 1), (akvp) kkc.a((akvp) this.b.get(), 2), (Context) kkc.a((Context) this.c.get(), 3), (xci) kkc.a((xci) this.d.get(), 4), (kzb) kkc.a((kzb) this.e.get(), 5), (xhv) kkc.a((xhv) this.f.get(), 6), (SharedPreferences) kkc.a((SharedPreferences) this.g.get(), 7), (ViewGroup) kkc.a(viewGroup, 8));
    }
}
