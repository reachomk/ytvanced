package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: wru */
public final class wru extends wrs {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    public wru(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = (bcaa) wru.a(bcaa, 1);
        this.b = (bcaa) wru.a(bcaa2, 2);
        this.c = (bcaa) wru.a(bcaa3, 3);
        this.d = (bcaa) wru.a(bcaa4, 4);
        this.e = (bcaa) wru.a(bcaa5, 5);
        this.f = (bcaa) wru.a(bcaa6, 6);
        this.g = (bcaa) wru.a(bcaa7, 7);
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
        return new wrt((Activity) wru.a((Activity) this.a.get(), 1), (akkq) wru.a((akkq) this.b.get(), 2), (akzb) wru.a((akzb) this.c.get(), 3), (aaas) wru.a((aaas) this.d.get(), 4), (akuh) wru.a((akuh) this.e.get(), 5), (wsa) wru.a((wsa) this.f.get(), 6), (acwa) wru.a((acwa) this.g.get(), 7), viewGroup);
    }
}
