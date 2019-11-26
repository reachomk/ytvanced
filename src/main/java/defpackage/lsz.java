package defpackage;

import android.content.Context;

/* renamed from: lsz */
public final class lsz {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    public lsz(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = (bcaa) lsz.a(bcaa, 1);
        this.b = (bcaa) lsz.a(bcaa2, 2);
        this.c = (bcaa) lsz.a(bcaa3, 3);
        this.d = (bcaa) lsz.a(bcaa4, 4);
        this.e = (bcaa) lsz.a(bcaa5, 5);
        this.f = (bcaa) lsz.a(bcaa6, 6);
        this.g = (bcaa) lsz.a(bcaa7, 7);
    }

    public final lsy a(axpw axpw) {
        return new lsy((Context) lsz.a((Context) this.a.get(), 1), (aaas) lsz.a((aaas) this.b.get(), 2), (ezg) lsz.a((ezg) this.c.get(), 3), (lud) lsz.a((lud) this.d.get(), 4), (akxm) lsz.a((akxm) this.e.get(), 5), (lta) lsz.a((lta) this.f.get(), 6), (akdk) lsz.a((akdk) this.g.get(), 7), (axpw) lsz.a(axpw, 8));
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
