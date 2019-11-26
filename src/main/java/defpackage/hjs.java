package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;

/* renamed from: hjs */
public final class hjs {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;

    public hjs(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = (bcaa) hjs.a(bcaa, 1);
        this.b = (bcaa) hjs.a(bcaa2, 2);
        this.c = (bcaa) hjs.a(bcaa3, 3);
        this.d = (bcaa) hjs.a(bcaa4, 4);
        this.e = (bcaa) hjs.a(bcaa5, 5);
        this.f = (bcaa) hjs.a(bcaa6, 6);
        this.g = (bcaa) hjs.a(bcaa7, 7);
        this.h = (bcaa) hjs.a(bcaa8, 8);
    }

    public final hjr a(OfflineArrowView offlineArrowView) {
        Context context = (Context) hjs.a((Context) this.a.get(), 1);
        bcaa bcaa = this.b;
        hjs.a((hml) this.c.get(), 3);
        return new hjr(context, bcaa, (hih) hjs.a((hih) this.d.get(), 4), (ahcn) hjs.a((ahcn) this.e.get(), 5), (aaas) hjs.a((aaas) this.f.get(), 6), (acwa) hjs.a((acwa) this.g.get(), 7), (xci) hjs.a((xci) this.h.get(), 8), (OfflineArrowView) hjs.a(offlineArrowView, 9));
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
