package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kgu */
public final class kgu extends kgv {
    private final bcaa a;
    private final bcaa b;

    public kgu(bcaa bcaa, bcaa bcaa2) {
        this.a = (bcaa) kgu.a(bcaa, 1);
        this.b = (bcaa) kgu.a(bcaa2, 2);
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

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        Context context = (Context) kgu.a((Context) this.a.get(), 1);
        aaas aaas = (aaas) kgu.a((aaas) this.b.get(), 2);
        kgu.a(viewGroup, 3);
        return new kgt(context, aaas);
    }
}
