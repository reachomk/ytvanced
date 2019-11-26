package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: ypz */
public final class ypz {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public ypz(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) ypz.a(bcaa, 1);
        this.b = (bcaa) ypz.a(bcaa2, 2);
        this.c = (bcaa) ypz.a(bcaa3, 3);
        this.d = (bcaa) ypz.a(bcaa4, 4);
    }

    public final ypw a(String str, yqc yqc, boolean z) {
        return new ypw((Context) ypz.a((Context) this.a.get(), 1), (Handler) ypz.a((Handler) this.b.get(), 2), (ywk) ypz.a((ywk) this.c.get(), 3), (ysc) ypz.a((ysc) this.d.get(), 4), (String) ypz.a(str, 5), (yqc) ypz.a(yqc, 6), z);
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
