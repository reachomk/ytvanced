package defpackage;

import android.view.ViewGroup;

/* renamed from: iol */
public final class iol extends wsm {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public iol(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) iol.a(bcaa, 1);
        this.b = (bcaa) iol.a(bcaa2, 2);
        this.c = (bcaa) iol.a(bcaa3, 3);
        this.d = (bcaa) iol.a(bcaa4, 4);
        this.e = (bcaa) iol.a(bcaa5, 5);
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
        return new iom((nn) iol.a((nn) this.a.get(), 1), (akzb) iol.a((akzb) this.b.get(), 2), (aaas) iol.a((aaas) this.c.get(), 3), (akvp) iol.a((akvp) this.d.get(), 4), (akkq) iol.a((akkq) this.e.get(), 5), (ViewGroup) iol.a(viewGroup, 6));
    }
}
