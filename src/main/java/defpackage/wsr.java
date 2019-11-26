package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: wsr */
public final class wsr extends wso {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public wsr(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) wsr.a(bcaa, 1);
        this.b = (bcaa) wsr.a(bcaa2, 2);
        this.c = (bcaa) wsr.a(bcaa3, 3);
        this.d = (bcaa) wsr.a(bcaa4, 4);
        this.e = (bcaa) wsr.a(bcaa5, 5);
        this.f = (bcaa) wsr.a(bcaa6, 6);
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
        Context context = (Context) wsr.a((Context) this.a.get(), 1);
        akkq akkq = (akkq) wsr.a((akkq) this.b.get(), 2);
        aaas aaas = (aaas) wsr.a((aaas) this.c.get(), 3);
        akvp akvp = (akvp) wsr.a((akvp) this.d.get(), 4);
        akzb akzb = (akzb) wsr.a((akzb) this.e.get(), 5);
        wsr.a((xop) this.f.get(), 6);
        return new wsp(context, akkq, aaas, akvp, akzb, (ViewGroup) wsr.a(viewGroup, 7));
    }
}
