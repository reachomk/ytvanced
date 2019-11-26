package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kgy */
public final class kgy extends kgw {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public kgy(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) kgy.a(bcaa, 1);
        this.b = (bcaa) kgy.a(bcaa2, 2);
        this.c = (bcaa) kgy.a(bcaa3, 3);
        this.d = (bcaa) kgy.a(bcaa4, 4);
        this.e = (bcaa) kgy.a(bcaa5, 5);
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
        return new kgx((Context) kgy.a((Context) this.a.get(), 1), (akkq) kgy.a((akkq) this.b.get(), 2), (aaas) kgy.a((aaas) this.c.get(), 3), (akvo) kgy.a((akvo) this.d.get(), 4), (hmc) this.e.get(), viewGroup);
    }
}
