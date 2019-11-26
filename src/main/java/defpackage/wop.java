package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: wop */
public final class wop {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public wop(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) wop.a((Object) bcaa, 1);
        this.b = (bcaa) wop.a((Object) bcaa2, 2);
        this.c = (bcaa) wop.a((Object) bcaa3, 3);
        this.d = (bcaa) wop.a((Object) bcaa4, 4);
    }

    public final won a(aaas aaas, View view) {
        return new won((Context) wop.a((Context) this.a.get(), 1), (akkq) wop.a((akkq) this.b.get(), 2), (akvp) wop.a((akvp) this.c.get(), 3), (wok) wop.a((wok) this.d.get(), 4), (aaas) wop.a((Object) aaas, 5), view);
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
