package defpackage;

import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;

/* renamed from: hml */
public final class hml {
    public static hmi a(OfflineArrowView offlineArrowView, OnClickListener onClickListener) {
        return new hmi((OfflineArrowView) hml.a((Object) offlineArrowView, 1), (OnClickListener) hml.a((Object) onClickListener, 2));
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
