package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: epj */
public final class epj {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public epj(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) epj.a((Object) bcaa, 1);
        this.b = (bcaa) epj.a((Object) bcaa2, 2);
        this.c = (bcaa) epj.a((Object) bcaa3, 3);
    }

    public final eph a(epk epk, View view) {
        return new eph((akkq) epj.a((akkq) this.a.get(), 1), (Context) epj.a((Context) this.b.get(), 2), (akvp) epj.a((akvp) this.c.get(), 3), epk, (View) epj.a((Object) view, 5));
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
