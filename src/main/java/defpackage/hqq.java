package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: hqq */
public final class hqq implements eil {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public hqq(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) hqq.a(bcaa, 1);
        this.b = (bcaa) hqq.a(bcaa2, 2);
        this.c = (bcaa) hqq.a(bcaa3, 3);
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

    public final /* synthetic */ eij a(FrameLayout frameLayout) {
        return new hqo((Context) hqq.a((Context) this.a.get(), 1), (eki) hqq.a((eki) this.b.get(), 2), (akzb) hqq.a((akzb) this.c.get(), 3), (FrameLayout) hqq.a(frameLayout, 4));
    }
}
