package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

/* renamed from: iti */
public final class iti {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public iti(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) iti.a((Object) bcaa, 1);
        this.b = (bcaa) iti.a((Object) bcaa2, 2);
        this.c = (bcaa) iti.a((Object) bcaa3, 3);
        this.d = (bcaa) iti.a((Object) bcaa4, 4);
        this.e = (bcaa) iti.a((Object) bcaa5, 5);
        this.f = (bcaa) iti.a((Object) bcaa6, 6);
    }

    /* Access modifiers changed, original: final */
    public final ith a(int i, ViewGroup viewGroup) {
        return new ith((Context) iti.a((Context) this.a.get(), 1), (akkq) iti.a((akkq) this.b.get(), 2), (aaas) iti.a((aaas) this.c.get(), 3), (akvo) iti.a((akvo) this.d.get(), 4), (Handler) iti.a((Handler) this.e.get(), 5), (akvp) iti.a((akvp) this.f.get(), 6), i, (ViewGroup) iti.a((Object) viewGroup, 8));
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
