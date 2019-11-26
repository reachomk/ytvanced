package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: jdw */
public final class jdw implements akox {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public jdw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) jdw.a(bcaa, 1);
        this.b = (bcaa) jdw.a(bcaa2, 2);
        this.c = (bcaa) jdw.a(bcaa3, 3);
        this.d = (bcaa) jdw.a(bcaa4, 4);
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
        return new jds((Context) jdw.a((Context) this.a.get(), 1), (aaas) jdw.a((aaas) this.b.get(), 2), (flu) jdw.a((flu) this.c.get(), 3), (hwl) jdw.a((hwl) this.d.get(), 4), viewGroup);
    }
}
