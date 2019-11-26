package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: ipl */
public final class ipl extends ipi {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    public ipl(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = (bcaa) ipl.a(bcaa, 1);
        this.b = (bcaa) ipl.a(bcaa2, 2);
        this.c = (bcaa) ipl.a(bcaa3, 3);
        this.d = (bcaa) ipl.a(bcaa4, 4);
        this.e = (bcaa) ipl.a(bcaa5, 5);
        this.f = (bcaa) ipl.a(bcaa6, 6);
        this.g = (bcaa) ipl.a(bcaa7, 7);
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
        Context context = (Context) ipl.a((Context) this.a.get(), 1);
        akkq akkq = (akkq) ipl.a((akkq) this.b.get(), 2);
        aaas aaas = (aaas) ipl.a((aaas) this.c.get(), 3);
        ipl.a((ipn) this.d.get(), 4);
        return new ipg(context, akkq, aaas, (akvo) ipl.a((akvo) this.e.get(), 5), (acwa) ipl.a((acwa) this.f.get(), 6), (zyw) ipl.a((zyw) this.g.get(), 7), viewGroup);
    }
}
