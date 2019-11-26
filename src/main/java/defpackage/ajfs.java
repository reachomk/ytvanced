package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: ajfs */
public final class ajfs {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final bcaa h;

    public ajfs(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = (bcaa) ajfs.a(bcaa, 1);
        this.b = (bcaa) ajfs.a(bcaa2, 2);
        this.c = (bcaa) ajfs.a(bcaa3, 3);
        this.d = (bcaa) ajfs.a(bcaa4, 4);
        this.e = (bcaa) ajfs.a(bcaa5, 5);
        this.f = (bcaa) ajfs.a(bcaa6, 6);
        this.g = (bcaa) ajfs.a(bcaa7, 7);
        this.h = (bcaa) ajfs.a(bcaa8, 8);
    }

    public final ajfm a(awcq awcq, aakm aakm, String str, int i) {
        return new ajfm((afqv) ajfs.a((afqv) this.a.get(), 1), (Executor) ajfs.a((Executor) this.b.get(), 2), (Context) ajfs.a((Context) this.c.get(), 3), (tgv) ajfs.a((tgv) this.d.get(), 4), (afpu) ajfs.a((afpu) this.e.get(), 5), (xhv) ajfs.a((xhv) this.f.get(), 6), (afoi) ajfs.a((afoi) this.g.get(), 7), (zyw) ajfs.a((zyw) this.h.get(), 8), (awcq) ajfs.a(awcq, 9), (aakm) ajfs.a(aakm, 10), (String) ajfs.a(str, 11), i);
    }

    public final ajfm a(ajfq ajfq) {
        return new ajfm((afqv) ajfs.a((afqv) this.a.get(), 1), (Executor) ajfs.a((Executor) this.b.get(), 2), (Context) ajfs.a((Context) this.c.get(), 3), (tgv) ajfs.a((tgv) this.d.get(), 4), (afpu) ajfs.a((afpu) this.e.get(), 5), (xhv) ajfs.a((xhv) this.f.get(), 6), (afoi) ajfs.a((afoi) this.g.get(), 7), (zyw) ajfs.a((zyw) this.h.get(), 8), (ajfq) ajfs.a(ajfq, 9));
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
