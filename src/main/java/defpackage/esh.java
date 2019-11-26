package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: esh */
public final class esh implements akox {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    public esh(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = (bcaa) esh.a(bcaa, 1);
        this.b = (bcaa) esh.a(bcaa2, 2);
        this.c = (bcaa) esh.a(bcaa3, 3);
        this.d = (bcaa) esh.a(bcaa4, 4);
        this.e = (bcaa) esh.a(bcaa5, 5);
        this.f = (bcaa) esh.a(bcaa6, 6);
        this.g = (bcaa) esh.a(bcaa7, 7);
    }

    /* renamed from: b */
    public final ese a(ViewGroup viewGroup) {
        return new ese((Context) esh.a((Context) this.a.get(), 1), (aaas) esh.a((aaas) this.b.get(), 2), (ejw) esh.a((ejw) this.c.get(), 3), (akvp) esh.a((akvp) this.d.get(), 4), (esl) esh.a((esl) this.e.get(), 5), viewGroup);
    }

    public final ese c(ViewGroup viewGroup) {
        return new ese((Context) esh.a((Context) this.a.get(), 1), (aaas) esh.a((aaas) this.b.get(), 2), (ejw) esh.a((ejw) this.c.get(), 3), (akvp) esh.a((akvp) this.d.get(), 4), (esl) esh.a((esl) this.f.get(), 5), viewGroup, (byte) 0);
    }

    public final ese a(ViewGroup viewGroup, int i, int i2) {
        Context context = (Context) esh.a((Context) this.a.get(), 1);
        aaas aaas = (aaas) esh.a((aaas) this.b.get(), 2);
        ejw ejw = (ejw) esh.a((ejw) this.c.get(), 3);
        akvp akvp = (akvp) esh.a((akvp) this.d.get(), 4);
        esh.a((esl) this.g.get(), 5);
        return new ese(context, aaas, ejw, akvp, viewGroup, i, i2);
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
