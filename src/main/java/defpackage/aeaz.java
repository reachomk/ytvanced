package defpackage;

import com.google.android.youtube.R;

/* renamed from: aeaz */
public final class aeaz implements akvp {
    public final int a(arwh arwh) {
        if (arwh == null) {
            return 0;
        }
        int ordinal = arwh.ordinal();
        if (ordinal != 176) {
            return ordinal != 177 ? 0 : R.drawable.ic_yt_cast_disconnected;
        } else {
            return R.drawable.ic_media_route_transparent_waves_off;
        }
    }
}
