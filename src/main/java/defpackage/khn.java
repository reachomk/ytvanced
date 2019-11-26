package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: khn */
public final class khn extends khk {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public khn(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) khn.a(bcaa, 1);
        this.b = (bcaa) khn.a(bcaa2, 2);
        this.c = (bcaa) khn.a(bcaa3, 3);
        this.d = (bcaa) khn.a(bcaa4, 4);
        this.e = (bcaa) khn.a(bcaa5, 5);
        this.f = (bcaa) khn.a(bcaa6, 6);
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
        return new khi((Context) khn.a((Context) this.a.get(), 1), (akkq) khn.a((akkq) this.b.get(), 2), (akvp) khn.a((akvp) this.c.get(), 3), (akop) khn.a((akop) this.d.get(), 4), (akzb) khn.a((akzb) this.e.get(), 5), (flu) khn.a((flu) this.f.get(), 6), (ViewGroup) khn.a(viewGroup, 7));
    }
}
