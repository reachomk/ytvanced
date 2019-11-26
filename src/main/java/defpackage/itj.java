package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

/* renamed from: itj */
public final class itj {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public itj(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) itj.a(bcaa, 1);
        this.b = (bcaa) itj.a(bcaa2, 2);
        this.c = (bcaa) itj.a(bcaa3, 3);
        this.d = (bcaa) itj.a(bcaa4, 4);
        this.e = (bcaa) itj.a(bcaa5, 5);
        this.f = (bcaa) itj.a(bcaa6, 6);
    }

    /* Access modifiers changed, original: final */
    public final ite a(ViewGroup viewGroup) {
        return new ite((Context) itj.a((Context) this.a.get(), 1), (akkq) itj.a((akkq) this.b.get(), 2), (aaas) itj.a((aaas) this.c.get(), 3), (akvo) itj.a((akvo) this.d.get(), 4), (Handler) itj.a((Handler) this.e.get(), 5), (akvp) itj.a((akvp) this.f.get(), 6), (ViewGroup) itj.a(viewGroup, 8));
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
