package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kdl */
public final class kdl extends kdj {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public kdl(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) kdl.a(bcaa, 1);
        this.b = (bcaa) kdl.a(bcaa2, 2);
        this.c = (bcaa) kdl.a(bcaa3, 3);
    }

    /* renamed from: b */
    public final kde a(ViewGroup viewGroup) {
        return new kde((Context) kdl.a((Context) this.a.get(), 1), (epv) kdl.a((epv) this.b.get(), 2), (akpe) kdl.a((akpe) this.c.get(), 3), (ViewGroup) kdl.a(viewGroup, 4));
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
