package defpackage;

import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;

/* renamed from: hls */
public final class hls {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public hls(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) hls.a(bcaa, 1);
        this.b = (bcaa) hls.a(bcaa2, 2);
        this.c = (bcaa) hls.a(bcaa3, 3);
    }

    public final hlt a(int i, String str, OfflineArrowView offlineArrowView, OnClickListener onClickListener) {
        eki eki = (eki) hls.a((eki) this.a.get(), 1);
        bcaa bcaa = this.b;
        hls.a((hlr) this.c.get(), 3);
        return new hlt(eki, bcaa, i, str, (OfflineArrowView) hls.a(offlineArrowView, 6), onClickListener);
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
