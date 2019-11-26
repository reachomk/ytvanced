package defpackage;

import android.content.Context;

/* renamed from: wdz */
public final class wdz {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;

    public wdz(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6) {
        this.a = (bcaa) wdz.a(bcaa, 1);
        this.b = (bcaa) wdz.a(bcaa2, 2);
        this.c = (bcaa) wdz.a(bcaa3, 3);
        this.d = (bcaa) wdz.a(bcaa4, 4);
        this.e = (bcaa) wdz.a(bcaa5, 5);
        this.f = (bcaa) wdz.a(bcaa6, 6);
    }

    public final wdx a(akvy akvy, wei wei, ajsn ajsn, acvx acvx, boolean z) {
        return new wdx((Context) wdz.a((Context) this.a.get(), 1), (wlx) wdz.a((wlx) this.b.get(), 2), (wcv) wdz.a((wcv) this.c.get(), 3), (akso) wdz.a((akso) this.d.get(), 4), (akrx) wdz.a((akrx) this.e.get(), 5), (xoi) wdz.a((xoi) this.f.get(), 6), akvy, (wei) wdz.a(wei, 8), (ajsn) wdz.a(ajsn, 9), (acvx) wdz.a(acvx, 10), z);
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
