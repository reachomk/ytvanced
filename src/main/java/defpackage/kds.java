package defpackage;

import android.content.Context;

/* renamed from: kds */
public final class kds implements ffy {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public kds(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) kds.a(bcaa, 1);
        this.b = (bcaa) kds.a(bcaa2, 2);
        this.c = (bcaa) kds.a(bcaa3, 3);
        this.d = (bcaa) kds.a(bcaa4, 4);
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

    public final /* synthetic */ akot a(boolean z) {
        return new kdo((Context) kds.a((Context) this.a.get(), 1), (fhb) kds.a((fhb) this.b.get(), 2), (exr) kds.a((exr) this.c.get(), 3), (kdv) kds.a((kdv) this.d.get(), 4), z);
    }
}
