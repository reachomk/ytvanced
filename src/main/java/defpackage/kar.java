package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kar */
public final class kar extends kao {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public kar(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) kar.a(bcaa, 1);
        this.b = (bcaa) kar.a(bcaa2, 2);
        this.c = (bcaa) kar.a(bcaa3, 3);
        this.d = (bcaa) kar.a(bcaa4, 4);
        this.e = (bcaa) kar.a(bcaa5, 5);
        this.f = (bcaa) kar.a(bcaa6, 6);
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
        return new kal((Context) kar.a((Context) this.a.get(), 1), (akkl) kar.a((akkl) this.b.get(), 2), (aaas) kar.a((aaas) this.c.get(), 3), (est) kar.a((est) this.d.get(), 4), (aklf) kar.a((aklf) this.e.get(), 5), (akvo) kar.a((akvo) this.f.get(), 6), viewGroup);
    }
}
