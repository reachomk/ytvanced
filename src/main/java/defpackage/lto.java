package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;

/* renamed from: lto */
public final class lto {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public lto(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = (bcaa) lto.a((Object) bcaa, 1);
        this.b = (bcaa) lto.a((Object) bcaa2, 2);
        this.c = (bcaa) lto.a((Object) bcaa3, 3);
        this.d = (bcaa) lto.a((Object) bcaa4, 4);
    }

    public final ltm a(LoadingFrameLayout loadingFrameLayout, boolean z) {
        return new ltm((Context) lto.a((Context) this.a.get(), 1), (eki) lto.a((eki) this.b.get(), 2), (xhv) lto.a((xhv) this.c.get(), 3), (akzb) lto.a((akzb) this.d.get(), 4), (LoadingFrameLayout) lto.a((Object) loadingFrameLayout, 5), z);
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
