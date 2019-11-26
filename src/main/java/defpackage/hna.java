package defpackage;

import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;

/* renamed from: hna */
public final class hna {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    public hna(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = (bcaa) hna.a(bcaa, 1);
        this.b = (bcaa) hna.a(bcaa2, 2);
        this.c = (bcaa) hna.a(bcaa3, 3);
    }

    public final hnb a(String str, OfflineArrowView offlineArrowView, boolean z, OnClickListener onClickListener) {
        eki eki = (eki) hna.a((eki) this.a.get(), 1);
        bcaa bcaa = this.b;
        hna.a((hlr) this.c.get(), 3);
        return new hnb(eki, bcaa, (String) hna.a(str, 4), (OfflineArrowView) hna.a(offlineArrowView, 5), z, onClickListener);
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
