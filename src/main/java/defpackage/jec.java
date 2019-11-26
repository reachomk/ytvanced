package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: jec */
public final class jec implements akox {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;

    public jec(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.a = (bcaa) jec.a(bcaa, 1);
        this.b = (bcaa) jec.a(bcaa2, 2);
        this.c = (bcaa) jec.a(bcaa3, 3);
        this.d = (bcaa) jec.a(bcaa4, 4);
        this.e = (bcaa) jec.a(bcaa5, 5);
    }

    /* renamed from: b */
    public final jdv a(ViewGroup viewGroup) {
        return new jdv((Context) jec.a((Context) this.a.get(), 1), (flu) jec.a((flu) this.b.get(), 2), (aaas) jec.a((aaas) this.c.get(), 3), (aldg) jec.a((aldg) this.d.get(), 4), (jdo) jec.a((jdo) this.e.get(), 5), viewGroup);
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
