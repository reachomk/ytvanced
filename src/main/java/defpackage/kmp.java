package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kmp */
public final class kmp extends kmm {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public kmp(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) kmp.a(bcaa, 1);
        this.b = (bcaa) kmp.a(bcaa2, 2);
        this.c = (bcaa) kmp.a(bcaa3, 3);
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
        return new kmk((Context) kmp.a((Context) this.a.get(), 1), (akkq) kmp.a((akkq) this.b.get(), 2), (kmc) kmp.a((kmc) this.c.get(), 3), (ViewGroup) kmp.a(viewGroup, 4));
    }
}
