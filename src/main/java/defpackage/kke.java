package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kke */
public final class kke implements kkh {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public kke(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) kke.a(bcaa, 1);
        this.b = (bcaa) kke.a(bcaa2, 2);
        this.c = (bcaa) kke.a(bcaa3, 3);
        this.d = (bcaa) kke.a(bcaa4, 4);
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
        return new kkf((akvp) kke.a((akvp) this.a.get(), 1), (fmx) kke.a((fmx) this.b.get(), 2), (Context) kke.a((Context) this.c.get(), 3), (akyz) kke.a((akyz) this.d.get(), 4), (ViewGroup) kke.a(viewGroup, 5));
    }
}
