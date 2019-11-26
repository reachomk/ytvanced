package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;

/* renamed from: itg */
public final class itg {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public itg(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) itg.a((Object) bcaa, 1);
        this.b = (bcaa) itg.a((Object) bcaa2, 2);
        this.c = (bcaa) itg.a((Object) bcaa3, 3);
        this.d = (bcaa) itg.a((Object) bcaa4, 4);
        this.e = (bcaa) itg.a((Object) bcaa5, 5);
        this.f = (bcaa) itg.a((Object) bcaa6, 6);
    }

    /* Access modifiers changed, original: final */
    public final ita a(int i, ViewGroup viewGroup) {
        return new ita((Context) itg.a((Context) this.a.get(), 1), (akkq) itg.a((akkq) this.b.get(), 2), (aaas) itg.a((aaas) this.c.get(), 3), (akvo) itg.a((akvo) this.d.get(), 4), (Handler) itg.a((Handler) this.e.get(), 5), (akvp) itg.a((akvp) this.f.get(), 6), i, (ViewGroup) itg.a((Object) viewGroup, 8));
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
